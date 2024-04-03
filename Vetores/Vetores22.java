// Em uma calculadora, é necessário somar dois números digitados pelo usuário. Escreva um procedimento que receba dois números como parâmetros e imprima a soma deles
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //Variáveis
    int num1, num2, soma;
    //Entrada de dados
    System.out.println("Informe o primeiro número: ");
    num1 = scanner.nextInt();
    System.out.println("Informe o segundo número: ");
    num2 = scanner.nextInt();
    //Calculo
    soma = num1 + num2;
    //Resultado
    System.out.println("O resultado da soma é: " + soma);
    
  }
}