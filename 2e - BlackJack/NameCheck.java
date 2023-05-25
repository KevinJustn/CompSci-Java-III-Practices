// To run this program, run BlackJack.java.

public class NameCheck {
   public NameCheck(String P1, String P2) throws InvalidNameRepeatException
   {
      if (P1.equalsIgnoreCase(P2) == true)
         throw new InvalidNameRepeatException(P1,P2);
   }
}