// Em um sistema de controle acadêmico, é preciso calcular a média das notas dos alunos. Escreva um programa que leia as notas de 10 alunos e, em seguida, calcule e imprima a média dessas notas.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vetor para armazenar as notas dos alunos
        double[] notas = new double[10];

        // Solicitar ao usuário que insira as notas dos alunos
        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular a média das notas
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;

        // Imprimir a média das notas
        System.out.println("A média das notas dos alunos é: " + media);
        scanner.close();
    }
}