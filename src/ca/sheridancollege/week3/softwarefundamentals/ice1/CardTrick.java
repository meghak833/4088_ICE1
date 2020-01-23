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

       Card users = new Card();
       System.out.println("What is your card's suit?(Hearts, Diamonds, Spades, Clubs)");
       users.setSuit(in.nextLine());
       System.out.println("What is your card's Number?(Ace = 1, Jack -11, Queen =12, King = 13)");
       users.setValue(in.nextInt());
        //insert code to ask the user for Card value and  or Hard code it, create their card           
        int match = 0;
       for(int s = 0; s < magicHand.length;s++){
           if(magicHandSuit[s].equals(users.getSuit()) && magicHand[s] == users.getValue()){
            match = 1;
            break;
           }else{match = 0;}
       }
       if(match == 0){
           System.out.println("There was no match.");
       }else{
           System.out.println("There is a Match!");
       }
        //Then report the result here
    }  
}
