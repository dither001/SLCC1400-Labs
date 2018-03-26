/****************************************
* Author: Nick Foster
* Last edit: 4/17/2017
* 
* App to test Martian class
****************************************/

public class MartianApp {
   public static void main(String[] args) {
      //part1();

      Martian[] invaders = Martian.invade(13);
      System.out.print("Invasion force:");
      int n = 0;
      for (Martian el : invaders) {
         if (n % 5 == 0) System.out.println();
         System.out.print(el + ", ");
         ++n;
      }
      
      Martian[] mysterySquad = Martian.invade();
      System.out.println();
      System.out.println();

      System.out.println("Invasion force 2:");
      for (Martian el : mysterySquad) {
         el.doSomething();
      }
   }
   
   public static void part1() {
      Martian m1 = new Martian();
      System.out.println(m1);
      System.out.println();

      Martian m2 = new Martian();
      System.out.println(m1 + ", " + m2);
      System.out.println();
      
      Martian[] martians = {new Martian(), new Martian(), new Martian()};
      for (Martian el : martians) 
         el.doSomething();
   }
}