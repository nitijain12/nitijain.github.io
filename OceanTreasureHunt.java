import java.util.Scanner;
import java.util.Random;

public class OceanTreasureHunt 
 {

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int treasureSpot = rand.nextInt(10) + 1;
        int attempts = 5;

        System.out.println( "\n welcom to the ocean treasure hunt! 🐠" );
        System.out.println( "A treasure chest is hidden somewhere inside of the sea (numbers between 1 and 10)!" );
        System.out.println("You are a diver 🧜‍♀️ with "  + attempts + " oxygen tanks!!" );
        System.out.println("try finding the treasure before you run out of oxygen!\n");

        while (attempts > 0) {
            System.out.print( "🌊 Enter your dive location (pick number between 1-10): " );
            int guess;

            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(  "🚫 Not a valid number, Try again" );
                continue;
            }

            if (guess < 1 || guess > 10) {
                System.out.println( "🌪 outside the dive zone, stay between 1-10!" );
                continue;
            }

            if (guess == treasureSpot) {
                System.out.println( "🎉 You found the treasure chest! 💰🪙🎊" );
                break;
            } else {
                attempts--;
               // String hint = guess < treasureSpot ? "deeper into the ocean 🌊" : "closer to the shore 🏖️";
                System.out.println( "❌ theres no treasure here " + hint + "oxygen tanks left: " + attempts );
            }

            if (attempts == 0) {
                System.out.println( "\n💀 uh oh, you ran out of oxygen. Treasure remains lost at sea... 🪸" );
                System.out.println("💎 the treasure was at spot: " + treasureSpot);
            }
        }

        System.out.println("\thank you for playing Ocean Treasure Hunt withus! 🐬" );
    }
}
