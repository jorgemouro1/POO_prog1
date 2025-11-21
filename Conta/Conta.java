package Conta;

//creamos a clase conta
public class Conta {
  // definimos os atributos
  public int idConta;
  public String titular;
  public double saldo;

  // creamos o constructor
  public Conta(int idConta, String titular, double saldo) {
    this.idConta = idConta;
    this.titular = titular;
    this.saldo = saldo;
  }

  public Conta() {
  }
}
