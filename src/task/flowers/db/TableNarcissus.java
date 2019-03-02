package task.flowers.db;

import task.flowers.model.Narcissus;

import java.util.ArrayList;

public enum TableNarcissus {
    N1(73, 18, "a"),
    N2(52, 20, "b"),
    N3(88, 19, "c");

    int freshness;
    int stemLength;
    String narcissusField;

    TableNarcissus(int freshness, int stemLength, String narcissusField) {
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.narcissusField = narcissusField;
    }

    static ArrayList<Narcissus> getNarcisses() {
        ArrayList<Narcissus> narcisses = new ArrayList<>();

        for (TableNarcissus entry : TableNarcissus.values()) {
            narcisses.add(new Narcissus(entry.freshness, entry.stemLength, entry.narcissusField));
        }

        return narcisses;
    }
}
