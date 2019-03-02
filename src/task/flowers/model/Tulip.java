package task.flowers.model;

public class Tulip extends Flower {

    private double tulipField;

    public Tulip(int freshness, int stemLength, double tulipField){
        this.name = "Tulip";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 20;
        this.tulipField = tulipField;
    }
}
