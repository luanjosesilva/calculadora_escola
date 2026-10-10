package Src;

public class Calculadora {  
  public static void main (String[] args) {

    int numeroEscolhido;

    // String nomeCalculo = null;

    numeroEscolhido = Mensagens.mensagemInicio();

    switch(numeroEscolhido) {

            case 1:
            // nomeCalculo = "Adição";
            Calculos.adicao();
            break;

            case 2:
            // nomeCalculo = "Subtração";
            Calculos.subtracao();
            break;

            case 3:
            // nomeCalculo = "Multiplicação";
            Calculos.multiplicacao();
            break;

            case 4:
            // nomeCalculo = "Divisão";
            Calculos.divisao();
            break;
        }


    // System.out.println("Cálculo final escolhido: " + numeroEscolhido + " - " + nomeCalculo);
  }

}