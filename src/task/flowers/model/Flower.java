package task.flowers.model;


public abstract class Flower {

    protected String name;
    protected int freshness;
    protected int length;
    protected int cost;

    abstract String growsIn();

    int getFreshness(){
        return freshness;
    }

    int getLength(){
        return length;
    }

    int getCost(){
        return cost;
    }

    @Override
    public String toString() {
        return name +
                ", freshness=" + freshness +
                ", length=" + length +
                ", cost=" + cost +", "+ growsIn();
    }
}
