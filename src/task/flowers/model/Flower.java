package task.flowers.model;

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
    int getFreshness(){
        return freshness;
    }

    /**
     * Stem length getter
     * @return stem length
     */
    int getStemLength(){
        return stemLength;
    }

    /**
     * Cost getter
     * @return cost
     */
    int getCost(){
        return cost;
    }
}
