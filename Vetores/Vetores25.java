// Em um sistema de construção, é necessário calcular o perímetro de uma área para cercá-la. Faça um procedimento que calcule e imprima o valor do perímetro de um círculo, dado o raio fornecido pelo usuário.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Chamar o procedimento para calcular e imprimir o perímetro
        calcularEImprimirPerimetro(raio);

        // Fechar o Scanner
        scanner.close();
    }

    // Procedimento para calcular e imprimir o perímetro de um círculo
    public static void calcularEImprimirPerimetro(double raio) {
        // Constante pi
        final double PI = 3.14159;

        // Calcular o perímetro
        double perimetro = 2 * PI * raio;

        // Imprimir o perímetro
        System.out.println("O perímetro do círculo é: " + perimetro);
    }
}