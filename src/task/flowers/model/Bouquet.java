package task.flowers.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bouquet {

    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Accessory> accessories = new ArrayList<>();

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

    public ArrayList<Flower> getByStemLength(int from, int to) {
        return flowers.stream()
                .filter(f -> (f.getStemLength() >= from && f.getStemLength() <= to))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public Flower getFlowerByStemLength(int from, int to) {
        return flowers.stream()
                .filter(f -> (f.getStemLength() >= from && f.getStemLength() <= to))
                .findFirst()
                .get();

    }

}
