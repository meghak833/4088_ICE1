/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * modifier Jordan Lee
 * Student ID: 991559759
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 3)]);
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Spades");
        
        //Then report the result here
        System.out.println("Lucky card: " + luckyCard.getValue() + luckyCard.getSuit());
    }
    
}
