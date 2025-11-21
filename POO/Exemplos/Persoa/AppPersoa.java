package Persoa;

public class AppPersoa {
  public static void main(String[] args) {
    Persoa manuel = new Persoa(); // creamos un obxecto manuel da clase Persoa
    // chamamos os membros de manuel
    manuel.setNome("Manuel");
    manuel.setAltura(187);
    manuel.setDataNacemento("12-2-1900");
    manuel.setPeso(100);

    System.out.println(manuel.getNome());
    System.out.println(manuel.getAltura());
    System.out.println(manuel.getDataNacemento());
    System.out.println(manuel.getPeso());

    System.out.println("---------------------------------------");

    Persoa maria = new Persoa("María", "01-01-1000", 50, 160);

    System.out.println(maria.getNome());
    System.out.println(maria.getAltura());
    System.out.println(maria.getDataNacemento());
    System.out.println(maria.getPeso());

  }
}