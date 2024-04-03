// Crie um programa que irá gerar um vetor A com 15 números inteiros e depois crie um vetor B que será a cópia do vetor A de forma reversa

public class Main {
 public static void main(String[] args) {
        // Criar um vetor A com 15 números inteiros
        int[] vetorA = new int[15];

        // Preencher o vetor A com números inteiros
        preencherVetor(vetorA);

        // Exibir o vetor A
        System.out.print("Vetor A: ");
        exibirVetor(vetorA);

        // Criar um vetor B que será a cópia reversa do vetor A
        int[] vetorB = copiarReverso(vetorA);

        // Exibir o vetor B
        System.out.print("\nVetor B: ");
        exibirVetor(vetorB);
    }

    // Função para preencher um vetor com números inteiros
    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1; 
        }
    }

    // Função para copiar um vetor de forma reversa
    public static int[] copiarReverso(int[] vetor) {
        int[] vetorReverso = new int[vetor.length];
        for (int i = 0, j = vetor.length - 1; i < vetor.length; i++, j--) {
            vetorReverso[j] = vetor[i];
        }
        return vetorReverso;
    }

    // Função para exibir um vetor
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}