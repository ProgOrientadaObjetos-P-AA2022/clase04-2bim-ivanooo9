/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel  extends Automovil{
   double numerolit;
    double costodecadalit;
    double descuento;
    
    public void establecerNumeroDiesel(double numL){
        numerolit = numL;
    }
    
    public void establecerCostoGalon(double costl){
        costodecadalit = costl;
    }
    
    public void establecerdescuentoGalon(double ivaL){
         descuento = ( numerolit * costodecadalit) * 0.10;
    }
    
    public void calcularValoraCancelar(){
        valoraCancelar = (numerolit * costodecadalit) + descuento;
    }
    
    public double obtenerNumeroDiesel(){
       return numerolit;
    }
  
    public double obtenerCostoDiesel(){
       return costodecadalit;
    }
    
    public double obtenerdescuento(){
        return descuento;
    }
    
    public void calcularValorCancelar() {

    descuento = descuento * numerolit;
    numerolit = numerolit - descuento;
     valoraCancelar = (costodecadalit * numerolit);
    }

 @Override
    public String toString() {
    String cadena = String.format(super.toString());
    cadena = String.format("Automovil a Diesel\n"
    + "%s\n"
    + "Numero de Litros:%.2f\n"
    + "Costo por Litro:%.2f\n"
    + "Descuento: %.2f %\n"
    + "Valor a Cancelar: %.2f\n", cadena,
    numerolit, costodecadalit, descuento, valoraCancelar);
    return cadena;
    }


}
