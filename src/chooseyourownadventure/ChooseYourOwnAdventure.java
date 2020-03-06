/*
 * Program is a choose your own adventure game, about a wrestler.
 * Made by Tarkan Dahi on the 6th of March, 2020
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;

import java.util.Scanner ;
/**
 *
 * @author tADAH5199
 */
public class ChooseYourOwnAdventure {

    
    public static void main(String[] args) {
        //Variable Declaration Area
        Scanner keyedInput = new Scanner(System.in);
        String choiceA;
        String choiceB;
        String choiceC;
        String choiceD;
        
        // Below is information and the backstory for the user to be able to play this game.
        //Along with first choice.
        System.out.println("For every choice, please enter Y for yes, and N for no.");
        System.out.println("You are a wrestler, about to start your match in the"
                + " World Wrestling Championship finals. This match is for the trophy.");
        System.out.println("Do you decide to enter the finals?");
        choiceA = keyedInput.nextLine();
        if (choiceA.equals("Y")) //This is the first choice, which leads to the rest of the story.
        {
            System.out.println("You decide to enter the finals");
            System.out.println("You enter the ring, ready to fight your opponent and bring home the trophy.");
            System.out.println("The referee blows his whistle, do you go for a german suplex?");
            
            choiceB = keyedInput.nextLine();//2nd choice in the story, which move to go for?
            if (choiceB.equals("Y")) 
            {
                System.out.println("You go for a german suplex, your opponent easily dodges and pins you to the ground. You lost.");
                System.out.println("Please rerun the game if you would like to restart");
            }

            else 
            {
                System.out.println("Instead of the wild German Suplex, you go for the standard leg tackle.");
                System.out.println("You successfuly pushed your opponent off balance");
                System.out.println("Do you go for the pin.");
                
                choiceC = keyedInput.nextLine(); //Third choice in story, this leads to the first succesful ending. 
                if (choiceC.equals("Y")) 
                {
                    System.out.println("You succesfully pin your opponent. You win the finals, and go home a World Champion");
                    System.out.println("Congratulations, you have won this game!!!");
                    System.out.println("Please rerun the game if you would like to restart");
                }
                
                else 
                {
                    System.out.println("Instead of going for the pin, you follow up your leg tackle by flipping your opponent over. ");
                    System.out.println("Your opponent is left defenseless, do you go for the pin?");
                    
                    choiceD = keyedInput.nextLine();//This is the 4th and final choice
                    if (choiceD.equals("Y")) // This decides if you ending is you win or lose.
                    {
                        System.out.println("You succesfully pin your opponent. You win the finals, and go home a  champion.");
                        System.out.println("Congratulations, you have won this game!!!");
                        System.out.println("Please rerun the game if you would like to restart");

                    }
                    else 
                    {
                        System.out.println("In a blink of the eye, your opponant jumps up and pins you to the ground, expertly holding you defenceless and unable to free yourself.");
                        System.out.println("You lost the finals. You should have pinned him.");
                        System.out.println("Please rerun the game if you would like to restart");
                    }
                }
            }
                
        }
        else 
        {
            System.out.println("You have decided to forfeit.");
            System.out.println("Please rerun the game if you would like to restart");
        }
    }
    
}
