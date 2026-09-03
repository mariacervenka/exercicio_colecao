package Exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorLetras {
    static void main() {

        Scanner entrada = new Scanner(System.in);

        Map<Character, Integer> contador = new HashMap<>();

        String frase;
        char letra;


        System.out.println("Frase: ");
        frase = entrada.nextLine(); //nextLine eh pra frase, so o next ele so pega a 1 palavra

        for (int i = 0; i < frase.length(); i++) {

            letra = frase.charAt(i);


            if (Character.isLetter(letra)){


            }
        }


    }

}
