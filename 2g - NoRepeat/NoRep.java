// This program accepts a string input and outputs the first character that does not repeat.

import java.util.Scanner;
public class NoRep { 
   public static void main(String args[]) { 
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String Origin = kb.nextLine();
      char[] Ori = new char[Origin.length()];
      Ori = Origin.toCharArray();
      int Reps;
      int Complete = 0;
      for (int i=0;i<Origin.length();i++) { 
         Reps = 0;
         for (int j=0;j<Origin.length();j++) { 
            if (i != j && Ori[i] == Ori[j]) { 
               Reps+=1;
            }
         }
         if (Reps == 0) { 
            System.out.print("No Repitions of: " + Ori[i]);
            Complete = 1;
            System.exit(0);
         }
      }
      if (Complete == 0)
         System.out.print("No Non-Repitions Detected in String.");
      // Case sensitive? Order of String? Ex. ABADCEB
   }
}