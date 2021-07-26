/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Christian Henao Aguirre
 * ejercicio que clasifica edad de una persona si digitan numeros negativos da error
 */
public class clsEdad {
    //declaracion de atributos
    Scanner teclado= new Scanner(System.in);
    private byte edad;
    private String nombre;
    //encapsulamiento
    public byte getEdad(){
    return edad;}
    public void setEdad(byte edad){
    this.edad=edad;
    }
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    //construtor
    public clsEdad(){
    };
    
    public clsEdad(String nombre,byte edad){
    this.nombre=nombre;
    this.edad=edad;
    };
    //metodos 
//    public void capturaDatos(){
//        System.out.println("Digite el nombre del tripulante : ");
//        setNombre(teclado.next());
//        System.out.println("Digite la edad ");
//        setEdad(teclado.nextByte());
//    };
    public void proceso(){
    if (getEdad()>=18){
        System.out.println("El tripulante "+getNombre()+" es mayor de edad " + getEdad());
    }
    else if(getEdad()<0){
        System.out.println("Edad erronea");
    }
    else{
        System.out.println("el tripulante " +getNombre()+ " es menor de edad ");
    }
    };
}
