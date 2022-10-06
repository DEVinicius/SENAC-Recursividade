/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author vinicius.poliveira14
 */
public class Ex4 {
    public static void main(String[] args) {
        Ex4 ex = new Ex4();
        
        System.out.println(ex.binaryConvert(29));
    }
    
    public String binaryConvert(int number) {
        if(number == 1) {
            return "1";
        } 
        
        if(number == 2) {
            return "0";
        }
        
        int modNumber = number % 2;
        
        if(modNumber == 1) {
            number = (number - 1) / 2;
        } else {
            number = number / 2;
        }
        
        return binaryConvert(number) + Integer.toString(modNumber);
    }
}
