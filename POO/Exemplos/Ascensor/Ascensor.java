package Ascensor;

public class Ascensor {
  public String marca;
  public double peso_soportado;
  public double potencia;
  public String dimensions;

  public Ascensor() {
  }

  public Ascensor(String marca, double peso_soportado, double potencia, String dimensions) {
    this.marca = marca;
    this.peso_soportado = peso_soportado;
    this.potencia = potencia;
    this.dimensions = dimensions;
  }

  public void subir() {
    System.out.println("Subindo...");
  }

  public void baixar() {
    System.out.println("Baixando...");
  }

  public void parar() {
    System.out.println("PARADO");
  }
}
