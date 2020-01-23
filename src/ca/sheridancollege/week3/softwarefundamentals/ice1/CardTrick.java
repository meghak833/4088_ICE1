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
 * @author Ritik Kumar
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            System.out.println(c.getValue());
             System.out.println(c.getSuit());
                    
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card a=new Card();
        a.setValue(8);
        a.setSuit("heart");
        
        System.out.println("lucky number"+a.getValue());
         System.out.println("lucky number"+a.getSuit());
    }
    
}
