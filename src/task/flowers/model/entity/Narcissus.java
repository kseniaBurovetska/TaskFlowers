package task.flowers.model.entity;

/**
 * @author Kseniia Burovetska
 * Narcissus class, extends Flower
 */
public class Narcissus extends Flower {

    /**Created to artificially describe hierarchy */
    private String narcissusField;

    /**
     * Narcissus constructor
     * @param freshness flower freshness
     * @param stemLength flower stem length
     * @param narcissusField artificial local field
     */
    public Narcissus(int freshness, int stemLength, String narcissusField) {
        this.name = "Narcissus";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 30;
        this.narcissusField = narcissusField;
    }

    /**
     * Getter for a local field
     * @return String flower field
     */
    @Override
    public String getLocalField() {
        return narcissusField;
    }
}
