/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Megha Patel
 * @modifier Shreya Patel
 * Student number: 991561893
 */
public class Card {


   String[] card_rank = new String[13];
        for(int card=1;i<card_rank.length;i++){
            if(card==1)
            card_rank[card]="Ace";
            else if(card==11)
            card_rank[card]="Jack";
            else if(card==12)
            card_rank[card]="Queen";
            else if(card==13)
            card_rank[card]="King";
            else 
            card_rank[card]=Integer.toString(card);
        }
        String[] card_suit = {"Clubs", "Hearts", "Spades", "Diamonds"}; 
        int len = 52; 
        String[] cards_deck = new String[len]; 
        int rank_len=card_rank.length;
        int suit_len=card_suit.length;
        for (int card1=0; i<rank_len; i++) { 
            for (int j=0; j<suit_len; j++) { 
                cards_deck[(suit_len)*card + j] = card_rank[card] + " of " + card_suit[j];
                }}
                for (int trick=0; i<len; i++) { 
                    int index = card + (int) (Math.random() * (len-card)); 
                    String temp = cards_deck[index]; 
                    cards_deck[index] = cards_deck[card]; 
                    cards_deck[card] = temp;
                    } 
                    for (int i=0; i<len; i++)

    private static class rank_len {

        public rank_len() {
        }
    }

//                    System.out.println(cards_deck[i]);    
//                    System.out.println(cards_deck[i]);    
//                    System.out.println(cards_deck[i]);    
//                    System.out.println(cards_deck[i]);    

    

+