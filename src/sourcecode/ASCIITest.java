package sourcecode;

import java.util.ArrayList;

public class ASCIITest {
	
	//method that takes in an ArrayList
	public static void printASCII(ArrayList<Card> list)
	{
		//for loop looks at every card in hand
		for(Card card: list) ASCII(card);
	}
	
	//method that takes in Card object
	public static void ASCII(Card c)
	   {
		   char face = ' '; //initialize char value for face of card
		   char value = ' '; //initialize char value for suit of card
		   String suit = c.getSuit(); //gets suit from Card object
		   
		   //if statements for converting suit names to one char
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
		   
		   //if statements for converting card value into a char
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
		   
		   //ASCII card for if value is from 2-9
		   if(1 < c.getValue() && c.getValue() < 10)
		   {
			   System.out.println("________");
			   System.out.println("|" + c.getValue() + "    " + c.getValue() + "|");
			   System.out.println("|      |");
			   System.out.println("|" + face + "    " + face + "|");
			   System.out.println("--------");
		   }
		   //ASCII card for if value is 10
		   else if(c.getValue() == 10)
		   {
			   System.out.println("________");
			   System.out.println("|10  10|");
			   System.out.println("|      |");
			   System.out.println("|" + face + "    " + face + "|");
			   System.out.println("--------");
		   }
		   //ASCII card for if value is anything else
		   else
		   {
			   System.out.println("________");
			   System.out.println("|" + value + "    " + value + "|");
			   System.out.println("|      |");
			   System.out.println("|" + face + "    " + face + "|");
			   System.out.println("--------");
		   } 
			
	   }

	public static void main(String[] args) 
	{
		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle();
		ArrayList<Card> HandA = new ArrayList<Card>();
		
		for (int i = 1; i <= 7; i++)
		{
			HandA.add(myDeck.dealCard());
		}
		
		printASCII(HandA);
	}

}
