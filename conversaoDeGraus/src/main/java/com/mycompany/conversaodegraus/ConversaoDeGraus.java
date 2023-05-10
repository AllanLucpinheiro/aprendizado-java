/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaodegraus;

/**
 *
 * @author Allan
 */
public class ConversaoDeGraus {

    public static void main(String[] args) {
         double formula ;
        for(double i=50;i<=150;i++){
        formula = (i-32)*5/9;
            System.out.printf("%.0fºF ----- %.2fºC%n",i,formula);
        }
        
    }
}
