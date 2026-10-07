package Src;

import java.util.Scanner;

public class Calculadora {  

  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("----Bem vindo a Calculadora----");
    try {
          Thread.sleep(1000);
      } catch (InterruptedException e) {
            e.printStackTrace();
      }
    System.out.println();
    System.out.println();

    System.out.println("Deseja fazer qual cálculo? (Coloque somente o número)");
    System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
    System.out.println();
    System.out.print("Cálculo escolhido: ");
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