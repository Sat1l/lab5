package main.java.app;

import main.java.misc.FlatData;
import main.java.model.Flat;

import java.util.Collection;
import java.util.HashSet;

public class CollectionManager {

    private final Collection<Flat> collection = new HashSet<>();

    private long lastId = 0;

    public Collection<Flat> getCollection() {
        return collection;
    }

    public void addFlat(FlatData flatData) {
        Flat flat = new Flat(newId(), flatData);
        collection.add(flat);
    }

    public long newId(){
        return ++lastId;
    }

}
