/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertintegertoroman;

import java.util.Scanner;

/**
 *
 * @author Sebastian Diaz
 */
public class Parametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntToRoman romanos  = new IntToRoman();
        int numero;
        System.out.println("Bienvenido, digite el número que desea convertir a romano");
        Scanner leer = new Scanner(System.in);
        numero = leer.nextInt(); 
        System.out.println("El numero Seleccionado es " + numero + " y en romano sería " + romanos.ejercicio(numero));
        
        
        
    }
    
}
