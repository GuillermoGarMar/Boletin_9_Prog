/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int e = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        if(e==0){
            System.exit(e);
        }else{
        for(int i=0;i<=10;i++){
            System.out.println(e*i);
        }
    }
    
}
    } 

