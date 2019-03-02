package task.flowers.view;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(BUNDLE_NAME,
                    new Locale("en"));
                    //new Locale("ru"));

    public void printOutput(String message){
        System.out.println("\n"+bundle.getString(message));
    }

    public void printMessage(String... messages){
        StringBuilder message = new StringBuilder();

        for(String s : messages){
            message.append(s).append(" ");
        }

        System.out.println(message.toString());
    }

    public void printArray(List<?> list){
        list.stream()
                .forEach(System.out::println);
    }

}
