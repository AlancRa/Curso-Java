/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuoperaciones;

import java.util.Scanner;

/**
 *
 * @author Suricata
 */
public class MenuOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int opciones=0;
        int numero1,numero2,numero3,numero4,numero5,numero6;
        int resultado,resultado2,resultado3;
        
        System.out.println("-----Menu de Opciones-----\n"+
                "1.-SUMA\n"+
                "2.-RESTA\n"+
                "3.-MULTIPLICACIÓN\n");
        
        System.out.println("Ingresa una opción:");
        opciones = entrada.nextInt();
        
        switch(opciones){
        
            case 1:
                System.out.println("---SUMA DE ENTEROS---");
                System.out.println("Ingresa un número:");
                numero1 = entrada.nextInt();
                System.out.println("Ingresa un segundo número:");
                numero2 = entrada.nextInt();
                
                resultado = numero1+numero2;
                System.out.println("El resultado de la suma es:"+resultado);
                break;
                
            case 2:
                System.out.println("---RESTA DE ENTEROS---");
                System.out.println("Ingresa un número:");
                numero3 = entrada.nextInt();
                System.out.println("Ingresa un segundo número:");
                numero4 = entrada.nextInt();
                
                resultado2 = numero3-numero4;
                System.out.println("El resultado de la resta es:"+resultado2);
                break;
                
            case 3:
                System.out.println("---MULTIPLICACIÓN DE ENTEROS---");
                System.out.println("Ingresa un número:");
                numero5 = entrada.nextInt();
                System.out.println("Ingresa un segundo número:");
                numero6 = entrada.nextInt();
                
                resultado3 = numero5*numero6;
                System.out.println("El resultado de multiplicarlos es:"+resultado3);
                
                break;
            
        }
    }
    
}
