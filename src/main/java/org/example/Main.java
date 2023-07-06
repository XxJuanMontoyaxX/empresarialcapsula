package org.example;

import org.example.modelos.Herramienta;
import org.example.modelos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creando objetos

        Samurai samurai=new Samurai();
        Samurai samuraiDos=new Samurai();
        Herramienta herramienta=new Herramienta("escopeta",90.0);
        Herramienta herramientaDos=new Herramienta();
        Scanner entradaPorTeclado=new Scanner(System.in);

       //UTILIZAR-ACCEDER-VER-MODIFICAR-OPERAR-REVISAR-VALIDAR
       //LOS ATRIBUTOS Y METODOS DE UNA CLASE
    samurai.setNombres("Koshito micamoto");
        System.out.print("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());

        System.out.println("************RESULTADO************");
        System.out.println("El samurai: "+samurai.getNombres()+" Tiene: "+samurai.getEdad());
        //System.out.print("Digite el nombre del 2 samurai: ");
        //samuraiDos.nombres=entradaPorTeclado.nextLine();
    }
}