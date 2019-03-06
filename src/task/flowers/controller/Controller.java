package task.flowers.controller;

import task.flowers.model.db.DBHandler;
import task.flowers.model.*;
import task.flowers.view.Constants;
import task.flowers.view.View;

/**
 * @author Kseniia Burovetska
 * Controller class
 */
public class Controller {

    private View view;
    private DBHandler dbHandler;

    /**
     * Controller constructor
     *
     * @param view
     * @param dbHandler
     */
    public Controller(View view, DBHandler dbHandler) {
        this.view = view;
        this.dbHandler = dbHandler;
    }

    /**
     * Starts bouquet building.
     * Display results.
     */
    public void process() {
        Bouquet bouquet;

        try {
            bouquet = new Bouquet(dbHandler.getFlowers(), dbHandler.getAccessories());
        } catch (NullPointerException e) {
            view.printError(Constants.ERROR_BOUQUET);
            return;
        }

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
