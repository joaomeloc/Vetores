// Durante a verificação de estoque, é necessário identificar a presença de determinados produtos. Crie um programa que solicite ao usuário inserir um código de produto e, em seguida, verifique se esse código está presente em um vetor pré-definido.
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Vetor pré-definido
    String[] codigosProduto = {"001", "002", "003", "004", "005"};
    
    try{
      //Solicita ao usuário inserir um código de produto
      System.out.print("Insira o código de produto: ");
      String codigoInserido = scanner.nextLine();
    
      //Verifica se o código inserido está presente no vetor
      boolean encontrado = false;
      for (String codigo : codigosProduto) {
       if (codigo.equals(codigoInserido)) {
         encontrado = true;
         break;
        }
    }  
      //Exibe o resultado da verificação
      if (encontrado) {
        System.out.println("O produto está presente no estoque.");
      }else{
        System.out.println("O produto não está presente no estoque.");
      }
    }catch (Exception e) {
      System.out.println("Ocorreu um erro ao verificar o códido do produto");
    }finally {
      scanner.close();
    }
  }
}