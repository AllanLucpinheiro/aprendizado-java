/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/*
Construa um algoritmo que gere os 20 primeiros termos de uma série tal qual a de
Fibonacci, mas que cujos 2 primeiros termos são fornecidos pelo usuário.
*/
public class Fibonacci {
    
      static void fibonacci (int n1,int n2){
        int aux;
        System.out.print(n1 +" "+ n2);
        for(int i=0;i<18;i++){
           aux = n1 + n2;
           n1 = n2;
           n2= aux;
            System.out.print(" "+ aux + " ");
        }
        
    }

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero da sequencia de fibonacci que você deseja:");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero da sequencia de fibonacci que você deseja:");
        int n2 = teclado.nextInt();
        fibonacci(n1,n2);
    }
}
