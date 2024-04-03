//Em uma escola, os professores precisam ensinar a tabuada aos alunos. Crie um programa que peça ao usuário inserir um número inteiro correspondente à tabuada desejada e, em seguida, imprima a tabuada desse número até 10.
import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          try {
              System.out.print("Digite um número inteiro para gerar a tabuada: ");
              int numero = scanner.nextInt();

              System.out.println("Tabuada do " + numero + ":");
              for (int i = 1; i <= 10; i++) {
                  System.out.println(numero + " x " + i + " = " + (numero * i));
              }
          } catch (Exception e) {
              System.out.println("Por favor, digite um número inteiro válido.");
          } finally {
              scanner.close();
          }
      }
  }