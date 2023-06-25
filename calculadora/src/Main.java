import java.util.Scanner;

public class Main {
    public static double somar(double numeroUm,double numeroDois){
        double soma ;
        soma = numeroUm+numeroDois;
        return soma;
    }
    public static double diminuir(double numeroUm,double numeroDois){
        double substracao;
        substracao = numeroUm - numeroDois;
        return  substracao;
    }
    public static double multiplicacao(double numeroUm,double numeroDois){
        double multiplica;
        multiplica = numeroUm * numeroDois;

        return  multiplica;
    }
    public static double divisao(double numeroUm,double numeroDois){
        double div;
        div = numeroUm / numeroDois;
        return  div;
    }
    public static void main(String[] args) {
        Scanner pegaNumero = new Scanner(System.in);
        double numeroUm,numeroDois;
        char  opc;
        String menu = """
                +  -  *  / 
                """;
        System.out.print("Digite o primeiro numero:");
        numeroUm = pegaNumero.nextDouble();
        System.out.print(menu);
        pegaNumero.nextLine();
        opc = pegaNumero.next().charAt(0);
        if(opc == '+'){
            System.out.print("Digite o segundo numero:");
            numeroDois = pegaNumero.nextDouble();
            System.out.println("Resultado: "+somar(numeroUm,numeroDois));
        }else if (opc=='-'){
            System.out.println("Digite o segundo numero:");
            numeroDois = pegaNumero.nextDouble();
            System.out.println("Resultado: "+diminuir(numeroUm,numeroDois));
        }else if(opc=='*'){
            System.out.println("Digite o segundo numero:");
            numeroDois = pegaNumero.nextDouble();
            System.out.println("Resultado: "+multiplicacao(numeroUm,numeroDois));
        }else if(opc=='/'){
            System.out.println("Digite o numero:");
            numeroDois = pegaNumero.nextDouble();
            System.out.println("Resultado:"+divisao(numeroUm,numeroDois));

        }else {
            System.out.println("Opção invalida Tente novamente!");

        }





    }
}