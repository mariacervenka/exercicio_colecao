package eExercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {

        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Patricia", 9.9, 20));
        lista.add(new Candidato("Selmini", 7, 26));
        lista.add(new Candidato("Antonio", 9.9, 20));
        lista.add(new Candidato("Maria", 10, 10));
        lista.add(new Candidato("Beatriz", 8.0, 8));
        lista.add(new Candidato("Antonio", 7, 28));

        // ordenação
        // .reversed() -> decrescente , usar uma vez pq ele ta dando reversed 2x
        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica)
                .thenComparingInt(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome));

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });


    }

}
