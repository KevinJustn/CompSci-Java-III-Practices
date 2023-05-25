import java.util.*;
public class Hints { 
   public String Hint(String Guess, int[] guessint) { 
      String S = "";
      String P = "";
      String F = "";
      int del;
      int del_g=0;
      int del_gi=0;
      int deletings;
      int x=0;
      int[] guess = new int[] {0,0,0,0};
      int[] guess2 = new int[] {0,0,0,0};
      for (int i=0;i<4;i++) { 
         guess[i] = Character.getNumericValue(Guess.charAt(i));
         guess2[i] = Character.getNumericValue(Guess.charAt(i));
      }
      // S Test
      for (int q=0;q<4;q++) { 
         if (guess[q] == guessint[q]) { 
            S += "S ";
            guess2[q] = 0;
         }
      }
      for (int h=0;h<4;h++) { 
         if (guess2[h] == 0) {
            del = guess[h]; 
            del_g=0;
            del_gi=0;
         
            for (int g=0;g<4;g++) { 
               if (guess[g] == del) { 
                  del_g +=1;
               }
               if (guessint[g] == del) { 
                  del_gi+=1;
               }
            }
            x=0;
            if (del_g > del_gi) { 
               deletings = del_g-del_gi;
               while (deletings>0) {  
                  if (guess2[x] == del) { 
                     guess2[x] = 0;
                     deletings-=1;
                  }
               if (x == 3) { 
                  deletings=0;
               }
               x+=1;
               }
            }
         }
      }

      // P Test
      int PinGI=0;
      int PinG2=0;
      int X=0;
      int Y=0;
      for (int j=0;j<4;j++) { // host array [guessint]
         for (int k=0;k<4;k++) { // user array [guess2]
            PinGI=0;
            PinG2=0;
            X=0;
            Y=0;
            for (int b=0;b<4;b++) { 
               if (guess2[k] == guess2[b] && guess2[k] != 0) { 
                  PinG2+=1;
               }
               if (guess2[k] == guessint[b] && guess2[k] != 0) { 
                  PinGI+=1;
               }
            }      
            if (PinG2 > PinGI) { 
               while (X<1) { 
                  if (guess2[k] == guess2[Y]) { 
                     guess2[k] = 0;
                     X+=1;
                  }
               Y+=1;
               }
            }
            if ((guess2[k] == guessint[j])) {
               P += "P ";
               guess2[k] = 0;
            }
         
         }
      }
            
      // F Test
      String Concat = S + P;
      if (Concat.equals("")) { 
         Concat = "F";
      }
      return Concat;
   }
}