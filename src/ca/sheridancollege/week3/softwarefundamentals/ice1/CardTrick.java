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
 * @modifier Vaishnav Akavaram
 * @StudentID: 991578795
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        double randCard = (Math.random() * 13);
        double randSuit = (Math.random() * 4);
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue((int) randCard);
            c.setSuit(Card.SUITS[(int)randSuit]);   
        }
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        Card yourCard = new Card();
        
        yourCard.setValue(8);
        
        //Then report the result here
        System.out.println(yourCard.getValue());
    }
    
}
