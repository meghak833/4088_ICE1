
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Jack Farrell
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here);
            c.setValue((int) Math.random());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) Math.random() * 4]);
        }
        //insert code to ask the user for Card value and  or Hard code it, create their card
        Scanner userIn = new Scanner(System.in);
        System.out.println("Pick a card any card! (please enter a card value and suit e.g '4 hearts'): ");
        String userValue = userIn.next();
        String userSuit = userIn.nextLine();
        
        userValue.toLowerCase();
        
        int userCardParse;
        if(userValue.contentEquals("king")) {
        	userCardParse = 13;
        } else if(userValue.contentEquals("queen")) {
        	userCardParse = 12;
        } else if (userValue.contentEquals("jack")) {
        	userCardParse = 11;
        } else if(userValue.contentEquals("ace")) {
        	userCardParse = 1;
        } else {
        	userCardParse = Integer.parseInt(userValue);
        }
        
        Card userCard = new Card();
        
        userCard.setSuit(userSuit);
        userCard.setValue(userCardParse);
        
        String suitResult;
        if (userCardParse == 13) {
        	suitResult = "King";
        } else if(userCardParse == 12) {
        	suitResult = "Queen";
        } else if(userCardParse == 11) {
        	suitResult = "Jack";
        } else if (userCardParse == 1) {
        	suitResult = "Ace";
        } else {
        	suitResult = String.valueOf(userCardParse);
        }
        //Then report the result here
        System.out.println(userCard.toString(userSuit, suitResult));
    }
    
}