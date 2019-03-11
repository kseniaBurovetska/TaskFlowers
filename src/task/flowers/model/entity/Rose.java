package task.flowers.model.entity;

public class Rose extends Flower {

    /**Created to artificially describe hierarchy */
    private int roseField;

    /**
     * Rose constructor
     * @param freshness flower freshness
     * @param stemLength flower stem length
     * @param roseField artificial local field
     */
    public Rose(int freshness, int stemLength, int roseField) {
        this.name = "Rose";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 40;
        this.roseField = roseField;
    }

    /**
     * Getter for a local field
     * @return Integer flower field
     */
    @Override
    public Integer getLocalField() {
        return roseField;
    }
}
