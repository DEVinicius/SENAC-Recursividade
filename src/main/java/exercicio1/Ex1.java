/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author vinicius.poliveira14
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(result(5));
    }
    
    public static int result(int n) {
        if(n == 1) {
            return 2;
        }
        
        return 2 * result(n - 1);
    }
}
