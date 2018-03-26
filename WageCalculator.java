/******************************************
* Author: Nick Foster
*
* A05 - Wage Calculator Class
* Last modified 2017-02-23
******************************************/

public class WageCalculator {
   // fields
   private double baseRate;
   private double overtimeMultiplier = 1.5;
   private int hours;
   
   private final double MIN_WAGE = 7.25;
   private final int MIN_HOURS = 0;
   private final int MAX_HOURS = 40;
   
   // constructors
   public WageCalculator(double baseRate, double overtimeMultiplier,
                           int hours) {
      this.baseRate = baseRate;
      this.overtimeMultiplier = overtimeMultiplier;
      this.hours = hours;
   }

   public WageCalculator(double baseRate, int hours) {
      this(baseRate, 1.5, hours);
   }
      
   // methods
   public double baseWage() {
//       double i = baseRate;
//       int n = hours;
//       
//       if (baseRate >= MIN_HOURS && baseRate <= MAX_HOURS)
         
      
      return baseRate * hours;
   }
   
   public double overtimeWage() {
      return overtimeMultiplier * (hours - MAX_HOURS);
   }
   
   public double totalWage() {
      return baseWage() + overtimeWage(); // TODO
   }
   
   @Override
   public String toString() {
      // change to 'String' return and void Printf before submission
      return "this is toString"; // TODO
   }
}