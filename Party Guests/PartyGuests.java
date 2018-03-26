/************************************************
* Author: Nick Foster
*
* Lab Party Guests
************************************************/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PartyGuests {
   public static void main(String[] args) {
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      
      int numberOfGuests = 4;
      ArrayList<String> guestList = new ArrayList<>();
      
      System.out.println("Please enter " + numberOfGuests + " guests: ");
      int n = 1;
      
      while (n <= numberOfGuests) {
         System.out.print("guest" + n + ": ");
         guestList.add(input.nextLine());
         ++n;
      }
      
      System.out.println();
      System.out.println("Guest list: " + guestList);
      
      String cantCome = "";
      cantCome = guestList.get(rand.nextInt(numberOfGuests));
      guestList.remove(cantCome);
      System.out.println(cantCome + " can't come");
      System.out.println("Updated guest list: " + guestList);
   }
}