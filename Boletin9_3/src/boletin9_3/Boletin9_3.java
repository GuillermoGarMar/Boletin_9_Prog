/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b=0;
        float h=0;
        do{
            b= Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la base= "));
            h= Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor de la altura= "));
        }while(b>0&&h>0);
        System.out.println(b*h);
    }
    
}
