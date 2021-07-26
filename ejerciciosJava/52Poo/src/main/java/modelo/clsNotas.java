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
 */
public class clsNotas {
    //definicion variables
    private String nombre;
    private String apellido;
    private byte nota1;
    private byte nota2;
    private Integer def;
    Scanner teclado =new Scanner(System.in);
    
    //encapsulacion get set
    public String getNombre(){
    return nombre;
    };
    public void setNombre(String nombre){
    this.nombre=nombre;
    };
    public String getApellido(){
    return apellido;
    };
    public void setApellido(String apellido){
    this.apellido=apellido;
    };
    public byte getNota1(){
    return nota1;
    };
    public void setNota1(byte nota1){
    this.nota1=nota1;
    };
    public byte getNota2(){
    return nota2;
    };
    public void setNota2(byte nota2){
    this.nota2=nota2;
    };
    public Integer getDef(){
    return def;
    };
    public void setDef(Integer def){
    this.def=def;
    };
    
    //definicion metodos
    public void solicitudDatos(){
        System.out.println("digite el nombre : ");
        //nombre= teclado.nextLine(); asi se proteje los datos 
        setNombre(teclado.next());
        System.out.println("digite el apellido : ");
        //apellido = teclado.next(); 
        setApellido(teclado.next());
        System.out.println("digite nota 1 : ");
        //nota1= teclado.nextByte();
        setNota1(teclado.nextByte());
        System.out.println("digite nota 2 : ");
        //nota2= teclado.nextByte();
        setNota2(teclado.nextByte());
        
        
    }
    public void calcularDefinitiva(){
    //def = ((nota1+nota2)/2);
    setDef(((getNota1()+getNota2())/2));
    if(getDef()>=30){
        System.out.println("el estudiante " +nombre+ " "+ apellido+" aprobo con "+ def );
        
    }
    else{
        System.out.println("el estdiante " + nombre+ " " + apellido + " reprobo con " + def);
    }
    }
}
