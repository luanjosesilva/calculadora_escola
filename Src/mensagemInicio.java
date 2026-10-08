import java.util.Scanner;

public class mensagemInicio {



    public static int mostrarMensagem() {
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

        int numeroDigitado = scanner.nextInt();
        mensagemInicio.validarEntrada(numeroDigitado); 

        return numeroDigitado;
        
    }

    public static void validarEntrada(int numeroDigitado){
        Scanner scanner = new Scanner(System.in);
            while (numeroDigitado != 1 && numeroDigitado != 2 && numeroDigitado != 3 && numeroDigitado != 4) {
                System.out.println("\nCálculo não existente! Tente novamente.");
                System.out.println("Deseja fazer qual cálculo? (Coloque somente o número)");
                System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
                System.out.println();
                System.out.print("Cálculo escolhido: ");
                numeroDigitado = scanner.nextInt();
            }
        } return numeroDigitado;

    }
            