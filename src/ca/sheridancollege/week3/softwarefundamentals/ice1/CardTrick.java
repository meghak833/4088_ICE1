/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel
 * @author Alexander Low
 * @studentNumber 991266865
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 12) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 3)]);
            magicHand[i] = c;
            System.out.println(c.getValue() +" of "+c.getSuit());
        }

        //insert code to ask the user for Card value and  or Hard code it, create their card
        try {
            boolean found = false;
            Scanner ln = new Scanner(System.in);
            System.out.println("Please enter a card suit (A String): ");
            String suit = ln.nextLine().substring(0, 1).toLowerCase();
            System.out.println("Please enter a card value (An integer): ");
            int value = ln.nextInt();
            for (int i = 0; i < magicHand.length; i++) {
                if ((magicHand[i].getValue() == value) && (magicHand[i].getSuit().substring(0, 1).toLowerCase().equals(suit))) {
                    found = true;
                    System.out.println("Your card was found.");
                    String cardValue;
                    switch (value) {
                        case 1:
                            cardValue = "Ace";
                            break;
                        case 11:
                            cardValue = "Jack";
                            break;
                        case 12:
                            cardValue = "Queen";
                            break;
                        case 13:
                            cardValue = "King";
                            break;
                        default:
                            cardValue = Integer.toString(value);
                    }
                    System.out.println("It is the: " + cardValue + " of "
                            + magicHand[i].getSuit());
                } else {
                    if (found == false && i == magicHand.length - 1) {
                        System.out.println("Your card was not found");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
