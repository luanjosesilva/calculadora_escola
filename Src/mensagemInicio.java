public class mensagemInicio {

    public void mostrarMensagem() {
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
    }
}