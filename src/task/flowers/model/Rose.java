package task.flowers.model;

public class Rose extends Flower {

    public Rose(int freshness){
        this.freshness = freshness;
        this.name = "Rose";
        this.cost = 40;
        this.length = 30;
    }

    @Override
    String growsIn() {
        return "Grows in England";
    }
}
