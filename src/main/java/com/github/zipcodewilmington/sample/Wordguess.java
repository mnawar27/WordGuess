package com.github.zipcodewilmington.sample;
import java.util.Scanner;

public class Wordguess {

    //Maisha Nawar
    public String Lose() {

        int tries = 0;
        String userInput = "";
        for (int i = 4; i > 0; i--) {
            System.out.println("Let's Play Wordguess version 1.0");
            System.out.println("Current Guesses:");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            //System.out.println(userInput);
            tries = i;
            System.out.println("You have " + tries + " tries");
            System.out.println("Enter a single character:");
            userInput = scanner.nextLine();
        }

        return userInput;

    }

    public static void main(String[] args){
        Wordguess wg = new Wordguess();

        wg.Lose();
    }
}