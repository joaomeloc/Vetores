// Escreva um programa em java que crie um vetor com 10 números inteiros aleatórios e depois calcule a média dos elementos deste vetor.
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    
  //Declarar variáveis
    int[] vetor = new int[10];
    
  //preencher o vetor com números aleatórios
   preencherVetorAleatorio(vetor);

  //Calcular a média dos elementos do vetor
   double media = calcularMedia(vetor);
         
  //Exibir o vetor
    System.out.println("Vetor: ");
    exibirVetor(vetor);

  //Exibir a média
    System.out.println("\nMédia dos elementos do vetor: " + media);  
  }
  //Função para preencher o vetor com números inteiros aleatórios
  public static void preencherVetorAleatorio(int[] vetor) {
    Random rand = new Random();
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = rand.nextInt(11);
    }
  }
 //Função para calcular a média dos elementos do vetor
  public static double calcularMedia(int[] vetor) {
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }
    return (double) soma / vetor.length;
  }
  //Função para exibir o vetor
  public static void exibirVetor(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i] + " ");
    }
  }
}