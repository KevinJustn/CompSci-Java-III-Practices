// To run this program, run BlackJack.java.

import java.util.*;
public class Hand { 
static int CardsinHand;
static int total = 0;
public int Hand(String YourCard,String YourCards){ 
      String[] Split = YourCard.split(" ");
      String[] Count = YourCards.split(" ");
      CardsinHand = Count.length;
      for (int i=0;i<Split.length;i++) { 
         StringBuilder Card = new StringBuilder(Split[i]);
         if (Card.charAt(0) == 'A') { 
            if (total >= 11) { 
               total += 1;    }
            else
               total += 11;   
         }
         if (Card.charAt(0) == '2') {
            total += 2;         }
         if (Card.charAt(0) == '3') {
            total += 3;         }
         if (Card.charAt(0) == '4') {
            total += 4;         }
         if (Card.charAt(0) == '5') {
            total += 5;         }
         if (Card.charAt(0) == '6') {
            total += 6;         }
         if (Card.charAt(0) == '7') {
            total += 7;         }
         if (Card.charAt(0) == '8') {
            total += 8;         }
         if (Card.charAt(0) == '9') {
            total += 9;         }
         if (Card.charAt(0) == 'X') {
            total += 10;         }
         if (Card.charAt(0) == 'J') {
            total += 10;         }
         if (Card.charAt(0) == 'Q') {
            total += 10;         }
         if (Card.charAt(0) == 'K') {
            total += 10;         }
      }
   return total;
   }
   public int getCardsinHand() { 
      return CardsinHand;
   }
   public int gettotal() { 
      return total;
   }
   public String sort(String Cards) { 
      String Hearts = "";
      String Clubs = "";
      String Spades = "";
      String Diamonds = "";
      String[] Splitted = Cards.split(" ");
      for (int i=0;i<Splitted.length;i++) { 
         StringBuilder Card = new StringBuilder(Splitted[i]);
         if (Card.charAt(1) == 'H') {
            Hearts += Splitted[i] + " ";     }
         if (Card.charAt(1) == 'C') {
            Clubs += Splitted[i] + " ";      }
         if (Card.charAt(1) == 'S') {
            Spades += Splitted[i] + " ";     }
         if (Card.charAt(1) == 'D') {
            Diamonds += Splitted[i] + " ";   }     
      }
      // Hearts Sorting
      if (Hearts.length()>0) { 
         String[] HSplit = Hearts.split(" ");
         for (int i=0;i<HSplit.length;i++){
            if (HSplit[i].equals("AH"))  {
               HSplit[i] = "00";    }
            if (HSplit[i].equals("XH"))  { 
               HSplit[i] = "A2H";   }
            if (HSplit[i].equals("JH"))  {
               HSplit[i] = "A3H";   }
            if (HSplit[i].equals("QH"))  {
               HSplit[i] = "A4H";   }
            if (HSplit[i].equals("KH"))  {
               HSplit[i] = "A5H";   }
         }
         Arrays.sort(HSplit);
         for (int i=0;i<HSplit.length;i++){
            if (HSplit[i].equals("00"))  {
               HSplit[i] = "AH";    }
            if (HSplit[i].equals("A2H"))  { 
               HSplit[i] = "10H";   }
            if (HSplit[i].equals("A3H"))  {
               HSplit[i] = "JH";   }
            if (HSplit[i].equals("A4H"))  {
               HSplit[i] = "QH";   }
            if (HSplit[i].equals("A5H"))  {
               HSplit[i] = "KH";   }
         }
         Hearts = Arrays.toString(HSplit);
      }
      // Clubs Sorting
      if (Clubs.length()>0) { 
         String[] CSplit = Clubs.split(" ");
         for (int i=0;i<CSplit.length;i++){
            if (CSplit[i].equals("AC"))  {
               CSplit[i] = "00";    }
            if (CSplit[i].equals("XC"))  {
               CSplit[i] = "A2C";   }
            if (CSplit[i].equals("JC"))  {
               CSplit[i] = "A3C";   }
            if (CSplit[i].equals("QC"))  {
               CSplit[i] = "A4C";   }
            if (CSplit[i].equals("KC"))  {
               CSplit[i] = "A5C";   }
         }
         Arrays.sort(CSplit);
         for (int i=0;i<CSplit.length;i++){
            if (CSplit[i].equals("00"))  {
               CSplit[i] = "AC";    }
            if (CSplit[i].equals("A2C"))  {
               CSplit[i] = "10C";   }
            if (CSplit[i].equals("A3C"))  {
               CSplit[i] = "JC";   }
            if (CSplit[i].equals("A4C"))  {
               CSplit[i] = "QC";   }
            if (CSplit[i].equals("A5C"))  {
               CSplit[i] = "KC";   }
         }
         Clubs = Arrays.toString(CSplit);
      }
      // Spades Sorting
      if (Spades.length()>0) { 
         String[] SSplit = Spades.split(" ");
         for (int i=0;i<SSplit.length;i++){
            if (SSplit[i].equals("AS"))  {
               SSplit[i] = "00";    }
            if (SSplit[i].equals("XS"))  {
               SSplit[i] = "A2S";   }
            if (SSplit[i].equals("JS"))  {
               SSplit[i] = "A3S";   }
            if (SSplit[i].equals("QS"))  {
               SSplit[i] = "A4S";   }
            if (SSplit[i].equals("KS"))  {
               SSplit[i] = "A5S";   }
         }
         Arrays.sort(SSplit);
         for (int i=0;i<SSplit.length;i++){
            if (SSplit[i].equals("00"))  {
               SSplit[i] = "AS";    }
            if (SSplit[i].equals("A2S"))  {
               SSplit[i] = "10S";   }
            if (SSplit[i].equals("A3S"))  {
               SSplit[i] = "JS";   }
            if (SSplit[i].equals("A4S"))  {
               SSplit[i] = "QS";   }
            if (SSplit[i].equals("A5S"))  {
               SSplit[i] = "KS";   }
         }
         Spades = Arrays.toString(SSplit);
      }
      // Diamonds Sorting
      if (Diamonds.length()>0) { 
         String[] DSplit = Diamonds.split(" ");
         for (int i=0;i<DSplit.length;i++){
            if (DSplit[i].equals("AD"))  {
               DSplit[i] = "00";    }
            if (DSplit[i].equals("XD"))  {
               DSplit[i] = "A2D";   }
            if (DSplit[i].equals("JD"))  {
               DSplit[i] = "A3D";   }
            if (DSplit[i].equals("QD"))  {
               DSplit[i] = "A4D";   }
            if (DSplit[i].equals("KD"))  {
               DSplit[i] = "A5D";   }
         }
         Arrays.sort(DSplit);
         for (int i=0;i<DSplit.length;i++){
            if (DSplit[i].equals("00"))  {
               DSplit[i] = "AD";    }
            if (DSplit[i].equals("A2D"))  {
               DSplit[i] = "10D";   }
            if (DSplit[i].equals("A3D"))  {
               DSplit[i] = "JD";   }
            if (DSplit[i].equals("A4D"))  {
               DSplit[i] = "QD";   }
            if (DSplit[i].equals("A5D"))  {
               DSplit[i] = "KD";   }
         }
         Diamonds = Arrays.toString(DSplit);
      }
      String Sorted = Hearts + Clubs + Spades + Diamonds;
      return Sorted;
   }
}
