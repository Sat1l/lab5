package main.java.app;

import main.java.json.JsonParser;
import main.java.misc.FlatData;
import main.java.model.Flat;

import java.util.Collection;
import java.util.Formattable;
import java.util.HashSet;

public class CollectionManager {

    private Collection<Flat> collection = new HashSet<>();

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

    public Flat getFlatById(long id){
        for(Flat flat : collection){
            if (flat.getId() == id){
                return flat;
            }
        }
        return null;
    }

    public void updateById(long id, FlatData newFlat){
        collection.remove(getFlatById(id));
        Flat flat = new Flat(id, newFlat);
        collection.add(flat);
    }

    public void setCollection(Collection<Flat> collection){
        this.collection = collection;
        lastId = setLastId();
    }

    public long setLastId(){
        long id = 0L;
        for (Flat flat : collection){
            if (flat.getId() > id){
                id = flat.getId();
            }
        }
        return id;
    }
}
