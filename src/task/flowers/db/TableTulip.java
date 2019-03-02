package task.flowers.db;

import task.flowers.model.Tulip;

import java.util.ArrayList;

public enum TableTulip {
    T1(91, 23, 0.5),
    T2(70, 21, 0.4),
    T3(98, 25, 0.3);

    int freshness;
    int stemLength;
    double tulipField;

    TableTulip(int freshness, int stemLength, double tulipField) {
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.tulipField = tulipField;
    }

    static ArrayList<Tulip> getTulips() {
        ArrayList<Tulip> tulips = new ArrayList<>();

        for (TableTulip entry : TableTulip.values()) {
            tulips.add(new Tulip(entry.freshness, entry.stemLength, entry.tulipField));
        }

        return tulips;
    }
}
