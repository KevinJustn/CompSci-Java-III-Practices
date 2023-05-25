// To run this program, run BlackJack.java.

public class BlackjackHand extends Hand { 
   public String blackjackhand() {
      int Cards = getCardsinHand();
      int YScore = gettotal();
      if (Cards == 2 && YScore == 21)
         return "Blackjack!";
      else
         return "";
   }
}