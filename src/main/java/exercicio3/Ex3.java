/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author vinicius.poliveira14
 */
public class Ex3 {
    public static void main(String[] args) {
        Ex3 ex = new Ex3();
        
        System.out.println(ex.pow(2, 5));
    }
    
    public int pow(int base, int exp) {
        if(exp == 1) {
            return base;
        }
        
        return base * pow(base, exp - 1);
    }
}
