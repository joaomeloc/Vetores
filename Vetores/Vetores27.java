// Implemente um array de escrita única de valores de um tipo numérico qualquer. Um array de escrita única é um array cujos elementos só podem ser modificados uma única vez. Para a implementação, devemos ter, para cada elemento do array, um valor booleano associado que diz se o elemento pode ser modificado ou não. Faça um for que percorra esses arrays e na primeira vez, todos os elementos do array poderão ser modificados, mas assim que um elemento for modificado pela primeira vez o seu valor booleano associado será modificado de forma que da próxima vez que o elemento for modificado nada ocorrerá. 

public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50}; 
        boolean[] podeSerModificado = new boolean[valores.length]; 

        // Inicializar todos os elementos do array de controle como verdadeiro (podem ser modificados)
        for (int i = 0; i < podeSerModificado.length; i++) {
            podeSerModificado[i] = true;
        }

        // Exibir os valores iniciais
        System.out.println("Valores iniciais:");
        exibirValores(valores);

        // Modificar os valores (apenas na primeira vez)
        for (int i = 0; i < valores.length; i++) {
            if (podeSerModificado[i]) {
                valores[i] += 5; 
                podeSerModificado[i] = false; 
            }
        }

        // Exibir os valores modificados
        System.out.println("\nValores após modificação:");
        exibirValores(valores);

        // Tentar modificar os valores novamente (nenhum valor deve ser modificado)
        for (int i = 0; i < valores.length; i++) {
            if (podeSerModificado[i]) {
                valores[i] += 10; 
            }
        }

        // Exibir os valores após a tentativa de modificação
        System.out.println("\nValores após a segunda tentativa de modificação:");
        exibirValores(valores);
    }

    // Método auxiliar para exibir os valores do array
    public static void exibirValores(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}