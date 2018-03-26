/******************************************
* Author: Nick Foster
*
* A05 - App to test Wage Calculator
* Last modified 2017-02-23
******************************************/

import java.util.Scanner;

public class WageCalculatorApp {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      WageCalculator myCalc = new WageCalculator(0.0, 0.0, 0);
      
//       System.out.println(myCalc.totalWage()); // just prints for my reference
//       System.out.println();
      
      double baseRate;
      double hours;
      double overtimeMultiplier;
      
      System.out.print("Base rate: ");
      baseRate = input.nextDouble();
      
      System.out.print("Hours: ");
      hours = input.nextInt();
         
      System.out.print("Would you like to enter an overtime multiplier (yes/no)?");
      String userChoice = input.nextLine();
      if (userChoice == "yes") {
         System.out.print("Overtime multiplier: ");
         overtimeMultiplier = input.nextDouble();
      }
      
      System.out.printf("Base wage: %d", myCalc.baseWage()); // TODO
      System.out.printf("Overtime wage: %d", myCalc.overtimeWage()); // TODO
      System.out.printf("Total wage: %d", myCalc.totalWage()); // TODO
      
   }
}