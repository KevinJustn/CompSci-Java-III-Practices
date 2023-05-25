// This program plays a small guess game where a four digit number is generated and the user has to guess it.
// The program should print three different outputs: 
// "F" for no correct letters 
// "P" for correct letter in wrong location
// "S" for correct letter in correct locaiton

// Currently the program sets the guess to "7777"

import java.util.*;
public class GuessInt { 
   public static void main(String args[]) { 
      Scanner kb = new Scanner(System.in);
      System.out.println("I'm thinking of a 4 digit number. Please try to guess my number!");
      Random rand = new Random();
      int randint;
      int[] guessint = new int[] {0,0,0,0};
      for (int i=0;i<4;i++) { 
         randint = rand.nextInt(9)+1;
         guessint[i] = randint;
      }
      int Correct=0;
      String correct;
      int Attempts=0;
      String Guess;
      Hints H = new Hints();
      while (Correct<1) { 
         System.out.print("Your guess: ");
         Guess = kb.nextLine();
         Attempts +=1;
         correct = H.Hint(Guess, guessint);
         if (correct.equals("S S S S ")) { 
            System.out.print("You got it right in " + Attempts + " guesses!");
            System.exit(0);
         }
         else 
            System.out.println(correct);
      }
   }
}