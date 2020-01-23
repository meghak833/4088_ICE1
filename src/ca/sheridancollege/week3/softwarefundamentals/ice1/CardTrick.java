/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

//Import Random class to randomly draw cards
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @author Calvin Van, 991583612
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        //Declare an empty card array holding a "hand" of 7 randomly generated cards
        Card[] magicHand = new Card[7];
        
        //Fill the hand loop-wise with randomly drawn cards
        for (int i=0; i<magicHand.length; i++)
        {
            //Declare a new card object for this loop iteration
            Card c = new Card();
            //Declare a random class object
            Random draw = new Random();
            
            //Use the draw object's nextInt method to generate the card's value and suit
            //The nextInt method is modified to span from 1 to 13 (all inclusive) for card value
            c.setValue(draw.nextInt(13) + 1);
            c.setSuit(Card.SUITS[draw.nextInt(Card.SUITS.length)]);
            
            //Insert the card into magicHand
            magicHand[i] = c;
        }
        
        //Output each card in magicHand loop-wise
        for(int x=0; x<magicHand.length; x += 1){
            switch(magicHand[x].getValue()){
                case 1:
                    System.out.println("Ace of " + magicHand[x].getSuit());
                    break;
                case 11:
                    System.out.println("Jack of " + magicHand[x].getSuit());
                    break;
                case 12:
                    System.out.println("Queen of " + magicHand[x].getSuit());
                    break;
                case 13:
                    System.out.println("King of " + magicHand[x].getSuit());
                    break;
                default:
                    System.out.println(magicHand[x].getValue() + " of " + magicHand[x].getSuit());
                    break;
            }
        }
        //Declare a lucky card object as King of Hearts
        Card lucky = new Card();
        lucky.setValue(13);
        lucky.setSuit(lucky.SUITS[0]);
        //Output the user's lucky card as King of Hearts by passing it through the same switch body as above
        switch(lucky.getValue()){
                case 1:
                    System.out.println("Your lucky card is: Ace of " + lucky.getSuit());
                    break;
                case 11:
                    System.out.println("Your lucky card is: Jack of " + lucky.getSuit());
                    break;
                case 12:
                    System.out.println("Your lucky card is: Queen of " + lucky.getSuit());
                    break;
                case 13:
                    System.out.println("Your lucky card is: King of " + lucky.getSuit());
                    break;
                default:
                    System.out.println("Your lucky card is: " + lucky.getValue() + " of " + lucky.getSuit());
                    break;
            }
    }
    
}
