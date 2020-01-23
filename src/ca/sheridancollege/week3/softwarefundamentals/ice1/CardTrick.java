/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel
 * @modifier Jack Jozwik - 991281499
 */
public class CardTrick {

    public static void main(String[] args) {
        CardTrick self = new CardTrick();
        Scanner reader = new Scanner(System.in);
        Random rnd = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rnd.nextInt(12) + 1);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;

            //added printing statements in git
            //moved switch statement to method
            System.out.println(self.cardValueConvert(c) + " of " + c.getSuit());
        }

        Card luckyCard = new Card();
        //no try-catch
        System.out.print("Enter favorite suit(Hearts, Diamonds, Spades, Clubs): ");
        luckyCard.setSuit(reader.nextLine());
        System.out.print("Enter favorite number: ");
        luckyCard.setValue(reader.nextInt());

        //loop for iterating over Card[] array and assigning flag
        boolean flag = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getValue() == magicHand[i].getValue()
                    && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }

        //printing method call (self object - non static)
        self.printLuckyCard(flag, luckyCard);
    }

    //method for checking flag and printing
    public void printLuckyCard(boolean flagP, Card luckyP) {
        if (flagP) {
            System.out.println("Your lucky card was found: "
                    + luckyP.getValue() + " of " + luckyP.getSuit());
        } else {
            System.out.println("Not Found");
        }
    }

    //method for converting face cards
    public String cardValueConvert(Card cardP) {
        switch (cardP.getValue()) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "" + cardP.getValue();
        }
    }

}
