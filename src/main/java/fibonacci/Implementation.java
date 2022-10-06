/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

import java.util.Date;

/**
 *
 * @author vinicius.poliveira14
 */
public class Implementation {
    public static void main(String[] args) {
        Implementation imp = new Implementation();
        long maximoRec = imp.fibonacciRecursivo(8);
        long maximo = imp.fibonacciTradicional(8);

        System.out.println(maximo);
        System.out.println(maximoRec);

        /*long timeMilli = System.currentTimeMillis();
        System.out.println("Time in milliseconds using Date class: " + System.currentTimeMillis());
        
        long ultimoFib = imp.fibonacciTradicional(5000000);
        long newTimeMilli = System.currentTimeMillis();
        
        System.out.println("Time in milliseconds using Date class: " + System.currentTimeMillis());
        
        System.out.println("Diferenca eh: " + (newTimeMilli - timeMilli));*/
    }
    
    public long fibonacciTradicional(int n) {
        long ultimo;
        long penultimo;
        long seguinte;
        
        ultimo = 1;
        penultimo = 0;
        
        if(n == 1) {
            return 0;
        }
        
        if(n == 2) {
            return 1;
        }
        
        long i = 3;
        
        while(n >= i) {
            seguinte = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = seguinte;
            i ++;
        }
        
        return ultimo;
    }
    
    public long fibonacciRecursivo(int n) {
        if(n == 1) {
            return 0;
        }
        
        if(n == 2) {
            return 1;
        }
        
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}
