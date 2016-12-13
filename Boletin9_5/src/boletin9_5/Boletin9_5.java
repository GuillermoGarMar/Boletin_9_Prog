/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;
import javax.swing.JOptionPane;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nt = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        int conta=0;
        for(int i=0;i < nt;i++){
            conta+=2;
            System.out.print("+"+conta);
            
        }
        System.out.println("");
        int contb=0;
        String cadenab="";
        for(int i=0;i < nt;i++){
            contb++;
            if(contb%2==0){
                cadenab+=("+"+contb);
            }else{
                cadenab+=("-"+contb);
            }
        }
        System.out.print(cadenab);
        System.out.println("");
        
        int contc1=0;
        int nAnt=0;
        int suma=0;
        for(int i=0;i < nt;i++){
            if(i==0){nAnt=0;}
            if(i==1){contc1=1;}
            if(i==2){System.out.print("1, ");}
            suma= contc1+nAnt;
            System.out.print(suma+", ");
            if(i%2!=0){
                nAnt=suma;
            
            }else{contc1=suma;}
        }
    }
    
}
