/****************************************
* Author: Nick Foster
* Last edit: 4/17/2017
* 
* Lab Martian
****************************************/

import java.util.Random;

public class Martian {
   // fields
   private static final Random rand = new Random();
   private static int count;
   private String name;
   
   // constructors
   public Martian() {
      name = getRandomName();
      ++count;
   }
   
   // methods
   public String getRandomName() {
      char letter = (char) ('A' + rand.nextInt(26));
      return "" + letter + (rand.nextInt(90) + 10);
   }
   
   public void doSomething() {
      if (count < 5) System.out.println(name + " is hiding");
      else System.out.println("ATTACK!");
   }
   
   public static Martian[] invade(int num) {
      Martian[] squad = new Martian[num];
      
      for (int i = 0; i < num; ++i) {
         squad[i] = new Martian();
      }
      return squad;
   }
   
   // overloaded invasion method
   public static Martian[] invade() {
      return invade(rand.nextInt(9) + 2);
   }
   
   @Override
   public String toString() {
      return name + "\\" + count;
   }
   
}