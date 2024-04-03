// Em um sistema de classificação de produtos, é necessário ordenar os produtos por preço. Escreva um programa que leia os preços de 10 produtos e, em seguida, ordene esses preços em ordem crescente e imprima o vetor ordenado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar os preços dos produtos
        double[] precos = new double[10];

        // Solicitar ao usuário que insira os preços dos produtos
        System.out.println("Digite os preços dos 10 produtos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Ordenar os preços em ordem crescente usando Bubble Sort
        bubbleSort(precos);

        // Imprimir o vetor ordenado
        System.out.println("Preços dos produtos em ordem crescente:");
        for (double preco : precos) {
            System.out.println(preco);
        }

        // Fechar o Scanner
        scanner.close();
    }

    // Método para ordenar um array em ordem crescente usando Bubble Sort
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Trocar os elementos
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}