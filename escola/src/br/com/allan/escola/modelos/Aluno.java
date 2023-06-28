package br.com.allan.escola.modelos;

public class Aluno extends Pessoa {

    private int matricula;
    private int serie;
    private String ensino;


    public Aluno(String nome,int idade,String genero,int serie,String ensino) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setGenero(genero);
        this.serie = serie;
        this.ensino = ensino;
    }

    public String getEnsino() {
        return ensino;
    }

    public void setEnsino(String ensino) {
        this.ensino = ensino;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getMatricula() {
        return matricula;
    }

    public void gerarMatricula(){
        int min = 9999;
        int max = 99999;
        int range = max - min +1;
       this.matricula = (int)(Math.random()*range)+min;
    }

    public void mostra(){
        System.out.println("Nome: "+getNome() + " | Idade:" + getIdade()+" anos" + "| Gênero:"+getGenero() + " | Série:"+getSerie()+ "º"+" | Ensino:"+getEnsino() + " | Matricula:"+getMatricula());
    }
}
