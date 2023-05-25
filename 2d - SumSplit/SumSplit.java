// This program prompts the user for an array and an integer. Once inputted, the program
// will pick two elements whose sum equals the inputted integer.

import java.util.Scanner;
public class SumSplit {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter elements of array with spaces between each integer: ");
       String userInputArray = sc.nextLine();
       String[] strArr = userInputArray.split(" ");
         if (strArr.length < 3) {
           System.out.println("Size of array must be at least 3");
           System.exit(0);       }
       int[] ourArray = new int[strArr.length];
       int index = 0;
       for (String s : strArr) {
           ourArray[index] = Integer.parseInt(s);
           index += 1;
       }
       System.out.print("Enter a number: ");
       int userNumber = sc.nextInt();
       boolean oneOccurenceFound = false;
          for (int i = 0; i < ourArray.length; i++) {
            for (int j = i + 1; j < ourArray.length; j++) {
                  if (ourArray[i] + ourArray[j] == userNumber) {
                      System.out.println(ourArray[i] + " " + ourArray[j]);
                      oneOccurenceFound = true;
               }
           }
           if (oneOccurenceFound) {
               break;
           }
       }
       sc.close();
   }
}