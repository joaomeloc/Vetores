// Em uma fábrica, é necessário calcular o tempo de produção de um produto com base no número de etapas necessárias. Escreva um programa que leia um número inteiro positivo correspondente ao número de etapas de produção e, em seguida, calcule e imprima o tempo total de produção. Considere que cada etapa de produção tem a duração de 30 minutos.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      //Solicitar ao usuário o número de etapas
      System.out.print("Digite o número de etapas de produção: ");
      int numEtapas = scanner.nextInt();

      //Calculo do tempo total
      int tempoTotal = numEtapas * 30;

      //imprimir o tempo total
      System.out.println("O tempo total de produção é de " + tempoTotal + " minutos.");
    }catch (Exception e) {
      System.out.println("Informe um número inteiro valido.");
    }finally{
      scanner.close();
    }
  }
}