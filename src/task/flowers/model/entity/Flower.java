package task.flowers.model.entity;

/**
 * @author Kseniia Burovetska
 * Abstract class. Inherited in Rose, Tulip, Narcissus classes
 */
public abstract class Flower {

    protected String name;
    protected int freshness;
    protected int stemLength;
    protected int cost;

    /**
     * Freshness getter
     * @return freshness
     */
    public int getFreshness(){
        return freshness;
    }

    /**
     * Stem length getter
     * @return stem length
     */
    public int getStemLength(){
        return stemLength;
    }

    /**
     * Cost getter
     * @return cost
     */
    public int getCost(){
        return cost;
    }
}
