//Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50. Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar um vetor com 15 elementos
        int[] vetor = new int[15];

        // Preencher o vetor com números inteiros aleatórios entre 1 e 50
        preencherVetorAleatorio(vetor);

        // Exibir o vetor
        System.out.print("Vetor: ");
        exibirVetor(vetor);

        // Verificar se o número 20 existe no vetor
        boolean encontrado = verificarNumero(vetor, 20);

        // Exibir o resultado
        if (encontrado) {
            System.out.println("\nO número 20 existe no vetor.");
        } else {
            System.out.println("\nO número 20 não existe no vetor.");
        }
    }

    // Função para preencher o vetor com números inteiros aleatórios entre 1 e 50
    public static void preencherVetorAleatorio(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(50) + 1; 
        }
    }

    // Função para verificar se um número existe no vetor
    public static boolean verificarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Função para exibir o vetor
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}