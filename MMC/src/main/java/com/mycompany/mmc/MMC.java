/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mmc;

import java.util.Scanner;


    /*Elabore um algoritmo que obtenha o mínimo múltiplo comum (MMC) entre dois números fornecidos.
    */
public class MMC {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int result,resto,a,b,n1,n2;
       System.out.println("Digite o primeiro numero:");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = teclado.nextInt();
        a=n1;
        b=n2;
        do{
            resto = a%b;
            a=b;
            b=resto;
        }while(resto!=0);
        
        result = (n1*n2)/a;
        System.out.println("O MMC de "+n1+" e "+n2+":"+result); 
    }
}
