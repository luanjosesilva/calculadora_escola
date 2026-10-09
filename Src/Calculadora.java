package Src;

public class Calculadora {  
  public static void main (String[] args) {

    int numeroEscolhido;

    String nomeCalculo = null;

    numeroEscolhido = MensagemInicio.mostrarMensagem();

    switch(numeroEscolhido) {

            case 1:
            nomeCalculo = "Adição";
            Calculos.adicao();
            break;

            case 2:
            nomeCalculo = "Subtração";
            break;

            case 3:
            nomeCalculo = "Multiplicação";
            break;

            case 4:
            nomeCalculo = "Divisão";
            break;
        }


    // System.out.println("Cálculo final escolhido: " + numeroEscolhido + " - " + nomeCalculo);
  }

}