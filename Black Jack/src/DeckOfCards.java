import java.util.ArrayList; 
import java.util.Collections; 
 
 
 public class DeckOfCards 
 	{ 
 	static String bob; 
 	 
 	static int cardValue; 
 	 
 	static ArrayList deck=new ArrayList<String>(); 
 	 
 	static String[] cards={ "Ace of diamonds", "Ace of clubs", "Ace of spades", "Ace of hearts", "King of Diamonds", 
 			"King of clubs", "King of spades", "King of hearts", "Queen of diamonds", "Queen of Clubs", "Queen of spades", 
 			"Queen of hearts", "Jack of diamonds", "Jack of clubs", "Jack of spades", "Jack of hearts", "10 of diamonds", 
 			"10 of clubs", "10 of spades", "10 of hearts", "9 of diamonds", "9 of clubs", "9 of spades", "9 of hearts", 
 			"8 of diamonds", "8 of clubs", "8 of spades", "8 of hearts", "7 of diamonds", "7 of clubs", "7 of spades",  
 			"7 of hearts", "6 of diamonds", "6 of clubs", "6 of spades", "6 of hearts", "5 of diamonds", "5 of clubs", 
 			"5 of spades", "5 of hearts", "4 of diamonds", "4 of clubs", "4 of spades", "4 of hearts", "3 of diamonds", 
 			"3 of clubs", "3 of spades", "3 of hearts", "2 of diamonds", "2 of clubs", "2 of spades", "2 of hearts",};  	
 	public static void bob() 
 		{ 
 		for(String bob: cards) 
 			{ 
 			deck.add(bob); 
 			} 
 		} 
 	 
 	public static void shuffle() 
 		{ 
 		Collections.shuffle(deck); 
 		} 
 	 
 	public static void Cards() 
 		{ 
 		deck.get(0,1); 
 		switch(bob) 
 		{ 
 		case "A": 
 			{ 
 			cardValue=11; 
 			break; 
 			} 
 		case "K": 
 		case "Q": 
 		case "J": 
 		case "1": 
 			{ 
 			cardValue=10; 
 			break; 
 			} 
 		case "9": 
 			{ 
 			cardValue=9; 
 			break; 
 			} 
 		case "8": 
 			{ 
 			cardValue=8; 
 			break; 
 			} 
 		case "7": 
 			{ 
 			cardValue=7; 
 			break; 
 			} 
 		case "6": 
 			{ 
 			cardValue=6; 
 			break; 
 			} 
 		case "5": 
 			{ 
 			cardValue=5; 
 			break; 
 			} 
 		case "4": 
 			{ 
 			cardValue=4; 
 			break; 
 			} 
 		case "3": 
 			{ 
 			cardValue=3; 
 			break; 
 			} 
 		case "2": 
 			{ 
 			cardValue=2; 
 			break; 
 			} 
 	 
 		 
 		} 
 		 
 		 
 		} 
 		 
 	} 

