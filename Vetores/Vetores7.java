//Crie um programa em java para instanciar um vetor de 5 posições de números decimais e encontre o maior valor e o menor valor deste um
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Instanciar um vetor de 5 posições de números decimais
    double[] vetor = new double[5];
    
    //Preencher vetor
    preencherVetor(vetor);

    //Encontrar o maior valor e o menor valor deste vetor
    double maior = encontrarMaiorValor(vetor);
    double menor = encontrarMenorValor(vetor);

    //Exibir o maior valor e o menor valor
    System.out.println("Maior valor no vetor: " + maior);
    System.out.println("Menor valor no vetor: " + menor);
  }
    //Método para preencher o vetor
  public static void preencherVetor(double[] vetor) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite os valores do vetor: ");

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Valor " + (i + 1) + ": ");
      vetor[i] = scanner.nextDouble();
    }
  }

  //Função para encontrar o maior valor no vetor
  public static double encontrarMaiorValor(double[] vetor) {
    double maior = vetor[0];
    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    return maior;
  }
  //Função para encontrar o menor valor no vetor
  public static double encontrarMenorValor(double[] vetor) {
    double menor = vetor[0];
    for (int i = 1; i < vetor.length; i++){
      if (vetor[i] < menor) {
        menor = vetor[i];
      }
    }
   return menor;   
  }

}