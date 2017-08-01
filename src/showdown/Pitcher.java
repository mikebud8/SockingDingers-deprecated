/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdown;


/**
 *  public class Pitcher
 * 
 *  a pitcher object which will store pitecher stats
 * 
**/
public class Pitcher extends Player{
    
    
    /**
     *  Player class constructor
     * 
     *  Takes in pOut, pSing, pDoub, pTrip, and pHr0 Then sets these as the objects variables.
     * 
    **/
    public Pitcher(int in_Out, int in_Sing, int in_Doub, int in_Hr0, String name){
    
        Out = in_Out;
        
        Sing = in_Sing;
        
        Doub = in_Doub;
        
        //pitchers can't give up triples
        //Trip = in_Trip;
        
        Hr0 = in_Hr0;
        
        playersName = name;
    }
}
    
    
