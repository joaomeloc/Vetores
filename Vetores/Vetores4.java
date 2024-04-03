// Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.
import java.util.Random;
public class Main {
 import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar um vetor com 20 elementos
        int[] vetor = new int[20];

        // Preencher o vetor com números inteiros aleatórios entre 1 e 30
        preencherVetorAleatorio(vetor);

        // Exibir o vetor
        System.out.print("Vetor: ");
        exibirVetor(vetor);

        // Verificar se o número 25 existe no vetor
        boolean encontrado = verificarNumero(vetor, 25);

        // Exibir o resultado
        if (encontrado) {
            System.out.println("\nO número 25 existe no vetor.");
        } else {
            System.out.println("\nO número 25 não existe no vetor.");
        }
    }

    // Função para preencher o vetor com números inteiros aleatórios entre 1 e 30
    public static void preencherVetorAleatorio(int[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(30) + 1; // Números aleatórios entre 1 e 30
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