package Alumno;

public class AppAlumno {
  public static void main(String[] args) {
    Alumno Jorge = new Alumno();
    Jorge.setNome("Jorge");
    Jorge.setApelidos("Mouro Cantorna");
    Jorge.setLugarResidencia("Santa Comba");
    Jorge.setMediaPonderada(0);

    System.out.println(Jorge.getNome());
    System.out.println(Jorge.getApelidos());
    System.out.println(Jorge.getLugarResidencia());
    System.out.println(Jorge.getMediaPonderada());

    System.out.println("--------------------------------------");

    Alumno a2 = new Alumno("aaa", "bbb", "Santiago", 0);
    System.out.println(a2.getNome());
    System.out.println(a2.getApelidos());
    System.out.println(a2.getLugarResidencia());
    System.out.println(a2.getMediaPonderada());
  }
}
