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
     * @param freshness
     * @param stemLength
     * @param narcissusField
     */
    public Narcissus(int freshness, int stemLength, String narcissusField) {
        this.name = "Narcissus";
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = 30;
        this.narcissusField = narcissusField;
    }

    @Override
    public String toString() {
        return name +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", cost=" + cost +
                ", narcissusField=" + narcissusField;
    }
}
