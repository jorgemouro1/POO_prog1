package Conta;

public class AppConta {
  public static void main(String[] args) {
    Conta c = new Conta(); // creamos o obxecto C co constructor por defecto
    c.idConta = 01; // imos dandolle valores aos atributos
    c.saldo = 1000000000;
    c.titular = "Jorge";

    // mostramos resultados
    System.out.println(c.idConta);
    System.out.println(c.saldo);
    System.out.println(c.titular);
  }
}
