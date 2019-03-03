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

    /**
     * Controller constructor
     * @param view
     */
    public Controller(View view) {
        this.view = view;
    }

    /**
     * Starts bouquet building.
     * Display results.
     */
    public void process() {
        Bouquet bouquet = new Bouquet();

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
