/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

/**
 *
 * @author ggarciamartinez
 */
public class Boletin9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos=0;
        int neg=0;
        int zero=0;
        int[] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 0;
        numeros[2] = -1;
        numeros[3] = 0;
        numeros[4] = 1;
        numeros[5] = -1;
        numeros[6] = 1;
        numeros[7] = -1;
        numeros[8] = -1;
        numeros[9] = 0;
           for (Integer numero: numeros) {

                if(numero>0){
                    pos++;
                }else if(numero<0){
                    neg++;
                }else{
                    zero++;
                }              }
             System.out.println(pos);
             System.out.println(neg);
             System.out.println(zero);
        }
    }
    
