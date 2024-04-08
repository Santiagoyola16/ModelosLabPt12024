/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.modelos;

import static java.lang.Math.random;
import static java.lang.System.out;

/**
 *
 * @author Familia
 */
public class LabModelos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int rand = ArrTime(Math.random());
        System.out.println(""+rand);
        
        

        
    }
    
    public static int ArrTime(double seed){
        if(seed<0.35)
            return 10;
        else if(seed<0.80)
            return 15;
        else 
            return 17;
                 
    }
    
    public int DepTime(double seed){
        if(seed<0.38)
            return 8;
        else if(seed<0.70)
            return 10;
        else if(seed<0.80)
            return 13;
        else 
            return 15;
                 
    }
    
}
