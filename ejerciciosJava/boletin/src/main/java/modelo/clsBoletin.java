/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Christian Henao Aguirre
 * programa que calcula la nota definitivaq de un tripulante que puede tener dos o tres
 * calificaciones
 */
public class clsBoletin {
    //definicion de atributos
    private String identificacion=null;
    private double nota1=0d;
    private double nota2=0d;
    private double nota3=0d;
    private double def=0d;
    //constructor
    public clsBoletin(){
    
    };
//    public clsBoletin(String identificacion,double nota1,double nota2,double nota3){
//    this.identificacion=identificacion;
//    this.nota1=nota1;
//    this.nota2=nota2;
//    this.nota3=nota3;
//    }
    public String getIdentificacion(){
    return identificacion;
    }
    public void setIdentificacion(String identificacion){
    this.identificacion=identificacion;
    }
    public double getNota1(){
    return nota1;
    }
    public void setNota1(double nota1){
    this.nota1=nota1;    
    }
    public double getNota2(){
    return nota2;
    }
    public void setNota2(double nota2){
    this.nota2=nota2;
    }
    public double getNota3(){
    return nota3;
    }
    public void setNota3(double nota3){
    this.nota3=nota3;
    }
    public double getDef(){
    return def;
    }
    public void setDef(double def){
    this.def=def;
    }
    //sobrecarga de metodos
    public double calcularDef(double nota1,double nota2){
    this.nota1=nota1;
    this.nota2=nota2;
    setDef((getNota1()+getNota2())/2);
    return def;
    }
     public double calcularDef(byte nota1,byte nota2){
    this.nota1=nota1;
    this.nota2=nota2;
    setDef((getNota1()+getNota2())/2);
    return def;
    }
    public double calcularDef(double nota1,double nota2,double nota3){
    setDef((getNota1()+getNota2()+getNota3())/3);
    this.nota1=nota1;
    this.nota2=nota2;
    this.nota3=nota3;
    return def;
    } 
    public double calcularDef(byte nota1,byte nota2,byte nota3){
    this.nota1=nota1;
    this.nota2=nota2;
    this.nota3=nota3;
    setDef((getNota1()+getNota2()+getNota3())/3);
    return def;
    } 
     //metodo toString
     public String toString(){
     String mensaje="Tripulante "+getIdentificacion()+" obtuvo la siguiente nota definitava "+getDef();
     return mensaje;
     }
}
