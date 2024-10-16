package sourcecode;

import java.security.SecureRandom;
import java.util.ArrayList;

public class DeckOfCards {
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

   private Card[] deck = new Card[NUMBER_OF_CARDS]; // Card references
   private int currentCard = 0; // index of next Card to be dealt (0-51)

   // constructor fills deck of Cards
   public DeckOfCards() {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};    
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
      int [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};

      // populate deck with Card objects                   
      for (int count = 0; count < deck.length; count++) {  
         deck[count] =                                     
            new Card(faces[count % 13], suits[count / 13], values[count % 13]);
      }                                                    
   } 

   // shuffle deck of Cards with one-pass algorithm
   public void shuffle() {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) {
         // select a random number between 0 and 51 
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // swap current Card with randomly selected Card
         Card temp = deck[first];   
         deck[first] = deck[second];
         deck[second] = temp;       
      } 
   } 

   // deal one Card
   public Card dealCard() {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length) {
         return deck[currentCard++]; // return current Card in array
      } 
      else {
         return null; // return null to indicate that all Cards were dealt
      } 
   }
   
   public void ASCII(Card c)
   {
	   char face = ' ';
	   char value = ' ';
	   String suit = c.getSuit();
	   
	   if(suit == "Hearts")
	   {
		   face = 'H';
	   }
	   else if(suit == "Spades")
	   {
		   face = 'S';
	   }
	   else if(suit == "Clubs")
	   {
		   face = 'C';
	   }
	   else if(suit == "Diamonds")
	   {
		   face = 'D';
	   }
	   
	   if(c.getValue() == 1)
	   {
		   value = 'A';
	   }
	   else if(c.getValue() == 11)
	   {
		   value = 'J';
	   }
	   else if(c.getValue() == 12)
	   {
		   value = 'Q';
	   }
	   else if(c.getValue() == 13)
	   {
		   value = 'K';
	   }
	   else if(1 < c.getValue() && c.getValue() < 10)
	   {
		   value = (char)c.getValue();
	   }
	   
	   if(c.getValue() == 10)
	   {
		   System.out.println("_______");
		   System.out.println("|10 10|");
		   System.out.println("|     |");
		   System.out.println("|     |");
		   System.out.println("|" + face + "   " + face + "|");
		   System.out.println("-------");
	   }
	   else 
	   {
		   System.out.println("_______");
		   System.out.println("|" + value + "   " + value + "|");
		   System.out.println("|     |");
		   System.out.println("|     |");
		   System.out.println("|" + face + "   " + face + "|");
		   System.out.println("-------");
	   }
   }
   
   
   
   
}
