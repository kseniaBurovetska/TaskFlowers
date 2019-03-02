package task.flowers.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author Kseniia Burovetska
 * Bouquet class
 */
public class Bouquet {

    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Accessory> accessories = new ArrayList<>();

    /**
     * Flowers setter
     * @param flowerArrayList
     */
    public void addFlowers(ArrayList<Flower> flowerArrayList) {
        flowers.addAll(flowerArrayList);
    }

    /**
     * Accessories setter
     * @param accessoryArrayList
     */
    public void addAccessory(ArrayList<Accessory> accessoryArrayList) {
        accessories.addAll(accessoryArrayList);
    }

    /**
     * Flowers getter
     * @return arrayList of flowers
     */
    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    /**
     * Accessories getter
     * @return arrayList of accessories
     */
    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    /**
     * Calculates whole bouquet cost with accessories
     * @return cost
     */
    public int countCost() {
        return flowers.stream()
                .map(f -> f.getCost())
                .reduce(0, (sum, f) -> sum + f)
                + accessories.stream()
                .map(f -> f.getCost())
                .reduce(0, (sum, f) -> sum + f);
    }

    /**
     * Returns array sorted by freshness.
     * Doesn't change initial array.
     * @return flowers sorted by freshness
     */
    public ArrayList<Flower> sortByFreshness() {
        return flowers.stream()
                .sorted(Comparator.comparingInt(Flower::getFreshness).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Returns array of flowers which stem is in a given range
     * @param from low range bound
     * @param to top range bound
     * @return appropriate flowers array
     */
    public ArrayList<Flower> getByStemLength(int from, int to) {
        return flowers.stream()
                .filter(f -> ((f.getStemLength() >= from) && (f.getStemLength() <= to)))
                .collect(Collectors.toCollection(ArrayList::new));

    }

}
