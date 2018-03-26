/******************************************
* Author: Nick Foster
*
* Class takes input from user in the form
* of three colors and three numbers, then
* prints two columns associating the color
* "marble" with a number of "marbles."
******************************************/

import java.util.Scanner;

public class Marbles {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number1, number2, number3;
      
      System.out.printf("Please enter a marble color: ");
      String color1 = input.nextLine();
      System.out.printf("Please enter the number of %s marble(s): ", color1);
      number1 = input.nextInt();
      input.nextLine(); // clears /n
      
      System.out.printf("%nPlease enter a marble color: ");
      String color2 = input.nextLine();
      System.out.printf("Please enter the number of %s marble(s): ", color2);
      number2 = input.nextInt();
      input.nextLine(); // clears /n
      
      System.out.printf("%nPlease enter a marble color: ");
      String color3 = input.nextLine();
      System.out.printf("Please enter the number of %s marble(s): ", color3);
      number3 = input.nextInt();
      
      // System.out.printf("%n%nThere are %d %s marble(s).", number1, color1);
      // System.out.printf("%nThere are %d %s marble(s).", number2, color2);
      // System.out.printf("%nThere are %d %s marble(s).", number3, color3);
      
      System.out.printf("%n%-12s %-12s", "Color", "No. Marbles");
      System.out.printf("%n%-12s %-12s", "------------", "------------");
      System.out.printf("%n%-12s %-12s", color1, number1);
      System.out.printf("%n%-12s %-12s", color2, number2);
      System.out.printf("%n%-12s %-12s", color3, number3);
   }
}