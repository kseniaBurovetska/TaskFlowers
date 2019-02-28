package task.flowers.controller;

import task.flowers.model.*;
import task.flowers.view.View;

import java.util.ArrayList;

public class Controller {

    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void process(){

        testVoid();

    }

    //TEST
    public void testVoid(){
        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.add(new Rose(80));
        flowers.add(new Rose(60));
        flowers.add(new Rose(75));
        flowers.add(new Tulip(70));
        flowers.add(new Tulip(81));
        flowers.add(new Tulip(93));
        flowers.add(new Narciss(60));
        flowers.add(new Narciss(90));
        flowers.add(new Narciss(82));

        flowers.stream()
                .forEach(System.out::println);

        Bouquet bouquet = new Bouquet(flowers);
        System.out.println(bouquet.countCost());


        view.printArray(bouquet.filter());
    }

}
