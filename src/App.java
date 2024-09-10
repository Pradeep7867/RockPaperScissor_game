import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //WE are Building a Rock Paper Scissor Game in java

        //First Create a String array for Choices 
        String[] Choices = {"rock", "paper", "scissor"};

        //take a input from User
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("_-------------------------------------------------------------------_");
        while(true)// means till exit option is not selected like a infinite loop
        {
            System.out.println();
            System.out.print("Enter your choice by typing \"(rock, paper, or scissors)\". AND To exit the game, type 'quit': ");
            System.out.println();
            
            String userChoice = scanner.nextLine();
            System.out.println();
            // because if user Write like - Rock || roCk
            //Option is valid
            if(userChoice.equals("quit"))
            {
                System.out.println("Thanks for Playing");
                break; // -> break out from loop
            }
            // Now If user Not give r p s input

            if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissor")) {
                // Invalid input handling
            
                System.out.println();
                System.out.println("Invalid input! Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);

            String computerChoice = Choices[computerChoiceIndex];
            System.out.println("Computer choice: " + computerChoice);
            //like Basically Computer randomly chose any index between from our Choices array
           

            //Now Main Logic 
            if(userChoice.equals(computerChoice))
            {
                System.out.println();
                System.out.println("It's A Tie, Play Again.... ");
                System.out.println();
            }
            else if((userChoice.equals("rock")&& computerChoice.equals("scissors")) || (userChoice.equals("scissors")&& computerChoice.equals("paper"))|| (userChoice.equals("paper")&& computerChoice.equals("rock")))
            {
                System.out.println();
                System.out.println("You Win :: ");
            }
            else
            {
                System.out.println();
                System.out.println("You Lose ::");
               
            }
        }
        scanner.close();
    }
}
