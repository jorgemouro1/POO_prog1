package Conta;

public class AppConta {
  public static void main(String[] args) {
    // creamos o obxecto usando o constructor
    Conta c = new Conta(1, "Tonecho", 1000); // creamos o obxecto C co constructor por defecto

    Conta conta2 = new Conta();
    conta2.idConta = 2;
    conta2.titular = "Jorge";
    conta2.saldo = 100000;

    // mostramos resultados
    System.out.println(c.idConta);
    System.out.println(c.saldo);
    System.out.println(c.titular);

    System.out.println(conta2.idConta);
    System.out.println(conta2.saldo);
    System.out.println(conta2.titular);
  }
}
