/****************************************
* Author: Nick Foster
*
* App tests the Parrot class.
****************************************/

import java.util.Scanner;

public class ParrotApp {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);     
      Parrot myParrot = new Parrot();
      
      System.out.print("What would you like to say to the parrot? ");
      String userSays = input.nextLine();
      
      System.out.print("%nThe parrot says: ");
      myParrot.speak(userSays);
   }
}