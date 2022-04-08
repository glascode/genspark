package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        // 1:
        ////you approach the cave...
        ////it is dark and spooky...
        ////A large dragon jumps out in front of you ! He opens his jaws and...
        ////Gobbles you down in one bite!

        //createscanner
        Scanner scanner=new Scanner(System.in);

        //openingscene
        System.out.println("You are in a land of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into?(1 or 2)");


        //userinput
        int input=Integer.parseInt(scanner.nextLine());

        //conditions
        if(input==1){
            System.out.println("You approach the cave...");
            System.out.println("it is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you!He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");

        }
        else if(input==2){
            System.out.println("You approach the cave...");
            System.out.println("a warm light radiates from deep within , entrancing you");
            System.out.println("A large dragon floats around you, you feel comforted by its presence.");
            System.out.println("You fall gently to sleep, and wake up feeling refreshed in your home");
            System.out.println("with the fireplace still alight, and gold coins by your feet.");

        }



    }
}
