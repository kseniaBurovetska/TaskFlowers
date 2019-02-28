package task.flowers;

import task.flowers.controller.Controller;
import task.flowers.view.View;

public class Main {

    public static void main(String[] args) {
        new Controller(new View()).process();
    }

}
