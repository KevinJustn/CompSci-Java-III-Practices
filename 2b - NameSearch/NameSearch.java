// This program prompts the user for a name to enter and will search the arrays for a matching name
// In this version, it checks the last names of users in the array.

import javax.swing.JOptionPane;
public class NameSearch { 
   public static void main (String args[]){
   String[] names = {"Jobs, Steve", "Smith, John", "Smith, Brad"};
   String[] numbers = {"123-456-7890", "234-567-8901", "345-678-9012"};
   String input = JOptionPane.showInputDialog("Enter a name or parts of a name to search:");
   if (names[0].startsWith(input))
      JOptionPane.showMessageDialog(null, String.format('"'+names[0]+'"'+" "+numbers[0]));
   if (names[1].startsWith(input) && names[2].startsWith(input))
      JOptionPane.showMessageDialog(null, String.format('"'+names[1]+'"'+" "+numbers[1] + "\n" +
                                                        '"'+names[2]+'"'+" "+numbers[2]));
   else { 
      if (names[1].startsWith(input))
         JOptionPane.showMessageDialog(null, String.format('"'+names[1]+'"'+" "+numbers[1]));
      if (names[2].startsWith(input))
         JOptionPane.showMessageDialog(null, String.format('"'+names[2]+'"'+" "+numbers[2]));
   }
   System.exit(0);
   }
}
