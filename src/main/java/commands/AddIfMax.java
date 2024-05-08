package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.app.DataFetcher;
import main.java.misc.FlatData;
import main.java.misc.ValueCalc;
import main.java.model.Flat;

import java.util.HashSet;

public class AddIfMax extends Command{
    @Override
    public void call(String arg) {
        DataFetcher dataFetcher = new DataFetcher();
        CollectionManager collectionManager = App.getInstance().getCollectionManager();
        FlatData flatData = dataFetcher.fetch();
        int value = ValueCalc.evaluate(flatData);
        int count = 0;
        for (Flat flat : collectionManager.getCollection()){
            if (ValueCalc.evaluate(flat) > value){
                count+=1;
            }
        }
        if (count == 0){
            collectionManager.addFlat(flatData);
        } else {
            System.out.println("submitted element will not be the max element in collection");
        }
    }

    @Override
    public String getDescription() {
        return "adds element to collection if it's value exceeds the max one of the collection";
    }
}
