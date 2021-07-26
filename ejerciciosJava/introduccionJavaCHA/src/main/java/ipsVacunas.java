
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Henao
 */
public class ipsVacunas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables 
        Scanner teclado = new Scanner(System.in);
        byte edad;
        byte ciclo;
        byte de18a25=0;
        byte de26a40=0;
        byte de41a50=0;
        byte de5160=0;
        byte de60plus=0;
        System.out.println("Este programa ayudara en la clasificacion de edades de los pacientes que"
                + " tomaran la vacuna contra el covid-19,\n por favor "
                + "digite la cantidad de usuarios a vacunar");
        ciclo= teclado.nextByte();
        for (byte i=0; i<ciclo;i++){
            System.out.println("**********************************************************");
            System.out.println("en que rango de edad se clasifica el paciente \n1. de 18 a 25 \n2. de 26 a 40"
                    + "\n3. de 40 a 50 \n4. de 51 a 60 \n5. mayor de 60 ");
            edad=teclado.nextByte();
            switch(edad){
                case 1:
                    de18a25++;
                    System.out.println("Actualizando...");
                    break;
                case 2:
                    de26a40++;
                    System.out.println("Actualizando...");
                    break;
                case 3:
                    de41a50++;
                    System.out.println("Actualizando...");
                    break;
                case 4:
                    de5160++;
                    System.out.println("Actualizando...");
                    break;
                case 5:
                    de60plus++;
                    System.out.println("Actualizando...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        System.out.println("estos fueron los resultados de las clasificaciones de edades\n1. de 18 a 25 años "+ de18a25);
        System.out.println("2. de 26 a 40 años "+ de26a40 + "\n3. de 41 a 50 años "+ de41a50 + " \n4. de 51 a 60 años "+ de5160);
        System.out.println("6. mayores de 61 años " + de60plus);
        System.out.println("Gracias por usar este software de prueba ");
    }
    
}
