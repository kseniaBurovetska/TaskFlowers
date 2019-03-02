package task.flowers.model;

public class Narcissus extends Flower {

    private String narcissusField;

    public Narcissus(int freshness, int stemLength, String narcissusField){
        this.name = "Narcissus";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 30;
        this.narcissusField = narcissusField;
    }
}
