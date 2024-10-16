package sourcecode;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFish 
{
	public int Asets = 0;
	public int Bsets = 0;
	public boolean Awin = false;
	public boolean Bwin = false;
	
	ArrayList<Card> HandA = new ArrayList<Card>();
	ArrayList<Card> HandB = new ArrayList<Card>();
	
	public void checkWin()
	{
		if(HandA.size() == 0)
		{
			Awin = true;
			System.out.println("Player A Wins!!!");
		}
		else if(HandB.size() == 0)
		{
			Bwin = true;
			System.out.println("Player B Wins!!!");
		}
		//else if for when pile size is 0
		//then if A has more sets than B
		//then vice versa
	}
	
	public void playPlayerA()
	{
		System.out.println("Player A, What kind of card are you looking for?");
		System.out.println("1. Ace \n2. Two \n3. Three \n4. Four \n5. Five \n6. Six \n7. Seven \n8. Eight \n9. Nine \n10. Ten \n11. Jack \n12. Queen \n13. King");
		Scanner scan = new Scanner(System.in);
		int Afish = scan.nextInt();
		switch(Afish)
		{
			case 1:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 2:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 3:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 4:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 5:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 6:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 7:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 8:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 9:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 10:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 11:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 12:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 13:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			default:
				System.out.println("Please enter a valid card.");
		}
	}
	
	public void playPlayerB()
	{
		System.out.println("Player B, What kind of card are you looking for?");
		System.out.println("1. Ace \n2. Two \n3. Three \n4. Four \n5. Five \n6. Six \n7. Seven \n8. Eight \n9. Nine \n10. Ten \n11. Jack \n12. Queen \n13. King");
		Scanner scan = new Scanner(System.in);
		int Bfish = scan.nextInt();
		switch(Bfish)
		{
			case 1:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 2:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 3:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 4:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 5:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 6:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 7:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 8:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 9:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 10:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 11:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 12:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			case 13:
				//if card exists in other hand, transfer to this hand
				//else, deal card from pile to this hand
				break;
			default:
				System.out.println("Please enter a valid card.");
		}
		
	}
	
	public boolean containsAce(ArrayList<Card> hand)
	{
		return hand.contains(Card.face == "Ace");
	}
	
	public void playGame()
	{	
		while(Awin == false && Bwin == false)
		{
			checkWin();
			playPlayerA();
			playPlayerB();
		}
	}
}
