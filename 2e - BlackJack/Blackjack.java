// This program simulates a quick game of Black Jack, with the user entering the user's name and dealer's name.

import java.util.Scanner;
import java.util.*;
public class Blackjack{ 
   public static void main (String args[]){ 
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your name(Player 1): ");
      String Player1 = kb.nextLine(); 
      System.out.print("Enter the dealer's name(Player 2): ");
      String Player2 = kb.nextLine();
      try { 
         if (Player1.equalsIgnoreCase(Player2))
            throw new InvalidNameRepeatException(Player1,Player2);
      }
      catch(InvalidNameRepeatException e) {
         System.out.print("Error - " + e.getMessage());
         System.exit(0);
      }
      DeckOfCards D = new DeckOfCards();
      String[] C = D.Shuffle();
      Hand F = new Hand();
      Random rand = new Random();
      int DealScore = rand.nextInt(6) + 16;
      System.out.println("The dealer's score is: "+DealScore);
      int YourScore = 0;
      int PickCard;
      PickCard = rand.nextInt(C.length-1) + 1;
      String ele = D.AddCard(PickCard,C);
      String YourCards = ele;
      String Card = ele;
      YourScore = F.Hand(Card,YourCards);
      C = D.Update(C,ele);
      for (int i=0;YourScore<DealScore;i++) { 
         PickCard = rand.nextInt(C.length-1) + 1;
         ele = D.AddCard(PickCard,C);
         YourCards += " "+ ele;
         Card = ele;
         YourScore = F.Hand(Card,YourCards);
         C = D.Update(C,ele);
      } 
      BlackjackHand T = new BlackjackHand();
      System.out.println(T.blackjackhand());
      System.out.println("Your Cards: " + F.sort(YourCards));
      System.out.println("Your Score: " + YourScore);
  }
}