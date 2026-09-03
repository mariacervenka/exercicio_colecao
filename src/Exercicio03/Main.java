package Exercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        //tem que especificar quem eh a chave e o valor
        //no caso o rm, valor q vai ser inserido
        Map<Integer, Aluno> lista = new HashMap<>();

        lista.put(23, new Aluno("Maria", 23));
        lista.put(23, new Aluno("Maria", 23));
        lista.put(22, new Aluno("Carlinhos", 22));
        lista.put(11, new Aluno("Moomin", 11));


        lista.forEach((rm, aluno) -> {

            System.out.println(aluno);
        });


        for (Map.Entry<Integer, Aluno> item : lista.entrySet()){

            System.out.println("Chave: " + item.getKey()+ " | " + "Valor: " + item.getValue());
        }

    }

}
