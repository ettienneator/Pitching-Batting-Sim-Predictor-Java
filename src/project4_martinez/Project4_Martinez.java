/**
 * Project 4 for CS 1180.
 * The program simulates a pitcher throwing to a batter
 * and determines whether the batter walks, struck out, or got a hit.
 */
package project4_martinez;

import java.util.Random;

/**
 * @author Ettienne Martinez
 * CS1180L-06
 * Lifeng Liu
 * Project 4
 */
public class Project4_Martinez {

    /**
     * Values for name, position, and average are coded into both pitcher and batter.
     * The program randomizes a chance, and based on that number, determines whether
     * or not to add a strike, a ball, or a hit for the batter or pitcher.
     * Goes through loop until batter struck out, walks or hits the ball.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaring Variables.
        String name = null;
        String position = null;
        double average = 0;
        double chance = 0.0;
        Random rnd = new Random();
        int ball = 0;
        int strike = 0;
        boolean actionBatter;
        boolean actionPitch;
        
        //Calling the Classes.
        Pitcher pitcher = new Pitcher(name, position, average);
        Batter batter = new Batter(name, position, average);
        
        //Setting the Pitcher's Properties.
        pitcher.setName("Iliana");
        pitcher.setPosition("pitcher");
        pitcher.setAverage(0.70);
        
        //Setting the Batter's Properties.
        batter.setName("Ettienne");
        batter.setPosition("Batter");
        batter.setAverage(0.25);
        
        //Displays, who is pitching and who is batting.
        System.out.println(pitcher.getName() + " is pitching to " + batter.getName());
        
        //Loops each throw to see if its a hit, strike out, or walk.
        do{
            
            //Runs the pitch and bat methods.
            actionPitch = pitch(rnd, chance, pitcher);
            
            //If pitch is bad, pitcher threw a ball.
            if(actionPitch == false){
                ball++;
                System.out.println(pitcher.getName() + " threw a ball.");
                System.out.println("The count is " + ball + " balls and " + strike + " strikes.");
            }
            
            //Runs the pitch and bat methods.
            actionBatter = batter(rnd, chance, batter);
            
            //If batter is bad, batter got a strie.
            if(actionBatter == false){
                strike++;
                System.out.println(batter.getName() + " swung and missed.");
                System.out.println("The count is " + ball + " balls and " + strike + " strikes.");
            }
            
        //Continue loop until the requirements are met.
        }while(actionBatter == true || strike >= 3 || ball >= 4);
        
        //If there were 4 balls, Batter walks.
        if(ball == 4){
            System.out.println(batter.getName() + " walks.");
        }
        
        //If there were 3 strikes, batter struck out.
        else if(strike == 3){
            System.out.println(batter.getName() + " struck out.");
        }
        
        //Else, Batter got a hit.
        else{
            System.out.println(batter.getName() + " got a hit.");
        }
    }
    
    /**
     * 
     * @param rnd Randomizer that is used to create random doubles.
     * @param chance The chance that the Pitcher will pitch a ball or a strike.
     * @param pitcher Brings all the properties that Pitcher has.
     * @return 
     */
    
    public static boolean pitch(Random rnd, double chance, Pitcher pitcher){
        
        //Randomizes the chance.
        chance = rnd.nextDouble() * 1;
        
        //If the chance is over the pitching average, then false.
        if(chance > pitcher.getAverage()){
            return false;
        }
        
        //Else, true.
        else{
            return true;
        }
    }
    
    /**
     * 
     * @param rnd Randomizer that is used to create random doubles.
     * @param chance The chance that the Batter will Hit the ball or miss and strike.
     * @param batter Brings all the properties that Batter has.
     * @return 
     */
    
    public static boolean batter(Random rnd, double chance, Batter batter){
        
        //Randomizes the chance.
        chance = rnd.nextDouble() * 1;
        
        //If the chance is over the batting average, then false.
        if(chance > batter.getAverage()){
            return false;
        }
        
        //Else, true.
        else{
            return true;
        }
    }
}