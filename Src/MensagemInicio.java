import java.util.Scanner;

public class MensagemInicio {



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
        numeroDigitado = MensagemInicio.validarEntrada(numeroDigitado); 

        return numeroDigitado;
        
    }

    public static int validarEntrada(int numeroDigitado){
        int numeroDigitadoErro = numeroDigitado;
        Scanner scanner = new Scanner(System.in);
            while (numeroDigitadoErro != 1 && numeroDigitadoErro != 2 && numeroDigitadoErro != 3 && numeroDigitadoErro != 4) {
                System.out.println("\nCálculo não existente! Tente novamente.");
                System.out.println("Deseja fazer qual cálculo? (Coloque somente o número)");
                System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão");
                System.out.println();
                System.out.print("Cálculo escolhido: ");
                numeroDigitadoErro = scanner.nextInt();
            }
        return numeroDigitadoErro;
    } 
}
            