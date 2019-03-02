package task.flowers.db;

import task.flowers.model.Accessory;
import task.flowers.model.Flower;

import java.util.ArrayList;

public class DBHandler {

    public ArrayList<Accessory> getAccessories(){
        return TableAccessories.parseAccessoriesDB();
    }

    public ArrayList<Flower> getFlowers(){
        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.addAll(TableRose.getRoses());
        flowers.addAll(TableTulip.getTulips());
        flowers.addAll(TableNarcissus.getNarcisses());

        return flowers;
    }
}
