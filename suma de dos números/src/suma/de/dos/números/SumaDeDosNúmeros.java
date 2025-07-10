/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.dos.números;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class SumaDeDosNúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num1, num2, num3 = 0, num4 = 0, num5 = 0, num6 = 0,num7 = 0, num8 = 0, num9 = 0, num10 = 0, suma1, suma2, suma3, suma4, suma5, suma6, suma7,suma8, suma9, suma10;
       
       Scanner fr= new Scanner(System.in);
      
       System.out.print("Hecho por Ramos Barrios Yael Eli");
       
       
       
       System.out.print("digite el primer número");
               num1= fr.nextDouble();
               
         System.out.print("digite el segundo número");
               num2= fr.nextDouble();      
        
               if(num1>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num1<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
               
              if(num2>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num2<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
               
            if(num3<=0){ if(num3<0)
                JOptionPane.showMessageDialog(null,"número es negativo");
            }
               
               else
            {
                JOptionPane.showMessageDialog(null,"número es positivo");}
            
            if(num4>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num4<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num5>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num5<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num6>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num6<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num7>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num7<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num8>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num8<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num9>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num9<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
            if(num10>0){
                   JOptionPane.showMessageDialog(null,"número es positivo");}
               
               else
               { if(num10<0)
                   JOptionPane.showMessageDialog(null,"número es negativo");
               }
               suma1= num1+num2;
               
    System.out.println("El resultado es"+suma1);           
    }
    
    
}
