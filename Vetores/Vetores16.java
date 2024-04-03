// Em uma pesquisa de opinião, é necessário registrar as respostas dos entrevistados. Crie um programa que leia 5 respostas (números inteiros) de entrevistados e, em seguida, imprima essas respostas na ordem inversa em que foram registradas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar as respostas
        int[] respostas = new int[5];

        // Solicitar ao usuário que insira as respostas dos entrevistados
        System.out.println("Digite as respostas dos entrevistados:");
        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas[i] = scanner.nextInt();
        }

        // Imprimir as respostas na ordem inversa
        System.out.println("Respostas dos entrevistados na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println("Resposta " + (i + 1) + ": " + respostas[i]);
        }
        scanner.close();
    }
}