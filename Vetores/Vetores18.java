// Em um sistema de monitoramento de temperaturas, é importante identificar a temperatura mais alta registrada. Faça um programa que leia 8 valores de temperatura e, em seguida, encontre e imprima a maior temperatura registrada.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double maiorTemperatura = Integer.MIN_VALUE;

    for (int i = 1; i <= 8; i++) {
      System.out.print("Digite a temperatura " + i + ": ");
      double temperatura = scanner.nextDouble();

      if (temperatura > maiorTemperatura) {
        maiorTemperatura = temperatura;
      }
    }

    System.out.println("A maior temperatura registrada foi: " + maiorTemperatura);
  }
}