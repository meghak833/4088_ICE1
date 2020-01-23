/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @modfier Chhogyal Bhotia on 23/01/2020
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] magicHand = new int[7];
        String[] magicHandSuit = new String[7];
        
        for (int i=0; i<magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13));
            c.setSuit(Card.SUITS[(int)Math.random()*4]);
            magicHand[i] = c.getValue();
            magicHandSuit[i] = c.getSuit();
        }

    }  
}
