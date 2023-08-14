package ntu.edu.sg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to trigger an exception");
        try {
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (Exception e) {
            logger.error("Exception: " + e);
        } finally {
            logger.info("Application ended");
        }
        scanner.close();
    }
}
