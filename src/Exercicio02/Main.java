package Exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {

        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno("Maria", 23));
        lista.add(new Aluno("Maria", 23));
        lista.add(new Aluno("Carlinhos", 22));
        lista.add(new Aluno("Moomin", 11));


        lista.forEach(aluno -> {

            System.out.println(aluno);
        });




    }

}
