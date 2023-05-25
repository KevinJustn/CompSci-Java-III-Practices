// This program rolls a weighed dice, whose probabilities are as follows: 
// 1, 2, 3, 4, 5  --> 1/8
// 6              --> 3/8

import java.util.*;
public class WeighedDie { 
   public static void main(String args[]) { 
      int[] WDie = new int[] {1,2,3,4,5,6,6,6};
      Random rand = new Random();
      int roll = rand.nextInt(8);
      System.out.print("*rolling* " +"\n"+ "Value: "+WDie[roll]);
   }
}
      