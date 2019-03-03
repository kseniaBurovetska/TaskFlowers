package task.flowers.model;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Kseniia Burovetska
 * Used to create a Bouquet instance
 */
public class Builder {

    ArrayList<Flower> flowers;
    ArrayList<Accessory> accessories;

    /**
     * Sets a flower array in a bouquet
     * @param flowers
     * @return
     */
    public Builder buildFlowers(ArrayList<Flower> flowers) {
        this.flowers = new ArrayList<>();

        if (Objects.nonNull(flowers)) {
            this.flowers.addAll(flowers);
        } else {
            throw new NullPointerException("Flower array is null");
        }

        return this;
    }

    /**
     * Sets an accessories array in a bouquet
     * @param accessories
     * @return
     */
    public Builder buildAccessories(ArrayList<Accessory> accessories) {
        this.accessories = new ArrayList<>();

        if (Objects.nonNull(accessories)) {
            this.accessories.addAll(accessories);
        } else {
            throw new NullPointerException("Accessories array is null");
        }

        return this;
    }

    /**
     * Builds a final bouquet
     * @return
     */
    public Bouquet build() {
        Bouquet bouquet = new Bouquet(flowers, accessories);

        return bouquet;
    }
}
