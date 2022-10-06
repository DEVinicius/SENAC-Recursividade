/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

/**
 *
 * @author vinicius.poliveira14
 */
public class Ex5 {
    public static void main(String[] args) {
        try {
            Ex5 ex = new Ex5();
        
            int[] array = {3,2,5,6,7,4,1,2};
            System.out.println("Posicao do Vetor " + (ex.linearSearchRec(array, 0,6)));
            System.out.println("Menor do Vetor " + (ex.findLowestRec(array, 0)));
            System.out.println("Soma dos elementos do Vetor " + (ex.sumElementsRec(array, 0)));


        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public int linearSearchRec(int[] array, int position, int number) throws Exception {
        if(array.length - 1 == position) {
            if(number == array[position]) {
                return position;
            }
            
            throw new Exception("Numero nao encontrado");
        }
        
        if(number == array[position]) {
            return position;
        }
        
        return linearSearchRec(array, position + 1, number);
    }
    
    public int linearSearch(int[] array, int number) throws Exception {
        for(int i = 0; i < array.length; i ++) {
            if(array[i] == number) {
                return i;
            }
        }
        
        throw new Exception("Numero nao encontrado");
    }
    
    public int findLowest(int[] array) throws Exception {
        if(array.length == 0) {
            throw new Exception("Vetor deve ser maior que zero");
        }
        
        int menor = array[0];
        for(int i = 0; i < array.length; i ++) {
            if(menor > array[i]){
                menor = array[i];
            }
        }
        
        return menor;
    }
    
    public int findLowestRec(int[] array, int position) {
        if(position == array.length - 1) {
            return array[position];
        }
        
        if(array[position] < findLowestRec(array, position + 1)) {
            return array[position];
        } 
        
        return findLowestRec(array, position + 1);
    }   
    
    public int sumElements(int[] array) {
        int sum = 0;
        
        for(int i = 0; i < array.length; i ++) {
            sum = sum + array[i];
        }
        
        return sum;
    }
    
    public int sumElementsRec(int[] array, int position) {
        
        if(position == array.length - 1) {
            return array[position];
        }
        
        return array[position] + sumElementsRec(array, position + 1);
    }
}
