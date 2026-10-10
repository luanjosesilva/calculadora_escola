package Src;

import java.util.Scanner;

@SuppressWarnings("resource")

public class Calculos {
    
    public static void adicao() {
        
        Scanner scanner = new Scanner(System.in);

        Mensagens.limparTerminal();

        System.out.println("\n\nVocê escolheu o cálculo de \u001B[32mAdição!\u001B[0m");
        System.out.println("Quais são os dois números escolhidos?\n");
        
        System.out.print("Primeiro número escolhido: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Segundo número escolhido: ");
        double segundoNumero = scanner.nextDouble();
        
        double resultado = primeiroNumero + segundoNumero;

        if (resultado == (int) resultado) {
            System.out.println("O resultado dessa soma é: \u001B[32m" + (int) resultado + "\u001B[0m");
        } else {
            System.out.println("O resultado dessa soma é: \u001B[32m" + resultado + "\u001B[0m");
        }

        Mensagens.desejaContinuar();

    }

    public static void subtracao() {

        Scanner scanner = new Scanner(System.in);

        Mensagens.limparTerminal();

        System.out.println("\n\nVocê escolheu o cálculo de \u001B[32mSubtração!\u001B[0m");
        System.out.println("Quais são os dois números escolhidos?\n");
        
        System.out.print("Primeiro número escolhido: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Segundo número escolhido: ");
        double segundoNumero = scanner.nextDouble();
        
        double resultado = primeiroNumero - segundoNumero;
        System.out.println("O resultado dessa subtração é: \u001B[32m" + resultado + "\u001B[0m");

        Mensagens.desejaContinuar();

    }

    public static void multiplicacao() {

        Scanner scanner = new Scanner(System.in);

        Mensagens.limparTerminal();

        System.out.println("\n\nVocê escolheu o cálculo de \u001B[32mMultiplicação!\u001B[0m");
        System.out.println("Quais são os dois números escolhidos?\n");
        
        System.out.print("Primeiro número escolhido: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Segundo número escolhido: ");
        double segundoNumero = scanner.nextDouble();
        
        double resultado = primeiroNumero * segundoNumero;
        System.out.println("O resultado dessa multiplicação é: \u001B[32m" + resultado + "\u001B[0m");

        Mensagens.desejaContinuar();

    }

    public static void divisao() {

        Scanner scanner = new Scanner(System.in);

        Mensagens.limparTerminal();

        System.out.println("\n\nVocê escolheu o cálculo de \u001B[32mDivisão!\u001B[0m");
        System.out.println("Quais são os dois números escolhidos?\n");
        
        System.out.print("Primeiro número escolhido: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Segundo número escolhido: ");
        double segundoNumero = scanner.nextDouble();
        
        double resultado = primeiroNumero / segundoNumero;
        System.out.println("O resultado dessa divisão é: \u001B[32m" + resultado + "\u001B[0m");

        Mensagens.desejaContinuar();

    }

}
