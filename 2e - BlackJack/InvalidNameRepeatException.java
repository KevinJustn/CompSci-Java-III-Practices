// To run this program, run BlackJack.java.

public class InvalidNameRepeatException extends Exception
{
   public InvalidNameRepeatException(String A, String B)
   {
      super ("Names of players cannot be the same. ("+A+", "+B+")");
   }
}