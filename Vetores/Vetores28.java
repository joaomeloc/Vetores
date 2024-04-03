// Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$545,00, acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre: um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final, deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar os preços e as quantidades vendidas
        double[] precos = new double[10];
        int[] quantidades = new int[10];

        // Solicitar ao usuário que insira os preços e as quantidades vendidas
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o preço do objeto " + (i + 1) + ": R$");
            precos[i] = scanner.nextDouble();
            System.out.print("Informe a quantidade vendida do objeto " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();
        }

        // Imprimir o relatório contendo a quantidade vendida, o valor unitário e o valor total de cada objeto
        System.out.println("\nRelatório de Vendas:");
        double valorTotalVendas = 0;
        for (int i = 0; i < 10; i++) {
            double valorTotalObjeto = precos[i] * quantidades[i];
            System.out.println("Objeto " + (i + 1) + ":");
            System.out.println("   Quantidade Vendida: " + quantidades[i]);
            System.out.println("   Valor Unitário: R$" + precos[i]);
            System.out.println("   Valor Total: R$" + valorTotalObjeto);
            valorTotalVendas += valorTotalObjeto;
        }

        // Calcular o valor da comissão do vendedor (5% do valor total das vendas)
        double salarioFixo = 545.00;
        double comissao = valorTotalVendas * 0.05;

        // Imprimir o valor geral das vendas e o valor da comissão do vendedor
        System.out.println("\nValor Geral das Vendas: R$" + valorTotalVendas);
        System.out.println("Comissão do Vendedor: R$" + comissao);

        // Determinar o objeto mais vendido e sua posição no vetor
        int objetoMaisVendido = 0;
        for (int i = 1; i < 10; i++) {
            if (quantidades[i] > quantidades[objetoMaisVendido]) {
                objetoMaisVendido = i;
            }
        }
        System.out.println("\nO objeto mais vendido foi o objeto " + (objetoMaisVendido + 1) +
                            " com quantidade vendida de " + quantidades[objetoMaisVendido]);
    }
}