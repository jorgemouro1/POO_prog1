package Autobus;

public class Autobus {
  private String matricula;
  private String cor;
  private int capacidade;
  private String tipoCombustible;

  public Autobus(String matricula, String cor, int capacidade, String tipoCombustible) {
    this.matricula = matricula;
    this.cor = cor;
    this.capacidade = capacidade;
    this.tipoCombustible = tipoCombustible;
  }

  public Autobus() {

  }

  public void arrancar() {
    System.out.println("Arrancando");
  }

  public void parar() {
    System.out.println("Stop");
  }

  public void recollerPersoa() {
    System.out.println("Vai cheo non pode subir");
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public void setTipoCombustible(String tipoCombustible) {
    this.tipoCombustible = tipoCombustible;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getCor() {
    return cor;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public String getTipoCombustible() {
    return tipoCombustible;
  }

}
