import java.util.Scanner;

public class Calculadora {  

  public static void main (String[] args) {

    mensagemInicio mensagemInicio = new mensagemInicio();

    Scanner scanner = new Scanner(System.in);

    mensagemInicio.mostrarMensagem();

    int numeroDigitado = Integer.parseInt(scanner.next());

    System.out.println();

    while (numeroDigitado != 1 && numeroDigitado != 2 && numeroDigitado != 3 && numeroDigitado != 4) {
      System.out.println("Cálculo não existente! Tente novamente.");
      System.out.println("Deseja fazer qual cálculo? (Coloque somente o número)");
      System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
      System.out.println();
      System.out.print("Cálculo escolhido: ");
      numeroDigitado = Integer.parseInt(scanner.next());
    }

  }
}