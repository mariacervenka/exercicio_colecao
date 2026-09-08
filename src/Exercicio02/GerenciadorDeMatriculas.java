package Exercicio02;

import java.util.*;

public class GerenciadorDeMatriculas {

    static void main() {

        //disciplina de estrutura de dados
        Set<Aluno> estrutura = new HashSet<>();//set evita repeticao

        estrutura.add(new Aluno("Ray", 20));
        estrutura.add(new Aluno("Gee", 30));
        estrutura.add(new Aluno("Frank", 40));


        //disciplina de banco de dados
        Set<Aluno> banco = new HashSet<>();

        estrutura.add(new Aluno("Mikey", 50));
        estrutura.add(new Aluno("Pete", 60));
        estrutura.add(new Aluno("Gee", 30));


        //uniao das turmas
        System.out.println("Alunos matriculados em Banco De Dados ou Estrutura de Dados");

        //vocepode passar um hash como parametro em outro hash, que cria uma copia
        //mas o original continua igual
        Set<Aluno> uniao = new HashSet<>(estrutura);

        uniao.addAll(banco);

        uniao.forEach(aluno ->{

            System.out.println(aluno);
        });


        //alunos que estao matriculados nas duas disciplinas - interseccao
        System.out.println("alunos matriculados em Banco de dados e Estrutura de Dados");


        Set<Aluno> inter = new HashSet<>(estrutura);

        //vai reter tdos que estao dentro dessa estrutura (banco)
        inter.retainAll(banco);

        inter.forEach(aluno -> {

            System.out.println(aluno);
        });


        //alunos que estao matriculados apenas em estruturas de dados
        System.out.println();
        System.out.println("alunos matriculados apenas em EStrutura de Dados");

        Set<Aluno> soEstrutura = new HashSet<>(estrutura);

        soEstrutura.removeAll(banco);

        List<Aluno> lista = new ArrayList<>(soEstrutura);

        lista.sort(Comparator.comparing(Aluno::getNome));

        lista.forEach(aluno ->{

            System.out.println(aluno);
        });


    }//main
}//class
