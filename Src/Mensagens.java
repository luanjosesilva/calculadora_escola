package Src;

import java.util.Scanner;

public class Mensagens {



    public static int mensagemInicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n----Bem vindo a \u001B[36mCalculadora\u001B[0m----");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nDeseja fazer qual cálculo? (Coloque somente o \u001B[33mnúmero\u001B[0m)");
        System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
        System.out.println();
        System.out.print("Cálculo escolhido: ");

        int numeroDigitado = scanner.nextInt();
        
        while (numeroDigitado > 4 || numeroDigitado < 1) {

                Mensagens.limparTerminal();

                System.out.println("\n\n\u001B[31mCálculo '" + numeroDigitado + "' não existente! Tente novamente.\u001B[0m");
                System.out.println("Deseja fazer qual cálculo? (Coloque somente o número)");
                System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
                System.out.println();
                
                System.out.print("Cálculo escolhido: ");
                numeroDigitado= scanner.nextInt();
            }
        
        
        return numeroDigitado;
        
    }

    public static void desejaContinuar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDeseja continuar na calculadora? (Coloque somente o número)");
        System.out.println("1 - Sim\n2 - Não");
        int continuar = scanner.nextInt();

        switch (continuar) {
            case 1:
                Mensagens.mensagemInicio();
                break;
        
            case 2:
                System.out.println("\nEncerrando...");
                System.exit(0);
                break;
        }

    }

    public static void limparTerminal() {

        System.out.println("\033[2J\033[H");
        System.out.flush();

    }


}
            