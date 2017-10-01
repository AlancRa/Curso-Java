/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorwhile;

/**
 *
 * @author Suricata
 */
public class ContadorWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;//Declara el contador 
        contador =0;//Inicializa el contador en 1 
        
        while (contador <=10){
            
            System.out.printf("%d",contador);
            ++contador;//Incrementa la variable de control en 1.
        }
        System.out.println();
    }
    
}
