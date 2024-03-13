package main.java.json;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import main.java.model.Flat;
import main.java.type.adapters.LocalDateTypeAdapter;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.time.LocalDate;
import java.util.Collection;

public class JsonParser {

    public Collection<Flat> parse() {
        String filepath = "./data.json";
        Collection<Flat> collection;

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filepath));

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                    .create();
            collection = gson.fromJson(
                    new InputStreamReader(bis),
                    new TypeToken<Collection<Flat>>() {
                    }.getType()
            );

        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }

        return collection;
    }
}
