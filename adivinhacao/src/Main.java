import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int adivinha,numeroUsuario,tentativa=5;
        adivinha = new Random().nextInt(100);
        System.out.println(adivinha);
        System.out.println("Advinhe um numero de 0 a 100:");
        numeroUsuario = leitura.nextInt();

        if(numeroUsuario == adivinha){
            System.out.println("Você acertou!");
        }else if(numeroUsuario < adivinha) {
            System.out.println("O numero digitado e menor que o numero sorteado");
            System.out.println("Você tem 5 tentativas... vamos la!");
            for (int i = 1; i <= tentativa ; i++) {
                System.out.println(i+"º tentativa:");
                numeroUsuario = leitura.nextInt();
                    if(numeroUsuario==adivinha){
                        System.out.println("Você acertou!");
                        break;
                    }else if(numeroUsuario > adivinha){
                        System.out.println("O numero digitado e maior que o numero sorteado!");
                    }else {

                        System.out.println("O numero digitado e menor que o numero sorteado!");
                    }

                if (i==tentativa){
                    System.out.println("5 tentativas feitas,tente novamente mais tarde!");
                    System.out.println("O numero sorteado foi "+ adivinha);

                }



            }


        }else {
            System.out.println("O numero digitado e maior que o numero sorteado");
            System.out.println("Você tem 5 tentativas... vamos la!");
            for (int i = 1; i <= tentativa ; i++) {
                System.out.println(i+"º tentativa:");
                numeroUsuario = leitura.nextInt();
                if(numeroUsuario==adivinha){
                    System.out.println("Você acertou!");
                    break;
                }else if(numeroUsuario > adivinha){
                    System.out.println("O numero digitado e maior que o numero sorteado!");
                }else {

                    System.out.println("O numero digitado e menor que o numero sorteado!");
                }
                if (i==tentativa){
                    System.out.println("5 tentativas feitas,tente novamente mais tarde!");
                    System.out.println("O numero sorteado foi "+ adivinha);

                }

        }


    }

    }
}