/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modifier Ha Neul Moon
 * student number: 991246554
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random r = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(14));
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // Print the 7 cards
        for (int i = 0; i < magicHand.length; i++){
            System.out.print(magicHand[i].getValue() + magicHand[i].getSuit() + " "); // semi colon added in netbeans
            // .getValue() and .getSuit() method added in netbeans
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("\nEnter a number between 1 to 7: ");
        n = s.nextInt() - 1;
        
        
        //Then report the result here
        System.out.println("Your lucky card is: " + magicHand[n].getValue() + magicHand[n].getSuit());
    }
    
}
