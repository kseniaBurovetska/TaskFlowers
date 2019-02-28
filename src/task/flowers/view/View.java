package task.flowers.view;

import java.util.List;

public class View {

    public void printMessage(String... messages){
        StringBuilder message = new StringBuilder();

        for(String s : messages){
            message.append(s).append(" ");
        }

        System.out.println(message.toString());
    }

    //Test
    public void printArray(List<?> list){
        list.stream()
                .forEach(System.out::println);
    }

}
