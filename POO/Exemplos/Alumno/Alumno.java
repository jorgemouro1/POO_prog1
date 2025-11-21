package Alumno;

public class Alumno {
  private String Nome;
  private String Apelidos;
  private String LugarResidencia;
  private double MediaPonderada;

  public Alumno() {
  }

  public Alumno(String Nome, String Apelidos, String LugarResidencia, double MediaPonderada) {
    this.Nome = Nome;
    this.Apelidos = Apelidos;
    this.LugarResidencia = LugarResidencia;
    this.MediaPonderada = MediaPonderada;
  }

  public void estudar() {
    System.out.println("Estou estudando");
  }

  public void comer() {
    System.out.println("Teño fame, vou comer");
  }

  public void falar() {
    System.out.println("Estou falando");
  }

  public void setNome(String Nome) {
    this.Nome = Nome;
  }

  public void setApelidos(String Apelidos) {
    this.Apelidos = Apelidos;
  }

  public void setLugarResidencia(String LugarResidencia) {
    this.LugarResidencia = LugarResidencia;
  }

  public void setMediaPonderada(double MediaPonderada) {
    this.MediaPonderada = MediaPonderada;
  }

  public String getNome() {
    return Nome;
  }

  public String getApelidos() {
    return Apelidos;
  }

  public String getLugarResidencia() {
    return LugarResidencia;
  }

  public double getMediaPonderada() {
    return MediaPonderada;
  }
}
