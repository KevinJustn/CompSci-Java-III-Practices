Black Jack Card Game Simulator

Blackjack.java
 Imported java.util.* and java.util.Scanner for Java Collection and Scanner functions.
 The primary program that runs the simulation and produces results. 
 Asks the User to input names for themselves and their card dealer. 
 Displays dealer’s score, User’s hand, and User’s score. 

BlackjackHand.java
 Extends the program Hand.java.
 Method String blackjackhand()
    o Intakes values getCardsinHand() and gettotal() from Hand.java.
    o Condition: If getCardsinHand() is equal to 2 and gettotal() is equal to 21, then the program outputs “Blackjack!” notifying the User they have a Blackjack pair. 
    o If Condition fails, an empty string is returned.

DeckOfCards.java
 Imported java.util.* for Java Collection functions.
 Method String[] Shuffle()
    o An array String[] Cards is initialized with the 52 Cards of a standard card deck. 
    o The array String[] Cards is converted to List <String> CardsList. 
    o Using Java Collections from java.util.*, the list is shuffled. 
    o The shuffled list is returned.
 Method String AddCard(int x, String[] C)
    o Returns the card located at position x in array C.
 Method String[] Update(String[] C, String ele)
    o A new String[] E is created with size 1 less than C. 
    o All elements in C are copied over to E, with the exception of ele. 
    o String[] E is returned. 

Hand.java
 Imported java.util.* for Java Collection functions. 
 Method int Hand(String YourCard, String YourCards)
    o String YourCards is split by spaces and determines how many cards you have, which is stored in static int CardsinHand. 
    o String YourCard is taken and goes through conditions to find its value, which is then added to the static int total, which is your total score. 
 Method int getCardsinHand()
    o Returns static int CardsinHand.
 Method int gettotal()
    o Returns static int total. 
 Method String sort(String Cards)
    o Initializes strings for each card suit and places Cards in their respectable suit.
    o Each suit string is sorted by value in increasing order. 
    o All suit strings are combined in String Sorted and Sorted is returned. 

InvalidNameRepeatException.java
 Extends Exception
 Method InvalidNameRepeatException(String A, String B)
    o Displays an error message if User inputs identical names for both players. 

NameCheck.java
 Method NameCheck(String P1, String P2) 
    o Checks to see if P1 is equals to P2, ignoring casing.
    o If true, throws new InvallidNameRepeatException(P1,P2), else continues. 
