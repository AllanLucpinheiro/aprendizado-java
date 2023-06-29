package br.com.allan.eleicao.modelos;

public class Pessoa {
    private String nome;
    private int idade ;
    private String sexo;
    private String Vota;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.Vota = getVota();
    }

    public void votar(){
        if(this.idade >= 16 && this.idade < 18 || this.idade>70){
            this.Vota = "Cidadão não é obrigado a votar!";
        } else if (this.idade>=18 && this.idade <=70 ) {
            this.Vota="Cidadão,você é obrigado a votar!";
        }else {
            this.Vota = "Idade invalida!";
        }
    }

    public String getVota() {
        return Vota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "\n"+"Nome= " + nome +
                ", Idade= " + idade +
                ", Sexo= " + sexo +
                ", Situação= " + Vota;
    }
}
