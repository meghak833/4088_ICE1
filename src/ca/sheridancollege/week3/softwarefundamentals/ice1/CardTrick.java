/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Jack Jozwik - 991281499
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rnd.nextInt(12) + 1);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            switch(c.getValue()) {
                    case 1:
                    System.out.println("Ace" + " of " + c.getSuit());
                    break;
                case 11:
                    System.out.println("Jack" + " of " + c.getSuit());
                    break;
                case 12:
                    System.out.println("Queen" + " of " + c.getSuit());
                    break;
                case 13:
                    System.out.println("King" + " of " + c.getSuit());
                    break;
                 default:
                     System.out.println(c.getValue() + " of " + c.getSuit());
                     break;
            }
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
}
