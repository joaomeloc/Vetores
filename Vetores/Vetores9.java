// Em um sistema de vendas, é necessário imprimir os recibos para os clientes. Escreva um programa que solicite ao usuário digitar a quantidade de recibos que deseja imprimir e, em seguida, imprima os números dos recibos de 1 até o número desejado utilizando um loop while.


public class Main {
  public static void main(String[] args) {
    int quantidadeRecibos;
    int contador = 1;

    System.out.println("Digite a quantidade de recibos que deseja imprimir:");
    quantidadeRecibos = Integer.parseInt(System.console().readLine());

    while (contador <= quantidadeRecibos) {
      System.out.println("Recibos " + contador);
      contador++;
    }

    
  }
}