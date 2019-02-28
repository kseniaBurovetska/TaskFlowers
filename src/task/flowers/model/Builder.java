package task.flowers.model;

import java.util.ArrayList;

public class Builder {

    public Bouquet assembleBuquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories){
        Bouquet bouquet = new Bouquet();

        bouquet.addFlowers(flowers);
        bouquet.addAccessory(accessories);


        return bouquet;
    }

}
