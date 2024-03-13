package main.java.app;

import main.java.model.Flat;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class Converter {
    public static Map<String, Object> flatToMap(Flat flat){
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("id", flat.getId());
        data.put("name", flat.getName());
        data.put("coordinatesX", flat.getCoordinates().getX());
        data.put("coordinatesY", flat.getCoordinates().getY());
        data.put("creationDate", flat.getCreationDate());
        data.put("area", flat.getArea());
        data.put("numberOfRooms", flat.getNumberOfRooms());
        data.put("balcony", flat.isBalcony());
        data.put("timeToMetroOnFoot", flat.getTimeToMetroOnFoot());
        data.put("view", flat.getView());
        data.put("houseName", flat.getHouse().getName());
        data.put("houseYear", flat.getHouse().getYear());
        data.put("houseNumberOfLifts", flat.getHouse().getNumberOfLifts());
        return data;
    }

    public static String mapToJson(Map<String, Object> map){
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        for (Map.Entry<String, Object> entry : map.entrySet()){
            json.append("\t\"").append(entry.getKey()).append("\":");
            if ((entry.getValue() instanceof Boolean) || (entry.getValue() instanceof Integer)){
                json.append(entry.getValue());
            } else {
                json.append("\"").append(entry.getValue()).append("\"");
            }
            json.append(",\n");
        }
        json.deleteCharAt(json.length() - 2);
        json.append("},\n");
        return json.toString();
    }

    public static String tabJson(String json){
        String[] rows = json.split("\n");
        StringBuilder tabbedJson = new StringBuilder();
        for (String row : rows){
            tabbedJson.append("\n\t").append(row);
        }
        return tabbedJson.toString();
    }

}
