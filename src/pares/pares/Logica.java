/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pares.pares;

import java.applet.AudioClip;
import java.util.Random;

/**
 *
 * @author Rojeru San
 */
public class Logica {
     public int[] getNumeros() {
        
        int[] numbers = new int[18];
        int count = 0;
        
        while(count < 18) {
            Random r = new Random();
            int pares = r.nextInt(9) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 18; i++) {
                if(numbers[i] == pares) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = pares;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
}
