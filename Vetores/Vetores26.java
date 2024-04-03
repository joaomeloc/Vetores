// Em um sistema de controle de notas de alunos, é necessário calcular a média das notas de uma turma. Crie um procedimento que receba um vetor de números inteiros como parâmetro e imprima a média dos valores contidos nesse vetor.
//Não tenho certeza se era dessa forma que você queria, mas foi o que eu entendi.

public class Main {
    public static void main(String[] args) {
        int[] notas = {7, 5, 9, 4, 10}; 

        calcularEMostrarMedia(notas);
    }

    // Procedimento para calcular e mostrar a média dos valores em um vetor
    public static void calcularEMostrarMedia(int[] vetor) {
        // Verificar se o vetor está vazio
        if (vetor.length == 0) {
            System.out.println("Vetor vazio. Não é possível calcular a média.");
            return;
        }

        // Calcular a soma dos valores no vetor
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }

        // Calcular a média
        double media = (double) soma / vetor.length;

        // Imprimir a média
        System.out.println("A média dos valores no vetor é: " + media);
    }
}