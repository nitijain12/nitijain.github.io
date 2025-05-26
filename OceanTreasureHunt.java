import java.util.Scanner;
import java.util.Random;

public class OceanTreasureHunt 
 {

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int treasureSpot = rand.nextInt(10) + 1;
        int attempts = 5;

        System.out.println( "\n🌊 Welcome to the Ocean Treasure Hunt! 🐠" );
        System.out.println( "A treasure chest is hidden somewhere under the sea (between 1 and 10)!" );
        System.out.println("You are a brave diver 🧜‍♀️ with "  + attempts + " oxygen tanks 🐡" );
        System.out.println("Try to find the treasure before you run out of oxygen!\n");

        while (attempts > 0) {
            System.out.print( "🌊 Enter your dive location (1-10): " );
            int guess;

            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(  "🚫 Not a valid number! Try again." );
                continue;
            }

            if (guess < 1 || guess > 10) {
                System.out.println( "🌪️ That’s outside the dive zone! Stay within 1-10!" );
                continue;
            }

            if (guess == treasureSpot) {
                System.out.println( "🎉 You found the treasure chest! 💰🪙🎊" );
                break;
            } else {
                attempts--;
                String hint = guess < treasureSpot ? "deeper into the ocean 🌊" : "closer to the shore 🏖️";
                System.out.println( "❌ No treasure here... Try " + hint + ". Oxygen tanks left: " + attempts );
            }

            if (attempts == 0) {
                System.out.println( "\n💀 Oh no! You ran out of oxygen! The treasure remains lost at sea... 🪸" );
                System.out.println("💎 The treasure was at spot: " + treasureSpot);
            }
        }

        System.out.println("\nThanks for playing Ocean Treasure Hunt! 🐬" );
    }
}
