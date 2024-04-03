// Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números primos e suas respectivas posições.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];
    int i, j, cont = 0;
    boolean primo = true;

    for (i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      vetor[i] = sc.nextInt();
    }

    for (i = 0; i < 10; i++) {
      primo = true;
      for (j = 2; j < vetor[i]; j++) {
        if (vetor[i] % j == 0) {
          primo = false;
          break;
        }
      }
      if (primo) {
        System.out.println("O número " + vetor[i] + " é primo e está na posição " + i);
      }
    }
  }

}