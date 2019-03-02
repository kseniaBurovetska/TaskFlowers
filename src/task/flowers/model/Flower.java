package task.flowers.model;


public abstract class Flower {

    protected String name;
    protected int freshness;
    protected int stemLength;
    protected int cost;

    int getFreshness(){
        return freshness;
    }

    int getStemLength(){
        return stemLength;
    }

    int getCost(){
        return cost;
    }

    @Override
    public String toString() {
        return name +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", cost=" + cost;
    }
}
