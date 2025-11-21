package Autobus;

public class AppAutobus {
  public static void main(String[] args) {
    Autobus monbus = new Autobus();
    monbus.setCor("Amarelo");
    monbus.setCapacidade(20);
    monbus.setMatricula("1234ABC");
    monbus.setTipoCombustible("diesel");

    System.out.println(monbus.getCor());
    System.out.println(monbus.getCapacidade());
    System.out.println(monbus.getMatricula());
    System.out.println(monbus.getTipoCombustible());

    System.out.println("-------------------------------");

    Autobus aut1 = new Autobus("abcd123", "negro", 600, "diesel");
    System.out.println(aut1.getCor());
    System.out.println(aut1.getCapacidade());
    System.out.println(aut1.getMatricula());
    System.out.println(aut1.getTipoCombustible());
  }
}
