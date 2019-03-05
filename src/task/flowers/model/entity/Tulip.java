package task.flowers.model.entity;

public class Tulip extends Flower {

    /**Created to artificially describe hierarchy */
    private double tulipField;

    /**
     * Tulip constructor
     * @param freshness
     * @param stemLength
     * @param tulipField
     */
    public Tulip(int freshness, int stemLength, double tulipField) {
        this.name = "Tulip";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 20;
        this.tulipField = tulipField;
    }

    @Override
    public String toString() {
        return name +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", cost=" + cost +
                ", tulipField=" + tulipField;
    }
}
