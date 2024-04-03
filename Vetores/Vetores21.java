// Em um sistema de contabilidade, é necessário somar os valores de entrada e saída de recursos. Faça um programa que leia dois vetores com 5 elementos cada um (valores de entrada e saída) e, em seguida, calcule e imprima o saldo final.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar os valores de entrada
        double[] entrada = new double[5];

        // Vetor para armazenar os valores de saída
        double[] saida = new double[5];

        // Solicitar ao usuário que insira os valores de entrada
        System.out.println("Digite os valores de entrada:");
        for (int i = 0; i < entrada.length; i++) {
            System.out.print("Entrada " + (i + 1) + ": ");
            entrada[i] = scanner.nextDouble();
        }

        // Solicitar ao usuário que insira os valores de saída
        System.out.println("Digite os valores de saída:");
        for (int i = 0; i < saida.length; i++) {
            System.out.print("Saída " + (i + 1) + ": ");
            saida[i] = scanner.nextDouble();
        }

        // Calcular o saldo final
        double saldoFinal = 0;
        for (double valor : entrada) {
            saldoFinal += valor;
        }
        for (double valor : saida) {
            saldoFinal -= valor;
        }

        // Imprimir o saldo final
        System.out.println("O saldo final é: " + saldoFinal);

        // Fechar o Scanner
        scanner.close();
    }
}