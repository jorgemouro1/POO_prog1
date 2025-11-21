package CD;

//definimos a clase
public class CD {
  private String diametro;
  private String grosor;
  private String tipo;

  // facemos o método co constructor baldeiro
  public CD() {
  }

  // constructor con atributos inicializados
  public CD(String diametro, String grosor, String tipo) {
    this.diametro = diametro;
    this.grosor = grosor;
    this.tipo = tipo;
  }

  // métodos da clase
  public void reproducir() {
    System.out.println("Vou reproducir un CD");
  }

  public void deter() {
    System.out.println("Agora vou paralo");
  }

  // getters e setters
  public String getDiametro() {
    return diametro;
  }

  public String getGrosor() {
    return grosor;
  }

  public String getTipo() {
    return tipo;
  }

  public void setDiametro(String diametro) {
    this.diametro = diametro;
  }

  public void setGrosor(String grosor) {
    this.grosor = grosor;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

}
