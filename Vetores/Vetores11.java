// Um laboratório de pesquisa coleta dados de temperatura em diferentes regiões. Escreva um programa que solicite ao usuário digitar 10 valores de temperatura e, em seguida, calcule e imprima a temperatura média dessas regiões.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
     
   //Declarar variaveis
    int totalTemperaturas = 10;
    double somaTemperaturas = 0;
    
   //Solicitando ao usuario digitar 10 valores de temperatura
    System.out.println("Digite 10 valores de temperatura:");
    for (int i = 1; i <= totalTemperaturas; i++) {
      System.out.print("Temperatura " + i + ": ");
      double temperatura = scanner.nextDouble();
      somaTemperaturas += temperatura;
    }
   
   //Calcular a temperatura media
    double temperaturaMedia = somaTemperaturas / totalTemperaturas;
    System.out.println("A temperatura média das regiões é: " + temperaturaMedia);

    scanner.close();
  }
}