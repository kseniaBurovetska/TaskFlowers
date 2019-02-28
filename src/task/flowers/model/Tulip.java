package task.flowers.model;

public class Tulip extends Flower {

    public Tulip(int freshness){
        this.freshness = freshness;
        this.name = "Tulip";
        this.cost = 20;
        this.length = 25;
    }

    /*@Override
    void setCost(int cost) {
        this.cost = 20;
    }

    @Override
    void setName(String name) {
        this.name = "Tulip";
    }

    @Override
    void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    @Override
    void setLength(int length) {
        this. length = 25;
    }*/

    @Override
    public String toString() {
        return "Tulip{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }
}
