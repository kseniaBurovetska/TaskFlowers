package task.flowers.model;


public abstract class Flower {

    protected int cost;
    protected String name;
    protected int freshness;
    protected int length;

    //abstract void setCost(int cost);
    int getCost(){
        return cost;
    }

    //abstract void setName(String name);
    String getName(){
        return name;
    }

    //abstract void setFreshness(int freshness);
    int getFreshness(){
        return freshness;
    }

    //abstract void setLength(int length);
    int getLength(){
        return length;
    }

}
