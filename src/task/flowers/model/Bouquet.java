package task.flowers.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bouquet {

    ArrayList<Flower> flowers = new ArrayList<>();
    ArrayList<Accessory> accessories = new ArrayList<>();

    public Bouquet(){

    }

    public Bouquet(ArrayList<Flower> flowers){
        this(flowers, null);
    }

    public Bouquet(ArrayList<Flower> flowers, ArrayList<Accessory> accessories){
        this.flowers = flowers;
        this.accessories = accessories;
    }


    public void addFlowers(ArrayList<Flower> flowerArrayList){
        flowers.addAll(flowerArrayList);
    }

    public void addAccessory(ArrayList<Accessory> accessoryArrayList){
        accessories.addAll(accessoryArrayList);
    }

    public int countCost(){
        int cost = flowers.stream()
                .map(f -> f.getCost())
                .reduce(0, (sum, f) -> sum+f);

        return cost;
    }

    public List<Flower> filter(){
        return flowers.stream()
                .sorted(Comparator.comparingInt(Flower::getFreshness).reversed())
                .collect(Collectors.toList());
    }

}
