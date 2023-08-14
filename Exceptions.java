import java.util.Scanner;

public class Exceptions {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    try {
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (Exception e) {
      System.out.println(e);
    } 
    scanner.close();
     
  }
}