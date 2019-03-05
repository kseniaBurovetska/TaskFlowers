package task.flowers.model.entity;

/**
 * @author Kseniia Burovetska
 * Accessory class
 */
public class Accessory {

    private String name;
    private int cost;

    /**
     * Accessory constructor
     * @param name
     * @param cost
     */
    public Accessory(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Cost getter
     * @return cost
     */
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name +
                ", cost=" + cost;
    }
}
