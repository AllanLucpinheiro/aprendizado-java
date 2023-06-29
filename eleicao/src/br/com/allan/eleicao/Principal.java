package br.com.allan.eleicao;

import br.com.allan.eleicao.modelos.Pessoa;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Allan Silva",25,"Masculino");
        p1.votar();
        Pessoa p2 = new Pessoa("Clara Barros",17,"Feminino");
        p2.votar();
        Pessoa p3 = new Pessoa("Allan Jr",8,"Masculino");
        p3.votar();
        Pessoa p4 = new Pessoa("Carlos almeida",71,"Masculino");
        p4.votar();

        ArrayList<Pessoa> listadePessoas = new ArrayList<>();
        listadePessoas.add(p1);
        listadePessoas.add(p2);
        listadePessoas.add(p3);
        listadePessoas.add(p4);
        System.out.println(listadePessoas);

    }
}
