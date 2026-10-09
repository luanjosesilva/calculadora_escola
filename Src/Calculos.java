package Src;

import java.util.Scanner;

public class Calculos {
    
    public static void adicao() {
        
        Scanner scanner = new Scanner(System.in);

        Mensagens.limparTerminal();

        System.out.println("\n\nVocê escolheu o cálculo de Adição!");
        System.out.println("Quais são os números escolhidos?\n");
        
        System.out.print("Primeiro número escolhido: ");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.print("Segundo número escolhido: ");
        double segundoNumero = scanner.nextDouble();
        
        double resultado = primeiroNumero + segundoNumero;
        System.out.println("O resultado dessa soma é: " + resultado);

        Mensagens.desejaContinuar();
    }

}
