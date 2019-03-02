package task.flowers.model;

public class Rose extends Flower {

    /**Created to artificially describe hierarchy */
    private int roseField;

    /**
     * Rose constructor
     * @param freshness
     * @param stemLength
     * @param roseField
     */
    public Rose(int freshness, int stemLength, int roseField) {
        this.name = "Rose";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 40;
        this.roseField = roseField;
    }

    @Override
    public String toString() {
        return name +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", cost=" + cost +
                ", roseField=" + roseField;
    }
}
