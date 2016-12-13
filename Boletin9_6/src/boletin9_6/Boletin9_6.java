/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        int saldo;
        String siOno;
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        boolean tf=true;
        do{
            nom= JOptionPane.showInputDialog("Nombre del trabajador");
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Saldo del trabajadores; "));
            Traballadores t = new Traballadores(nom,saldo);
            if (saldo<=1750 && saldo>=1000){
                c3++;
            }else if(saldo<1000){
                c4++;
            }
            siOno= JOptionPane.showInputDialog("Insertar mas trabajadores? Si/No");
            if(siOno.equals("Si")||siOno.equals("SI")||siOno.equals("si")){
                tf=true;
            }else if(siOno.equals("No")||siOno.equals("NO")||siOno.equals("no")){
                tf=false;
                break;
            }else{JOptionPane.showMessageDialog(null,"ERROR");
            }
            
        }while(tf==true);
        
        System.out.println("El nº de traballadores con un soldo entre 1750 e 1000 é: "+ c3 +" e os traballadores con un solod menor a 1000: "+ c4);
    }
    
}
