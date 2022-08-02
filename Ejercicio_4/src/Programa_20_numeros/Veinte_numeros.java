
package Programa_20_numeros;

import java.util.Scanner;

public class Veinte_numeros {
    
    public static void main(String[]vargs){
    
    int matriz [][]= new int [5][4];
    
    
    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeros = sp.nextInt();
        matriz[i][j] = numeros;
        
        
        }
}
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++){
            
            System.out.print(" | "+matriz [i][j]+" | ");
            
            
            
        }
        System.out.println("      ");
        System.out.println("----------------\n");
}
    
}
    
    
}
