package CD;

public class AppCD {
  public static void main(String[] args) {
    CD Pluto = new CD();
    Pluto.setDiametro("3.5cm");
    Pluto.setGrosor("2 mm");
    Pluto.setTipo("CD-ROM");

    CD Tesis = new CD("5 cm", "3mm", "CD-R");

    System.out.println(Pluto.getDiametro());
    System.out.println(Pluto.getGrosor());
    System.out.println(Pluto.getTipo());

    System.out.println("----------------------------------");

    System.out.println(Tesis.getDiametro());
    System.out.println(Tesis.getGrosor());
    System.out.println(Tesis.getTipo());
  }
}
