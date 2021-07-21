
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
public class numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa para clasificar si un numero es par o impar positivo o negativo
        // declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        
        System.out.println("Ingrese un numero para clasificarlo ");
        numero = entrada.nextInt();
        if (numero==0){
            System.out.println("el numero " + numero + " es neutro");
        }else if(numero %2==0){
            if (numero>0){
                System.out.println("el numero " + numero + " es positivo y par");
            }
            else{
                System.out.println("el numero " + numero + " es par pero negativo");
            }
        }
        else{
            if(numero>0){
                System.out.println("el numero " + numero + " es impar pero positivo" );
            }
            else{
                System.out.println("el numero " + numero + " es impar y negativo");
            }
        }
    }
    
}
