public class Produto implements Comparable<Produto> {

    private String nome;
    private double quantidade;


    public Produto(String nome, double quantidade){
        this.nome = nome;
        this.quantidade = quantidade;


    }



    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }



    @Override
    public String toString() {
        return "Nome do produto:" + nome  + ", Quantidade=" + quantidade + "\n";
    }

    @Override
    public int compareTo(Produto o) {
        return Double.valueOf(this.quantidade).compareTo(Double.valueOf(o.quantidade));
    }

}
