package Ascensor;

public class AppAscensor {
  public static void main(String[] args) {
    Ascensor a1 = new Ascensor();
    a1.marca = "Otis";
    a1.dimensions = "1x 1.25x 2.10";
    a1.peso_soportado = 450;
    a1.potencia = 2.2;

    Ascensor a2 = new Ascensor("KONE", 500, 3, "1.5 x 1.5x 2.5");

    System.out.println(a1.marca);
    System.out.println(a1.dimensions);
    System.out.println(a1.peso_soportado);
    System.out.println(a1.potencia);

    System.out.println("----------------------------------");

    System.out.println(a2.marca);
    System.out.println(a2.dimensions);
    System.out.println(a2.peso_soportado);
    System.out.println(a2.potencia);

    a1.subir();
    a2.baixar();
    a1.parar();
  }
}
