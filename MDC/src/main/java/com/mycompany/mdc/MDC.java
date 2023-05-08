/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mdc;

import java.util.Scanner;

/*
Elabore um algoritmo que obtenha o máximo divisor comum (MDC) entre dois números
fornecidos.
*/
public class MDC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = teclado.nextInt();
        int resto;
        
        while(n2!=0){
        resto = n1 % n2;
        n1 = n2;
        n2 = resto;
        }
        System.out.println(" ");
        System.out.println("MDC:"+n1);
    }
}
