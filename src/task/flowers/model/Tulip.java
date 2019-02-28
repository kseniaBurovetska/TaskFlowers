package task.flowers.model;

public class Tulip extends Flower {

    public Tulip(int freshness){
        this.freshness = freshness;
        this.name = "Tulip";
        this.cost = 20;
        this.length = 25;
    }

    @Override
    String growsIn() {
        return "Grows in Holland";
    }
}
