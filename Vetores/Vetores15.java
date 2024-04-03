// Um sistema de gerenciamento de projetos precisa gerar estimativas de prazos com base em sequências de tarefas. Faça um programa que solicite ao usuário inserir um número inteiro positivo N e, em seguida, gere e imprima os N primeiros termos da sequência de Fibonacci, que representa os prazos estimados.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar ao usuário o número de termos da sequência de Fibonacci
            System.out.print("Digite o número de termos da sequência de Fibonacci: ");
            int numeroTermos = scanner.nextInt();

            // Verificar se o número de termos é válido
            if (numeroTermos <= 0) {
                System.out.println("Por favor, digite um número inteiro positivo.");
                return;
            }

            // Imprimir os N primeiros termos da sequência de Fibonacci
            System.out.println("Os " + numeroTermos + " primeiros termos da sequência de Fibonacci:");
            for (int i = 0; i < numeroTermos; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println(); // Nova linha

        } catch (Exception e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }

    // Método para calcular o termo da sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}