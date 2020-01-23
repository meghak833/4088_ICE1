/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Michael Woloszyn
 * @modifier Michael Woloszyn
 */
public class CardTrick{
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] value = new int[7];
        String[] suit = new String[7];
        for (int i=0; i<value.length; i++)
        {
            value[i]=((int)(Math.random() * 14));
            suit[i]=(Card.SUITS[(int)(Math.random() * 4)]);
        }
        System.out.println("Enter value between 0 and 6: ");
        int cardv= s.nextInt();
        int v = value[cardv];
        String sa = suit[cardv];
        System.out.println("Card value is: " + v + " " + sa);
    }
    
}
