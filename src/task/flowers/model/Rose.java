package task.flowers.model;

public class Rose extends Flower {

    private int roseField;

    public Rose(int freshness, int stemLength, int roseField){
        this.name = "Rose";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 40;
        this.roseField = roseField;
    }
}
