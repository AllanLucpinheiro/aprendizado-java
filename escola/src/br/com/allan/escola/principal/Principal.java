package br.com.allan.escola.principal;

import br.com.allan.escola.modelos.Aluno;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Aluno alunos[] = new Aluno[10];
        int serie, opcao = 0, idade, cont = 0;

        String ensino = "", nome, genero, op;

        String menu = """
                1-Cadastra aluno
                2-Lista aluno
                3-Sair
                """;
        System.out.println("*****************************");
        System.out.println("CADASTRO E LISTAGEM DE ALUNOS DE UMA ESCOLA");
        System.out.println("*****************************");

        while (opcao != 3) {
            System.out.println("\n" + menu);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao) {
                case 1:
                    for (int i = cont; i <= cont; i++) {
                        System.out.println("Digite o nome:");
                        nome = leitura.nextLine();
                        System.out.println("Digite idade:");
                        idade = leitura.nextInt();
                        leitura.nextLine();
                        System.out.println("Digite o genero:");
                        genero = leitura.nextLine();
                        System.out.println("Digite a serie:");
                        serie = leitura.nextInt();
                        leitura.nextLine();
                        System.out.println("Ensino fundamental ou medio?");
                        ensino = leitura.nextLine();

                        alunos[i] = new Aluno(nome, idade, genero, serie, ensino);
                        alunos[i].gerarMatricula();


                    }
                    cont += 1;
                    break;
                case 2:
                    for (int i = 0; i < cont; i++) {

                        alunos[i].mostra();

                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

            }
        }


    }


}
