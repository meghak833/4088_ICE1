/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 * 
 * @author Megha Patel
 * 
 * 
 * @author Kiran Hart
 * @studentNumber 991564297
 */
public class CardTrick {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Card[] magicHand = new Card[7];
		
		for (int i = 0; i < magicHand.length; i++) {
			Card c = new Card();
			c.setValue(ThreadLocalRandom.current().nextInt(1, 14));
			c.setSuit(Card.SUITS[ThreadLocalRandom.current().nextInt(0, 4)]);
			magicHand[i] = c;
		}
		
		for (int i = 0; i < magicHand.length; i++) {
			System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
		}
		
		// insert code to ask the user for Card value and or Hard code it, create their
		// card
		System.out.println("Enter card number:");
		int cardNumber = 0;
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Enter card number: ");
		}
		cardNumber = scanner.nextInt();
		if (cardNumber < 1) cardNumber = 1;
		if (cardNumber > 13) cardNumber = 13;
		
		System.out.println("Enter Suit\n1 - Hearts\n2- Diamonds\n3- Spades\n4 - Clubs");
		int cardType = 0;
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Enter Suit\n1 - Hearts\n2- Diamonds\n3- Spades\n4 - Clubs");	
		}
		cardType = scanner.nextInt();
		if (cardType < 1) cardType = 0;
		if (cardType > 4) cardType = 3;
		
		// setup the card
		Card userCard = new Card();
		userCard.setSuit(Card.SUITS[cardType - 1]);
		userCard.setValue(cardNumber);
		
		// Then report the result here
		System.out.println(userCard.getValue() + " of " + userCard.getSuit());
	}

}
