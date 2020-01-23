/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("The magic hand of 7 cards:");
        for (int i=0; i<magicHand.length; i++) {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        Scanner sc = new Scanner(System.in);
        Card luckyCard = new Card();
        System.out.println("Please enter your Lucky Card's suit: ");
        luckyCard.setSuit(sc.nextLine());
        System.out.println("Please enter your Lucky Card's value: ");
        luckyCard.setValue(sc.nextInt());
        System.out.println("Your Lucky Card is: "+luckyCard.getSuit()+" "+
                            luckyCard.getValue());
        
        boolean isLuckyCardInArray = false;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(luckyCard.getSuit()) && 
                    magicHand[i].getValue()==luckyCard.getValue()){
                isLuckyCardInArray = true;
            }
        }
        
        if(isLuckyCardInArray) {
            System.out.println("Your Lucky Card is in the Magic Hand!");
        }
        else {
            System.out.println("Oops! Magic Hand does not have your Lucky Card.");
        }
        //insert code to ask the user for Card value and  or Hard code it, create their card
        
        //Then report the result here
    }
    
}
