
package com.rfussell;

/**
 * Assignment1 Q9, COMP 268
 * Class: AddressBook.java
 * Purpose: Iterates through numbers 0 - 113 and adds a message if applicable
 * @author: Robin Fussell
 * Date:  October 5, 2019
 * Version 1.0


This program runs a class which calls from 4 other methods that calculate the current number
to see if i is odd, i is divisible by 5, i and the number following i divisible by 7 and if it is a prime number.
It iterates through numbers 0-113 by using a for loop, and then calls the methods during if statements to
print out the results to the user. The output should be numbers 0-113, with (if applicable) the words
"is odd","hi five", "wow" and "prime" separated by a comma.



 */
import java.lang.*;


public class Iterate {

    //Main method for running the class.

    public static void main (String[] args) {
        IterateNumbers(0);

    }

// The loop starts here to check if odd, divisible by 5, 7, or prime.
    //prints out the number as well as applicable phrases.

    public static void IterateNumbers(int i) {
        for (i = 0; i <= 113; i++) {
            System.out.print(i);

            if (isOdd(i)) {
                System.out.print(", is odd");
            }
            if (isDivisibleBy5(i)) {
                System.out.print(", hi five");
            }
            if (isDivisibleBy7(i)) {
                System.out.print(", wow");
            }
            if (isPrime(i)) {
                System.out.print(", prime");
            }
            System.out.print("\n");
        }
    }



//checks if number is odd

    public static boolean isOdd (int n) {
        return n % 2 != 0;
    }

// checks if number is prime

    public static boolean isPrime (int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

// checks if number is divisible by 5

    public static boolean isDivisibleBy5 (int n) {
        if(n == 0)return false;
        return n % 5 == 0;
    }

    //checks if number and number following are both divisible by 7

    public static boolean isDivisibleBy7 (int n) {
        if(n == 0) return false;
        return n % 7 == 0 && n++ % 7 == 0;
    }
}


//end