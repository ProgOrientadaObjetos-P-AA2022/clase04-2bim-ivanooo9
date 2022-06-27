/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

public class Ejecutor {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int opc;
String nom;
String plac;
String cont = "S";
ArrayList<Automovil> automoviles = new ArrayList<>();
    do{
    System.out.println("Tipos de Automovil a Ingresar");
    System.out.println("Automovil Gasolina [1]");
    System.out.println("Automovil Diesel [2]");
    opc = sc.nextInt();
    sc.nextLine();

    if(opc == 1 || opc == 2){
    System.out.println("Ingrese el nombre del propietario: ");
    nom = sc.nextLine();
    System.out.println("Ingrese la placa del automovil: ");
    plac = sc.nextLine();

    switch(opc){
    case 1:
        AutomovilGasolina autoG = new AutomovilGasolina();
        System.out.println("Ingresar el numero de galones maximo"
                + "del tanque");
        double numG = sc.nextDouble();
        System.out.println("Ingresa el costo de cada Galón: ");
        double costoG = sc.nextDouble();
        
        autoG.establecerNombre(nom);
        autoG.establecerPlaca(plac);
        autoG.establecerCostoGalon(costoG); 

        automoviles.add(autoG);
        break;
    
   case 2:
        AutomovilDiesel autoD = new AutomovilDiesel();

        System.out.println("Ingrese el numero de litros maximo "
        + "del tanque: ");
        double numLt = sc.nextDouble();
        System.out.println("Ingrese el costo de cada litro: ");
        double costoLt = sc.nextDouble();
        System.out.println("Ingrese el descuento por litro: ");
        double desc = sc.nextDouble();

        autoD.establecerNombre(nom);
        autoD.establecerPlaca(plac);
        autoD.establecerNumeroDiesel(numLt);
        autoD.establecerCostoGalon(costoLt);
        autoD.establecerdescuentoGalon(desc);

        automoviles.add(autoD);
        break;
}

    }else{
    System.out.println("Error! opcion no valida");
    }

    System.out.println("Desea ingresar más autos. Digite la letra"
    + " S para continuar o digite la letra N para salir");
    sc.nextLine();
    cont = sc.nextLine();

    }while(cont.equals("S"));

    for (int i = 0; i < automoviles.size(); i++) {
        // 1.
        automoviles.get(i).calcularValoraCancelar();

        System.out.printf("Datos del Automovil\n\n"
        + "%s\n",
        automoviles.get(i));

    }
  }
}
