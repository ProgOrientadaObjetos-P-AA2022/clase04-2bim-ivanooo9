/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
   
 protected String nombrePropietario;
 protected String placa;
 protected double valoraCancelar;
 
 public void establecerNombre(String nombre){
     nombrePropietario = nombre;
     
 }
    
 public void establecerPlaca(String plac){
     placa = plac;
     
 }   
     
 public abstract  void calcularValoraCancelar();
 
 public String obtenerNombrePropietario(){
     return  nombrePropietario;
 }
 
 public String obtenerPlaca(){
     return placa;
 }
 
 public double obtenervalorCancelar(){
     return valoraCancelar;
     
 }
 
 public String toString() {
String cadena = String.format("Nombre del propietario: %s\n"
+ "Placa del auto: %s\n",
nombrePropietario, placa);
return cadena;
}
 
}
    

/