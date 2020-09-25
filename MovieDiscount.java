/*
 * Programmer: Jordan Nicholson
 * Date: September 25, 2020
 * Purpose: To tell the user the price of their movie ticket.
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
    	
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();
        
        
        // Read in a true/false value
        if (age < 13 || age > 65) {
        	if (hasCoupon) { 
        	//Prints total price if user has age and coupon discount
        		System.out.println("Your ticket costs $9.5.");
        	}
        	else { 
        	//Prints total price if user has only age discount
        		System.out.println("Your ticket costs $11.5.");
        	}
        }
        else {
        	if (hasCoupon) { 
        	//Prints total price if user has only coupon discount
        		System.out.println("Your ticket costs $12.5.");
        	}
        	else { 
        	//Prints total price if user has no discount
        		System.out.println("Your ticket costs $14.5.");
        	}
        }

    }
}
