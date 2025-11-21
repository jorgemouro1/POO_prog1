public class Ascensor {
  private int piso;
  private int limite;

  public Ascensor(int piso, int limite) {
    this.piso = piso;
    this.limite = limite;
  }

  // setters e getters
  public int getPiso() {
    return piso;
  }

  public int getLimite() {
    return limite;
  }

  public void setPiso(int piso) {
    this.piso = piso;
  }

  public void setLimite(int limite) {
    this.limite = limite;
  }

  // agora vou ir creando os métodos principais

  public void subir(int pisos) {
    for (int i = 0; (i < pisos); i++) { // a i empeza en 0, e imos sumando 1 ao número de pisos tantas veces como
                                        // indiquemos. Cando sobrepase o límite, poñemos unha mensaxe.
      if (this.piso < limite) {
        this.piso++;
        System.out.println("Subimos ao: " + this.piso);
      } else {
        System.out.println("Non hai mais pisos");
        break;
      }
    }
  }

  public void baixar(int npisos) {
    for (int i = 0; (i < npisos); i++) {
      if (this.piso > 0) { // aquí o mesmo que no anterior, pero cada vez vai restando de 1 en un, e se
                           // baixa de 0, salta unha mensaxe.
        this.piso--;
        System.out.println("Baixamos ao " + this.piso);
      } else {
        System.out.println("Non podes baixar máis");
        break;
      }
    }
  }

  public int situacion() {
    return this.piso;
  }
}
