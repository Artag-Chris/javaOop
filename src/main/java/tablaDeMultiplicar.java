
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Henao Aguirre
 */
public class tablaDeMultiplicar {
// metodo que permite multicar
    public void multiplicar(){
   //declaracion de variables 
       Scanner teclado = new Scanner(System.in);
       System.out.println("Dijite el numero que desea multiplicar hasta 10 veces : "); 
       int numero = teclado.nextInt();
       for( int i =1; i<=10; i++){
           System.out.println("el numero "+ numero +" X "+ i +" = " + (numero * i));
       }
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // usar objeto y su metodo de multiplicar 
        
        tablaDeMultiplicar obj = new tablaDeMultiplicar();
        obj.multiplicar();
    }
    
}
