package task.flowers.view;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Kseniia Burovetska
 * View class.
 */
public class View {

    /** Bundle declaration */
    static String BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(BUNDLE_NAME,
                    //new Locale("en"));
                    new Locale("ru"));

    /**
     * Prints constant messages.
     * @param message
     */
    public void printOutput(String message) {
        System.out.println("\n" + bundle.getString(message));
    }

    /**
     * Concatenates and print messages
     * @param messages
     */
    public void printMessage(String... messages) {
        StringBuilder message = new StringBuilder();

        for (String s : messages) {
            message.append(s).append(" ");
        }

        System.out.println(message.toString());
    }

    /**
     * Prints array of any type elements
     * @param list
     */
    public void printArray(List<?> list) {
        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            list.stream()
                    .forEach(System.out::println);

        }
    }
}
