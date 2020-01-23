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
 * @modifier Nidhi Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
       
        for (int i = 0; i<magicHand.length ;i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) ( Math.random()*13));
             //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[ (int) (Math.random()*3)]);
            
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        Card c1 = new Card();
        c1.setValue(1);
        c1.setSuit("Hearts");
       
        
        
        //insert code to ask the user for Card value and  or Hard code it, create their card
        System.out.println("lucky number ="+c1.getValue());
        System.out.println("lucky suit="+c1.getSuit());
        //Then report the result here
    }
    
}
