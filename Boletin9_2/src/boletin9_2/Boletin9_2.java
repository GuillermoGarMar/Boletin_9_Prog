/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        int suma=0;
        double producto=1;
        for (int i=0;i<=90;i++){
            suma = n+suma;
            producto = n*producto;
            n++;
        }
        System.out.println(suma);
        System.out.println(producto);
    }
    
}
