package main.java.json;

import main.java.app.Converter;
import main.java.model.Flat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Map;

public class JsonWriter {

    public void write(Collection<Flat> rows){

        String filepath = "./data.json";

        StringBuilder data = new StringBuilder();
        data.append("[\n");


        for (Flat row : rows){
            String json = Converter.mapToJson(Converter.flatToMap(row));
            System.out.println(json);
            data.append(tabJson(json));
            System.out.println(tabJson(json));
        }
        data.deleteCharAt(data.length() - 1);
        data.append("\n]");
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filepath))){
            writer.write(data.toString());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private String tabJson(String json){
        String[] rows = json.split("\n");
        StringBuilder tabbedJson = new StringBuilder();
        for (String row : rows){
            tabbedJson.append("\n\t").append(row);
            System.out.println("\n\t" + row);
        }
        return tabbedJson.toString();
    }
}
