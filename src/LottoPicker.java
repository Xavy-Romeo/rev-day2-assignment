/*
    LottoPicker will generate a random number 0-30
    and print out 5 distinct random numbers to the user

    1 - figure out how to generate a random number
    2 - repeat step 1, 5 times
    3 - store the results of step 2
    4 - we need to print results
 */

// this is a single line

/* Casing? Where are the capitals
    - Pascal - Where the first letter and every first letter of every new word is capitalized
    - camelCase - the first letter of the first word is lower case, but every other first letter is capitalized
 */

import java.util.Random;

public class LottoPicker {
    public static void main(String[] args) {

        // dataType variableName = theValueToBeStored
        String nameOfIt = "Application started...";
        System.out.println(nameOfIt);

//        double randomNumber = Math.random();
//        System.out.println(randomNumber);

        Random random = new Random();


        int numberofNumbersGenerated = 0;
        int total = 5;

        while(numberofNumbersGenerated < total) {
            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);

            numberofNumbersGenerated += 1;
        }

        /*
            Programming is the combination of iteratives and conditionals
                - Iteratives - repeating a process over and over
                - Conditionals - checking a condition (true/false) to decide what to do or if I should keep doing something

            Control Flow - different types of statements that affect the flow of a program
                Iterative - loops:
                    while loop - while a condition is true, keep executing
                    do while loop - similar to a while loop, but guaranteed to run once

                Condition -
                    if - checks if a condition is true, if it is it will execute once
                    else - executes if an if check evaluates to false


         */

    }
}
