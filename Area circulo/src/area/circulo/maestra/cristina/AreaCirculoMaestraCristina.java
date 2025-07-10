/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.circulo.maestra.cristina;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class AreaCirculoMaestraCristina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float r,π,Ar,Pe,U;
          
           Scanner fr = new Scanner(System.in);
           
            System.out.print("Digte el radio");
        r=fr.nextFloat();
        π = (float) 3.1416;
        U= r*r;
        
         Ar= U*π ;

         System.out.println("El area del circulo es" + Ar);
    }
    
}
