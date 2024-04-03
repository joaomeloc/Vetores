// Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível. Calcule e mostre: o modelo de carro mais econômico; e quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar os modelos dos carros
        String[] modelos = new String[5];

        // Vetor para armazenar o consumo dos carros em km/l
        double[] consumo = new double[5];

        // Solicitar ao usuário que insira os modelos dos carros
        System.out.println("Digite os modelos dos carros:");
        for (int i = 0; i < modelos.length; i++) {
            System.out.print("Modelo do carro " + (i + 1) + ": ");
            modelos[i] = scanner.nextLine();
        }

        // Solicitar ao usuário que insira o consumo dos carros
        System.out.println("Digite o consumo dos carros (km/l):");
        for (int i = 0; i < consumo.length; i++) {
            System.out.print("Consumo do carro " + (i + 1) + ": ");
            consumo[i] = scanner.nextDouble();
        }

        // Encontrar o modelo mais econômico
        int indiceCarroMaisEconomico = encontrarCarroMaisEconomico(consumo);
        System.out.println("O modelo mais econômico é: " + modelos[indiceCarroMaisEconomico]);

        // Calcular quantos litros cada carro consome para percorrer 1000 km
        System.out.println("Litros consumidos para percorrer 1000 km:");
        for (int i = 0; i < modelos.length; i++) {
            double litros = calcularLitrosPara1000Km(consumo[i]);
            System.out.println(modelos[i] + ": " + litros + " litros");
        }

        // Fechar o Scanner
        scanner.close();
    }

    // Método para encontrar o índice do carro mais econômico
    public static int encontrarCarroMaisEconomico(double[] consumo) {
        int indiceMaisEconomico = 0;
        for (int i = 1; i < consumo.length; i++) {
            if (consumo[i] > 0 && consumo[i] > consumo[indiceMaisEconomico]) {
                indiceMaisEconomico = i;
            }
        }
        return indiceMaisEconomico;
    }

    // Método para calcular quantos litros são necessários para percorrer 1000 km
    public static double calcularLitrosPara1000Km(double consumo) {
        return 1000.0 / consumo;
    }
}