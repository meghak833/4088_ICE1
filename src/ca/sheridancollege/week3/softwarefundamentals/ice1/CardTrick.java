/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(0 + (int)(Math.random() * ((13 - 1) + 1)) + 1);//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[0 + (int)(Math.random() * ((3 - 0) + 1))]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        Scanner k = new Scanner(System.in);
        System.out.print("What is you favorite card value? (0-13): ");
        int luckyValue = k.nextInt();
        Scanner s = new Scanner(System.in);
        System.out.print("What is your favorite card suit? (Hearts, Spades, etc.: ");
        String luckySuit = s.nextLine();
        //Then report the result here
        System.out.println("\nYour luncky card is the: " + luckyValue + " of " + luckySuit);
        
        System.out.println("\nYour hand contains: ");
        for (int i=0; i<magicHand.length; i++)
        {
        System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
    }
    
}
