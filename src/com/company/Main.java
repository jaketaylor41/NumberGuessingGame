package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        boolean restart = true;
        boolean ask = true;
        String userResponse = ("Yes");
        System.out.println("Please enter a number between 1-10,000");
        int maxNumber = 10000;
        Random rNumber = new Random();
        int jakesRandom = rNumber.nextInt(maxNumber);
        int counter = 0;
        String numberOfInputs;

        for (int i = 0; i <10000 ; i++) {
            counter++;
            if (counter <10000){
                numberOfInputs = String.valueOf(counter);
            }

        }


        while (ask) {
            String inputNumber = sc.nextLine();
            int userNumber = Integer.parseInt(inputNumber);

            if (userNumber > jakesRandom) {
                System.out.println("Number is too high, enter a lower number:");


            } else if (userNumber < jakesRandom) {
                System.out.println("Number is too low, enter a higher number");

            } else if (userNumber == jakesRandom) {
                System.out.println("You are correct.");

            }

            if (userNumber > jakesRandom || userNumber < jakesRandom) {
                ask = true;
            } else {
                ask = false;
            }


        }

    }
}
