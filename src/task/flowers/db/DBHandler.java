package task.flowers.db;

import task.flowers.model.Accessory;
import task.flowers.model.Flower;
import java.util.ArrayList;

/**
 * @author Kseniia Burovetska
 * DBHandler class created to manage imitated database
 */
public class DBHandler {

    /**
     * Parses accessories from TableAccessories
     * @return arrayList of Accessory objects
     */
    public ArrayList<Accessory> getAccessories(){
        return TableAccessories.parseAccessoriesDB();
    }

    /**
     * Parses all 3 kind of flowers
     * @return arrayList of Flower objects
     */
    public ArrayList<Flower> getFlowers(){
        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.addAll(TableRose.getRoses());
        flowers.addAll(TableTulip.getTulips());
        flowers.addAll(TableNarcissus.getNarcisses());

        return flowers;
    }
}
