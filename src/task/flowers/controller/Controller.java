package task.flowers.controller;

import task.flowers.db.DBHandler;
import task.flowers.model.*;
import task.flowers.view.Constants;
import task.flowers.view.View;

import java.util.ArrayList;

public class Controller {

    private View view;
    private Builder builder;

    public Controller(View view, Builder builder){
        this.view = view;
        this.builder = builder;
    }

    public void process(){

        //testVoid();
        DBHandler dbHandler = new DBHandler();
        Bouquet bouquet = builder
                .buildFlowers(dbHandler.getFlowers())
                .buildAccessories(dbHandler.getAccessories())
                .build();

        view.printOutput(Constants.FLOWERS);
        view.printArray(bouquet.sortByFreshness().getFlowers());
        //view.printArray(bouquet.getFlowers());
        view.printOutput(Constants.ACCESSORIES);
        view.printArray(bouquet.getAccessories());
        view.printOutput(Constants.TOTAL_COST);
        view.printMessage(String.valueOf(bouquet.countCost()));

    }

    //TEST
    /*public void testVoid(){
        ArrayList<Flower> flowers = new ArrayList<>();
        ArrayList<Accessory> accessories = new ArrayList<>();

        flowers.add(new Rose(80));
        flowers.add(new Tulip(70));
        flowers.add(new Narcissus(82));

        accessories.add(new Accessory("Ribbon", 10));
        accessories.add(new Accessory("Paper Wrapper", 30));

        Bouquet bouquet = builder.buildFlowers(flowers)
                .buildAccessories(accessories)
                .build();

        view.printOutput(Constants.FLOWERS);
        view.printArray(bouquet.sortByFreshness().getFlowers());
        view.printOutput(Constants.ACCESSORIES);
        view.printArray(bouquet.getAccessories());
        view.printOutput(Constants.TOTAL_COST);
        view.printMessage(String.valueOf(bouquet.countCost()));
    }*/

}
