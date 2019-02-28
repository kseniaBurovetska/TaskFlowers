package task.flowers.model;

public class Narciss extends Flower {



    public Narciss(int freshness){
        this.freshness = freshness;
        this.name = "Narciss";
        this.cost = 30;
        this.length = 15;
    }/*

    @Override
    void setCost(int cost) {
        this.cost = 30;
    }

    @Override
    void setName(String name) {
        this.name = "Narciss";
    }

    @Override
    void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    @Override
    void setLength(int length) {
        this. length = 15;
    }*/

    @Override
    public String toString() {
        return "Narciss{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }
}
