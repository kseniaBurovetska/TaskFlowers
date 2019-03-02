package task.flowers.controller;

import task.flowers.db.DBHandler;
import task.flowers.model.*;
import task.flowers.view.Constants;
import task.flowers.view.View;

/**
 * @author Kseniia Burovetska
 * Controller class
 */
public class Controller {

    private View view;
    private Builder builder;

    /**
     * Controller constructor
     * @param view
     * @param builder
     */
    public Controller(View view, Builder builder) {
        this.view = view;
        this.builder = builder;
    }

    /**
     * Starts bouquet building.
     * Display results.
     */
    public void process() {
        DBHandler dbHandler = new DBHandler();

        Bouquet bouquet = builder
                .buildFlowers(dbHandler.getFlowers())
                .buildAccessories(dbHandler.getAccessories())
                .build();

        view.printOutput(Constants.FLOWERS);
        view.printArray(bouquet.getFlowers());

        view.printOutput(Constants.FLOWERS);
        view.printArray(bouquet.sortByFreshness());

        view.printOutput(Constants.ACCESSORIES);
        view.printArray(bouquet.getAccessories());

        view.printOutput(Constants.TOTAL_COST);
        view.printMessage(String.valueOf(bouquet.countCost()));

        view.printOutput(Constants.STEM_LENGTH);
        view.printMessage(String.valueOf(Constants.LOW), ";", String.valueOf(Constants.TOP));
        view.printArray(bouquet.getByStemLength(Constants.LOW, Constants.TOP)); // 19, 22
    }

}
