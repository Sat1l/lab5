package main.java.json;

import main.java.app.Converter;
import main.java.model.Flat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

public class JsonParser {

    public Collection<Flat> parse(){
        String filepath = "./data.json";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                data.append(line);
            }
            String json = data.toString();
            return Converter.jsonToFlats(json);
        } catch (IOException e){
            e.printStackTrace();


    }
}
