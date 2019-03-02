package task.flowers.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Bouquet {

    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Accessory> accessories = new ArrayList<>();

    public Bouquet() {

    }

    public Bouquet(ArrayList<Flower> flowers) {
        this(flowers, null);
    }

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public void addFlowers(ArrayList<Flower> flowerArrayList) {
        flowers.addAll(flowerArrayList);
    }

    public void addAccessory(ArrayList<Accessory> accessoryArrayList) {
        accessories.addAll(accessoryArrayList);
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public int countCost() {
        int cost = flowers.stream()
                .map(f -> f.getCost())
                .reduce(0, (sum, f) -> sum + f)
                + accessories.stream()
                .map(f -> f.getCost())
                .reduce(0, (sum, f) -> sum + f);

        return cost;
    }

    public Bouquet sortByFreshness() {
        flowers.sort(Comparator.comparingInt(Flower::getFreshness).reversed());

        return this;
    }

}
