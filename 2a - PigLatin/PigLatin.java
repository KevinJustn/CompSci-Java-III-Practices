// This program takes a user inputted sentence and turns it into pig latin.
// Pig latin in this program is:
// You convert a word by removing the first letter, placing that letter at the end of the word and then appending “ay” to the word (all uppercase).

import java.util.Scanner;
public class PigLatin { 
   public static void main (String args[]){
   Scanner kb = new Scanner(System.in); 
   System.out.print("Enter a sentence:");
   String input = kb.nextLine();
   String[] Split = input.split(" ");
   for (int i=0;i<Split.length;i++) { 
      StringBuilder word = new StringBuilder(Split[i]);
      StringBuilder w = new StringBuilder(Split[i]);
      int z = word.length();
         if (z>1) { 
            word.insert(z,w.delete(1,z));
            word.deleteCharAt(0);
            for (int j=0;j<z;j++){
               char c = word.charAt(j);
               word.replace(j,j+1,String.valueOf(Character.toUpperCase(c)));
            }
            word.insert(z,"AY ");
         }
         else {
            for (int j=0;j<1;j++){
               char c = word.charAt(j);
               word.replace(j,j+1,String.valueOf(Character.toUpperCase(c)));
            }
            word.insert(z,"AY ");
         }
      System.out.print(word);
      }
   }
}