package task.flowers.db;

import task.flowers.model.Rose;

import java.util.ArrayList;

public enum TableRose {
    R1(92, 32, 1),
    R2(83, 29, 2),
    R3(81, 31, 3);

    int freshness;
    int stemLength;
    int roseField;

    TableRose(int freshness, int stemLength, int roseField){
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.roseField = roseField;
    }

    static ArrayList<Rose> getRoses(){
        ArrayList<Rose> roses = new ArrayList<>();

        for(TableRose entry : TableRose.values()){
            roses.add(new Rose(entry.freshness, entry.stemLength, entry.roseField));
        }

        return roses;
    }
}
