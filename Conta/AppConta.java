package Conta;

public class AppConta {
  public static void main(String[] args) {
    // creamos o obxecto usando o constructor
    Conta c = new Conta(01, "Tonecho", 1000); // creamos o obxecto C co constructor por defecto

    // mostramos resultados
    System.out.println(c.idConta);
    System.out.println(c.saldo);
    System.out.println(c.titular);
  }
}
