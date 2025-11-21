package Persoa;

public class Persoa {
  private String nome;
  private String dataNacemento;
  private double peso;
  private int altura;

  // constructor por defecto
  public Persoa() {
  }

  // constructor de clase
  public Persoa(String nome, String dataNacemento, double peso, int altura) {
    /* Inicialización de atributos */
    this.nome = nome;
    this.dataNacemento = dataNacemento;
    this.peso = peso;
    this.altura = altura;
  }

  public void durmir() {
    System.out.println("Vou durmir");
  }

  public void comer() {
    System.out.println("Vou comer");
  }

  public void camiñar() {
    System.out.println("Vou camiñar");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setDataNacemento(String dataNacemento) {
    this.dataNacemento = dataNacemento;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getNome() {
    return nome;
  }

  public int getAltura() {
    return altura;
  }

  public String getDataNacemento() {
    return dataNacemento;
  }

  public double getPeso() {
    return peso;
  }

}