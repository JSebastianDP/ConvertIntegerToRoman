/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertintegertoroman;

/**
 *
 * @author Sebastian Diaz
 */
public class IntToRoman {
    
    public String ejercicio (int numero){
    
    String U[] = {"", "I", "II", "III","IV","V", "VI","VII", "VIII", "IX"};
    String D[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX","LXXX", "XC"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String M[] = {"", "M", "MM","MMM"};
    
    return  M[numero / 1000] + C[(numero % 1000) / 100] + D[(numero % 100) / 10 ] + U[numero % 10];
}
    
}
