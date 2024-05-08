package main.java.json;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import main.java.app.App;
import main.java.app.Converter;
import main.java.misc.FlatData;
import main.java.misc.ParsedFlatData;
import main.java.model.Coordinates;
import main.java.model.Flat;
import main.java.type.adapters.LocalDateTypeAdapter;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class JsonParser {

    public Collection<Flat> parse() {
        String filepath = "./data.json";
//        String filepath = App.getInstance().getDataPath();
        Collection<ParsedFlatData> collection;
        Collection<Flat> flats = new HashSet<>();

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filepath));

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                    .create();
            collection = gson.fromJson(
                    new InputStreamReader(bis),
                    new TypeToken<Collection<ParsedFlatData>>() {
                    }.getType()
            );

            for (ParsedFlatData parsedFlatData : collection){
                flats.add(Converter.parsedToRealFlat(parsedFlatData));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }

        return flats;
    }
}
