package task.flowers.model.db;

import task.flowers.model.entity.Accessory;
import java.util.ArrayList;

/**
 * @author Kseniia Burovetska
 * Enum imitating table of accessories
 */
public enum TableAccessories {
    A1("Paper Wrapper", 30),
    A2("Red ribbons", 10),
    A3("White ribbons", 10),
    A4("Jewel pin", 30);

    private String name;
    private int cost;

    TableAccessories(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Parses enum values to arrayList
     * @return arrayList of accessories
     */
    static ArrayList<Accessory> parseAccessoriesDB() {
        ArrayList<Accessory> accessories = new ArrayList<>();

        for (TableAccessories entry : TableAccessories.values()) {
            accessories.add(new Accessory(entry.name, entry.cost));
        }

        return accessories;
    }

}
