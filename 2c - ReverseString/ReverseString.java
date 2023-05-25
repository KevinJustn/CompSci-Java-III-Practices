// This program prompts the user for a string input and reverses the string.

import java.util.Scanner;
public class ReverseString {
   public static String FirstLastSwitch(String str)   {
   String newstring=str.substring(1, str.length() - 1);;
       String firstChar = str.substring(0, 1);
       String lastChar = str.substring(str.length() - 1);
       newstring= lastChar + newstring + firstChar;
       return newstring;
   }  
   public static String FirstLastWord(String str)  {
   String firstword[] = str.split(" ", 2);
       String lastWord = str.substring(str.lastIndexOf(" ")+1);
       return firstword[0]+" "+lastWord;
   }
   
   public static void main(String[] args) {
   String n;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a string: ");
   n = sc.next();
   System.out.println(FirstLastSwitch(n));
   }
}