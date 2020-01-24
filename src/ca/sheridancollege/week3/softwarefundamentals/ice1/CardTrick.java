/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Karandeep Singh
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(1 + (int) (Math.random() * 13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[1 + (int) (Math.random() * 3)]);
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }

        //insert code to ask the user for Card value and  or Hard code it, create their card
        System.out.println("Enter lucky card number");
        int value = sc.nextInt();
        System.out.println("Enter lucky card suit");
        String suit = sc.next();
        Card c1 = new Card();
        c1.setValue(value);
        c1.setSuit(suit);

        //Then report the result here
        System.out.println("Lucky number: " + c1.getValue());
        System.out.println("Lucky suit: " + c1.getSuit());
    }

}
