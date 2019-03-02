package task.flowers.db;

import task.flowers.model.Accessory;

import java.util.ArrayList;

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

    static ArrayList<Accessory> parseAccessoriesDB() {
        ArrayList<Accessory> accessories = new ArrayList<>();

        for (TableAccessories entry : TableAccessories.values()) {
            accessories.add(new Accessory(entry.name, entry.cost));
        }

        return accessories;
    }

}
