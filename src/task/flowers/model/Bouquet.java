package task.flowers.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bouquet {

    private List<Flower> flowers = new ArrayList<>();
    private List<Accessory> accessories = new ArrayList<>();

    public Bouquet() {

    }

    public Bouquet(List<Flower> flowers) {
        this(flowers, null);
    }

    public Bouquet(List<Flower> flowers, List<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public void addFlowers(List<Flower> flowerArrayList) {
        flowers.addAll(flowerArrayList);
    }

    public void addAccessory(List<Accessory> accessoryArrayList) {
        accessories.addAll(accessoryArrayList);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
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
        /*flowers = flowers.stream()
                .sorted(Comparator.comparingInt(Flower::getFreshness).reversed())
                .collect(Collectors.toList());*/
        return this;
    }

}
