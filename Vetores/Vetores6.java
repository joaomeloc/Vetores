// Escreva um programa em java que preencha um vetor com 30 números inteiros aleatórios entre 1 e 100. Peça ao usuário para digitar um valor, verifique se este valor existe no vetor e remova ele do vetor.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar um vetor com 30 elementos
        int[] vetor = new int[30];

        // Preencher o vetor com números inteiros aleatórios entre 1 e 100
        preencherVetorAleatorio(vetor);

        // Exibir o vetor
        System.out.print("Vetor original: ");
        exibirVetor(vetor);

        // Pedir ao usuário para digitar um valor
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um valor para remover do vetor: ");
        int valor = scanner.nextInt();

        // Verificar se o valor existe no vetor e removê-lo
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                vetor = removerElemento(vetor, i);
                encontrado = true;
                break;
            }
        }

        // Exibir o resultado
        if (encontrado) {
            System.out.print("Vetor após a remoção: ");
            exibirVetor(vetor);
        } else {
            System.out.println("O valor não foi encontrado no vetor.");
        }
    }

    // Função para preencher o vetor com números inteiros aleatórios entre 1 e 100
    public static void preencherVetorAleatorio(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1; // Números aleatórios entre 1 e 100
        }
    }

    // Função para remover um elemento do vetor
    public static int[] removerElemento(int[] vetor, int indice) {
        int[] novoVetor = new int[vetor.length - 1];
        for (int i = 0, j = 0; i < vetor.length; i++) {
            if (i != indice) {
                novoVetor[j++] = vetor[i];
            }
        }
        return novoVetor;
    }

    // Função para exibir o vetor
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}