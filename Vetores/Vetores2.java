// Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante da intercalação deles.

public class Main {
  public static void main(String[] args) {
    //declarar variaveis
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];

    //Preenchendo vetores
    preencherVetor(vetor1);
    preencherVetor(vetor2);

    //Intercalando os valores
    int[] vetorIntercalado = intercalarVetores(vetor1, vetor2);
      
    //Exibo o vetor intercalado
    System.out.println("Vetor resultante da intercalação: ");
    exibirVetor(vetorIntercalado);
  }

  //Preencher vetor com valores sequenciais 
  public static void preencherVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = i + 1;
    }
  }

  //Metodo para intercalar os vetores
  public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {
    int[] resultado = new int[vetor1.length + vetor2.length];
    int indiceResultado = 0;

  //Intercala os valores dos vetores
    for (int i = 0; i < vetor1.length; i++) {
      resultado[indiceResultado++] = vetor1[i];
      resultado[indiceResultado++] = vetor2[i];
    }
    return resultado;
      
  }

  //Metodo para exibir o vetor
   public static void exibirVetor(int[] vetor) {
     for (int i = 0; i < vetor.length; i++) {
       System.out.print(vetor[i] + " ");
     }
     System.out.println();
   }






}