import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void sortear(){
        int megaSena[] = new int[6];
        double sorteado;
        for (int i = 0; i < megaSena.length; i++) {
            sorteado = 1+Math.random()*(60-1);
            megaSena[i] =(int)sorteado;
            for(int a = i-1;a>=0;a--){
                if(megaSena[i]==megaSena[a]) {
                    sorteado = 1 + Math.random() * (60 - megaSena[i]);
                    megaSena[i] = (int) sorteado;

                }

            }
        }
        Arrays.sort(megaSena);
        for(int j = 0;j < megaSena.length;j++){

            System.out.print(megaSena[j] + " ");

        }


    }
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        String os ;
        int opc = 0;
        String menu = """
                1-Sortear Numeros
                2-Sair
                """;
        System.out.println("************************");
        System.out.println("Sorteador da Mega-Sena");
        System.out.println("************************");



        while (opc!=2) {
            System.out.println("\n\n" + menu);
            System.out.print("Digite a opção desejada: ");
            opc = leitura.nextInt();

            switch (opc){
                case 1:
                    sortear();
                    break;
                case 2:
                    System.out.println("Saindo...");

                    break;
                default:
                    System.out.println("Opção invalida, digita as opções validas!");
                    break;

            }

        }


    }

}