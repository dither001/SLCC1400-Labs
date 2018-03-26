/****************************************
* Author: Nick Foster
*
* Magic Square Lab - determine whether a
* two-dimensional array is a magic square
****************************************/

public class MagicSquare {
   public static void main(String[] args) {
      int[][] square = {
         {25, 13, 1, 19, 7},
         {16, 9, 22, 15, 3},
         {12, 5, 18, 6, 24},
         {8, 21, 14, 2, 20},
         {4, 17, 10, 23, 11}
      };
      
      System.out.printf("The square %s magic %n ",
         (isMagic(square) ? "is" : "is not"));
   }
   
   private static boolean isMagic(int[][] square) {
      boolean isMagicSquare = true;
      int total = 0;
      
      // calculate sum
      int sum = 0;
      for (int el : square[0]) {
         sum += el;
      }
      
      // check rows
      for (int row = 0; row < square.length; ++row) {
         total = 0;
         for (int col = 0; col < square.length; ++col) {
            total += square[row][col];
         }
         if (total != sum)
            return false;
      }
      
      // check columns
      for (int col = 0; col < square.length; ++col) {
         total = 0;
         for (int row = 0; row < square.length; ++row) {
            total += square[row][col];
         }
         if (total != sum)
            return false;
      }
      
      // check / diagonal
      
      for (int col = square.length - 1; col >= 0; --col) {
         total = 0;
         for (int row = square.length - 1; row >= 0; --row) {
            total += square[row][col];
         }
         if (total != sum)
            return false;
      }
      
      // check \ diagonal
      total = 0;
      for (int i = 0; i < square.length; ++i) {
         total += square[i][i];
      }
      if (total != sum)
         return false;
      
      return isMagicSquare;
   }
}