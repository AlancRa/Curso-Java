/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;

import java.util.Scanner;

/**
 *
 * @author Suricata
 */
public class SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto Scanner para introducir datos 
        
        Scanner entrada = new Scanner(System.in);
         
        int numero1;
        int numero2;
        int suma;
        
        System.out.print("Escriba el primer número entero:");
        numero1 = entrada.nextInt();//Lee el primer numero del usuario
        System.out.print("Escriba el segundo número entero:");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        System.out.print("La suma es:"+suma);
        
        
    }
    
}
