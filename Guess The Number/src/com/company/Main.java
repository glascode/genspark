package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here

        //initalize scanner
        Scanner scanner = new Scanner(System.in);

        //initalize random number generation

        //start game
        String restart = "y";
        int play = 0;
        do {
        Random rand = new Random();
        int randNumber = rand.nextInt(21);
        if(randNumber == 0)
        {randNumber++;}

        String userName;
            System.out.println("Hello, what is your name");
            userName=scanner.nextLine();
            System.out.println("Well, " + userName + " i am thinking of a number between 1 and 20");
            System.out.println("Take a guess.(you have 6 tries)");

            int userInput = Integer.parseInt(scanner.nextLine());

            int maxTries = 6;
            int guess = 0;

            for (int i = 0; i < 6; i++) {

                if (userInput == randNumber) {
                    guess++;
                    System.out.println("Good job " + userName + " you guessed my number in " + guess + " guesses!");
                    System.out.println("play again? Y/N");
                    restart = scanner.nextLine();
                    if(restart.equalsIgnoreCase("n")){play++; break;}
                    else if(restart.equalsIgnoreCase("y")) {break;}


                }
                if (maxTries == 1) {
                    System.out.println("You have no more tries left, you lose!");
                    System.out.println("play again? Y/N");
                    restart = scanner.nextLine();
                    if(restart.equalsIgnoreCase("n")){play++; break;}
                    else if(restart.equalsIgnoreCase("y")) break;

                }
                maxTries--;
                if (userInput < randNumber) {

                    System.out.println("Your guess is too low, you have " + maxTries + " tries remaining");
                    System.out.println("Take a guess");
                    userInput = Integer.parseInt(scanner.nextLine());
                    guess++;
                } else if (userInput > randNumber) {
                    System.out.println("Your guess is too high, you have " + maxTries + " tries remaining");
                    System.out.println("Take a guess");
                    userInput = Integer.parseInt(scanner.nextLine());

                    guess++;
                }
            }

        } while (play == 0);




    }

}

