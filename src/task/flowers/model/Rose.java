package task.flowers.model;

public class Rose extends Flower {

    public Rose(int freshness){
        this.freshness = freshness;
        this.name = "Rose";
        this.cost = 40;
        this.length = 30;
    }

    /*@Override
    void setCost(int cost) {
        this.cost = 40;
    }

    @Override
    void setName(String name) {
        this.name = "Rose";
    }

    @Override
    void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    @Override
    void setLength(int length) {
        this.length = 30;
    }
*/
    @Override
    public String toString() {
        return "Rose{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", freshness=" + freshness +
                ", length=" + length +
                '}';
    }
}
