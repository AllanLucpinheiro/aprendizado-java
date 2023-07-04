import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int opc = 1,qtd;
        String nome;
        String menu = """
                1-Cadastro
                2-Lista
                3-Sair
                """;

        ArrayList<Produto> lista = new ArrayList<>();
        while (opc!=3) {
            System.out.println(menu);
            opc = leitura.nextInt();
            leitura.nextLine();
            switch (opc) {
                case 1:
                    while (opc!=0) {
                        System.out.println("Nome do produto:");
                        nome = leitura.nextLine();
                        System.out.println("Quantidade do produto:");
                        qtd = leitura.nextInt();
                        Produto produto = new Produto(nome, qtd);
                        lista.add(produto);
                        System.out.println("Deseja cadastrar mais produtos 0-NÃO / 1-SIM");
                        opc = leitura.nextInt();
                        leitura.nextLine();
                    }
                    break;
                case 2:
                    lista.sort(Comparator.comparing(Produto::getNome));
                    for (Produto p:lista) {
                        System.out.println("Nome do produto: "+ p.getNome()+ " | Quantidade: " + (int)p.getQuantidade());
                    }
                    break;
            }

        }







    }
    }