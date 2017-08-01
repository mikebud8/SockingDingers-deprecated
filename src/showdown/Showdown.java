/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdown;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mikebud
 */
public class Showdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //3 outs for an inning
        int outs = 0;
        int numBatters = 1;
        int bases = 0;
        int outcome;
        int battersThisInning;
        
        while(outs < 3){

        //pOut, pSing, pDoub, and pHr0    
        Pitcher currentPitcher = new Pitcher(17, 18, 19, 20, "Evy Mud");
        
        //bOut, bSing, bDoub, bTrip, bHr0, onBase
        Batter currentBatter = new Batter(4, 12, 15, 16, 20, 10, "Miked00d");

        Showdown showDown = new Showdown();
        System.out.println(currentPitcher.playersName + " is pitching against " +
                currentBatter.playersName);
        
            outcome = rollDice(20, 1, "Pitcher");

        
        if (outcome <= currentBatter.get_onBase()) {
            System.out.println("Batter's Advantage");
            int bOutcome = rollDice(20, 1, "Batter");
            //int bOutcome = 2; //debug hit

            if (bOutcome <= currentBatter.get_Out()) {
                outs++;
                bases = 0;
                System.out.println("You're out!!! (" + outs +")");
                
            } else if (bOutcome <= currentBatter.get_Single()) {
                System.out.println("You're safe at first.");               
                bases = 1;
                
            } else if (bOutcome <= currentBatter.get_Double()) {
                System.out.println("Stand up double!!");
                bases = 2;
                
            } else if (bOutcome <= currentBatter.get_Triple()) {
                System.out.println("He slides into third!!");
                bases = 3;
            } else {
                System.out.println("This guy is socking dingers!!!");
                bases = 4;
            }

        } else {
            System.out.println("Pitcher's Advantage");
            int pOutcome = rollDice(20, 1, "Batter");
            //int bOutcome = 2; //debug hit

            if (pOutcome <= currentPitcher.get_Out()) {
                outs++;
                bases = 0;                
                System.out.println("You're out!!! (" + outs +")");

                
            } else if (pOutcome <= currentPitcher.get_Single()) {
                System.out.println("You're safe at first.");
                bases = 1;
                
            } else if (pOutcome <= currentPitcher.get_Double()) {
                System.out.println("Stand up double!!");
                bases = 2;
                
            } else {
                System.out.println("This guy is socking dingers!!!");
                bases = 4;
            }
        }
        System.out.println("The batter advanced " + bases + " base(s)");
        //   System.out.println("Your dice total was " + outcome);
    }
    }
    
    public static int rollDice(int dSides, int nDice, String player) {

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
        int randomNum = 0;
        //int dTotal = 0;

        for (int i = 1; i <= nDice; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(1, dSides + 1);
            System.out.println(player + "'s roll equals " + randomNum);
            //dTotal = dTotal + randomNum;
        }
        return randomNum;
    }

}
