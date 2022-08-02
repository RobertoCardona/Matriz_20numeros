
package Ejercicio_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    
    int array [] = new int[6];
    
    public static void main(String[]vargs)  {
    
            ArrayList<Carros> la_lista = new ArrayList<>();
            Scanner sp1 = new Scanner(System.in);
            
            System.out.println("Ingrese la marca: ");
            String marca = sp1.nextLine();
            
            System.out.println("Ingrese el modelo: ");
            String modelo = sp1.nextLine();
            
            System.out.println("Ingrese el año: ");
            int año = sp1.nextInt();
            
            System.out.println("Ingrese el numero de puertas: ");
            int no_puertas = sp1.nextInt();
            
            System.out.println("Ingrese el motor: ");
            int motor = sp1.nextInt();
            
            System.out.println("Ingrese los hp: ");
            int hp = sp1.nextInt();
            
            la_lista.add(new Carros(marca,año,modelo,no_puertas,motor,hp));
    
            for (Carros sp : la_lista){
                System.out.println("Marca: "+sp.marca);
                System.out.println("Año: "+sp.año);
                System.out.println("Modelo: "+sp.modelo);
                System.out.println("Numero de puertas: "+sp.no_puertas);
                System.out.println("Motor: "+sp.motor);
                System.out.println("Horsepower: "+sp.hp);
            }
    }  
    
}
