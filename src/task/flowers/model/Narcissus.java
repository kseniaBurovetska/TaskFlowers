package task.flowers.model;

public class Narcissus extends Flower {

    public Narcissus(int freshness){
        this.freshness = freshness;
        this.name = "Narcissus";
        this.cost = 30;
        this.length = 15;
    }

    @Override
    String growsIn() {
        return "Grows in North America";
    }
}
