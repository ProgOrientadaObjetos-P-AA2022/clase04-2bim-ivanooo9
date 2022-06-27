/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    
    double numeroGalones;
    double costodecadagalon;
    double iva;
    
    public void establecerNumeroGalones(double numG){
        numeroGalones = numG;
    }
    
    public void establecerCostoGalon(double costG){
        costodecadagalon = costG;
    }
    
    public void establecerIvaGalon(double ivaG){
         iva = (numeroGalones * costodecadagalon) * 0.10;
    }
    
    public void calcularValoraCancelar(){
        valoraCancelar = (numeroGalones * costodecadagalon) + iva;
    }
    
    public double obtenerNumeroGalones(){
       return numeroGalones;
    }
  
    public double obtenerCostoGalon(){
       return costodecadagalon;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public String toString() {
    String cadena = String.format(super.toString());
    cadena = String.format("Automovil a Gasolina\n"
    + "%s\n"
    + "Numero de Galones:%.2f\n"
    + "Costo por Galon:%.2f\n"
    + "IVA: %.2f\n"
    + "Valor a Cancelar: %.2f\n", cadena,
    numeroGalones, costodecadagalon, iva, valoraCancelar);
    return cadena;
    }
    
}
