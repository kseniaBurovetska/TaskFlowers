package task.flowers.model;

import java.util.ArrayList;

public class Builder {

    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Accessory> accessories = new ArrayList<>();

    public Builder buildFlowers(ArrayList<Flower> flowers){
        this.flowers.addAll(flowers);
        return this;
    }

    public Builder buildAccessories(ArrayList<Accessory> accessories){
        this.accessories.addAll(accessories);
        return this;
    }

    public Bouquet build(){
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(flowers);
        bouquet.addAccessory(accessories);
        return bouquet;
    }
}
