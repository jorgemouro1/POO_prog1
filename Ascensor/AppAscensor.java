import java.util.Scanner;

public class AppAscensor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean elexirOpcion = true;
    int actual;
    int total;

    do { // creamos un bucle para ir comprobando que os datos que mete o usuario son
         // correctos
      System.out.print("En que piso estás? ");
      actual = sc.nextInt();
      System.out.print("Cantos pisos ten o edificio? ");
      total = sc.nextInt();
    } while (actual > total || actual < 0 || total <= 0); // seguimos preguntando hasta que sexan correctos

    Ascensor a = new Ascensor(actual, total); // cando xa sexan correctos, creamos o obxecto ascensor cos datos do
                                              // usuario

    while (elexirOpcion == true) { // menú de opcións, o menú síguese mostrando hasta que o usuario saia do
                                   // programa co 4
      System.out.println("Que queres facer?");
      System.out.println("1. Subir");
      System.out.println("2. Baixar");
      System.out.println("3. Mostrar");
      System.out.println("4. Saír");

      System.out.print("Introduce a opción: ");
      int opcion = sc.nextInt();

      switch (opcion) {
        case 1: // no caso 1 preguntamos cantos quere subir e usamos o método subir co dato que
                // metiu o usuario
          System.out.print("Cantos pisos vas subir? (Introduce o número): ");
          int subimos = sc.nextInt();
          a.subir(subimos);
          break;
        case 2: // aquí o mismo pero con baixar
          System.out.print("Cantos pisos queres baixar? (Introduce o número): ");
          int baixamos = sc.nextInt();
          a.baixar(baixamos);
          break;
        case 3: // Aquí solo mostramos onde está o usuario
          System.out.println("Estás no piso: " + a.situacion());
          break;
        case 4: // cando o usuario queira salir, poñemos o flag en falso para que pare
          elexirOpcion = false;
          break;
        default: // se mete algún número que non esté no menú, paramos e pedimos que poña algún
                 // outro
          System.out.println("Introduce un número válido");
      }

    }
    sc.close();
  }
}
