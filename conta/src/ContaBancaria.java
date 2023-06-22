import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Allan Lucas Pinheiro Silva";
        String tipoConta = "Conta-Corrente";
        double saldo = 1800.56,novoValor,transferirValor;
        int opc=0;

        System.out.println("**********************************************");
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Tipo de conta: "+tipoConta);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("**********************************************");


        while (opc!=4) {
            System.out.println("\nOperações:");
            System.out.println("1-Consultar saldo");
            System.out.println("2-Receber valor");
            System.out.println("3-Transferir valor");
            System.out.println("4-Sair");

            System.out.println("Digite a opção desejada");
            opc = leitura.nextInt();

            switch (opc){
                case 1:
                    System.out.printf("O saldo atual é R$ %.2f",saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    novoValor = leitura.nextDouble();
                    if(novoValor > 0 ){
                        saldo += novoValor;
                        System.out.println("Saldo de R$"+ novoValor + " adicionado com Sucesso!");
                        System.out.printf("Saldo atualizado R$ %.2f",saldo);

                    }else {
                        System.out.println("Não e possivel receber o valor digitado!");
                        System.out.printf("Saldo atualizado R$ %.2f",saldo);

                    }
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    transferirValor = leitura.nextDouble();
                    if(saldo >= transferirValor && transferirValor > 0){
                        saldo -= transferirValor;
                        System.out.println("Transferencia de R$" + transferirValor + " realizado com sucesso!");
                        System.out.printf("Saldo atualizado R$ %.2f",saldo);

                    }else if(saldo < transferirValor) {
                        System.out.println("Saldo R$"+ saldo + " menor que o valor da transferencia!");
                    }else {
                        System.out.println("Não e possivel transferir o valor digitado");
                        System.out.printf("Saldo atualizado R$ %.2f",saldo);
                    }

                    break;
                case 4:
                    System.out.println("Saindo da conta...");
                    break;
                default:
                    System.out.println("Opção Invalida");


            }


        }

    }
}
