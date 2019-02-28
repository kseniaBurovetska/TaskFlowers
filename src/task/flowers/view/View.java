package task.flowers.view;

import task.flowers.model.Flower;
import java.util.List;

public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    //Test
    public void printArray(List<Flower> list){
        list.stream()
                .forEach(System.out::println);
    }

}
