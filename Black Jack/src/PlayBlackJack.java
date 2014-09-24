import java.util.*;

		public class PlayBlackJack {

		    public static void main(String[] args) {
		    	Scanner myscan = new Scanner(System.in);
		        System.out.println("*************************");
		        System.out.println("****     WELCOME     ****");
		        System.out.println("****       TO        ****");
		        System.out.println("****    BLACKJACK    ****");
		        System.out.println("*************************");

		        int userTotal = 0;
		        int total = 0;
		        System.out.println("\n");
		        System.out.println("*****User Playing******");
		        System.out.println("Press enter to start!"+"\n");
		        myscan.nextLine();
		        for(int i = 0; i < 2; i++)
		        {
		            System.out.println(DeckOfCards.cardDeck.get((int)(Math.random()*52)));
		        }

		        while(userTotal < 21)
		        {
		            System.out.println("\n"+"Press 1(hit) or 2(stay)");
		            int key = myscan.nextInt();
		        if( (key == 1) && (userTotal < 21))
		        {
		            System.out.println(cardDeck.get((int)(Math.random()*52)));
	
		            if(userTotal > 21)
		            {
		                System.out.println("You are busted!");
		                break;
		            }
		        }
		        else
		        {
		            System.out.println("You stay, and have a total of: "+userTotal);
		            break;
		        }
		        }

		        int computerTotal = 0;
		        System.out.println("****** Computer Playing *********");
		        for(int i = 0; i < 2; i++)
		        {
		            System.out.println(cardDeck.get((int)(Math.random()*52)));
		        }

		        while(computerTotal < 21)
		        {
		            if(computerTotal<17) 
		            {
		            	for(int i=0; i<1; i++)
		            	{
		            System.out.println(cardDeck.get((int)(Math.random()*52)));
		            	}
		            }
		            else 
		            {
		            	System.out.println("The computer stays, and has to total of: "+computerTotal);
		            }
		            	
		            if(computerTotal > 21)
		            {
		                System.out.println("Computer busted!"+computerTotal);
		                break;
		            }
		            else if(computerTotal == 21)
		            {
		                System.out.println("Comptuer Wins!");
		            }
		        }


		        if((userTotal < 21) && (userTotal > computerTotal))
		        {
		            System.out.println("User Wins!");
		        }
		        else 
		        {
		        	System.out.println("Comptuer Wins!");
		        }
		        System.out.println("Play Again!");
		        
		  
		    }
		}
		