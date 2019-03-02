package task.flowers.controller;

import task.flowers.db.DBHandler;
import task.flowers.model.*;
import task.flowers.view.Constants;
import task.flowers.view.View;

public class Controller {

    private View view;
    private Builder builder;

    public Controller(View view, Builder builder) {
        this.view = view;
        this.builder = builder;
    }

    public void process() {
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

        view.printOutput(Constants.STEM_LENGTH);
        view.printArray(bouquet.getByStemLength(21, 23));

        view.printOutput(Constants.STEM_LENGTH);
        view.printMessage(bouquet.getFlowerByStemLength(21, 23).toString());
    }

}
