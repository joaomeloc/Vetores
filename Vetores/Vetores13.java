// Em um sistema de segurança, é importante identificar números primos para gerar chaves de acesso. Crie um programa que solicite ao usuário inserir um número inteiro N e, em seguida, imprima todos os números primos menores ou iguais a N.
import java.util.Scanner;
public class Main {

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int n = scanner.nextInt();
    scanner.close();
    System.out.println("Números primos menores ou iguais a " + n + ":");
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }
}