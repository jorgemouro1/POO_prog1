package Circulini;

public class Xeometría {
  public static void main(String[] args) {
    Círculo c = new Círculo(5);
    System.out.println("Área: " + c.área());
    System.out.println("Lonxitude: " + c.lonxitude());
    c.agrandar(2);
    System.out.println(c.getRadio());
  }
}
