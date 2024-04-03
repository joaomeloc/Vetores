// Em um sistema de validação de dados, é importante identificar se um número é par ou ímpar. Crie uma função que receba um número inteiro como argumento e retorne True se ele for par e False se for ímpar.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Variáveis
    int num;
    //Entrada
    System.out.println("Digite um número: ");
    num = scanner.nextInt();
    //Processamento
    if(num % 2 == 0){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
  }
}