package vista;

import modelo.Auto;
import modelo.Bicicleta;
import modelo.Vehiculo;

public class VehiculoApp {
  public static void main(String[] args) {

    Auto autoCobalt = new Auto("Azul", "Cobalt SS", 4);
    Vehiculo biciTrek = new Bicicleta("Trek Azul");

    System.out.println("-----------------------------------------------------\n");
    
    System.out.println("VEHICULOS APP: DEMO");
    System.out.println("Aquí mensaje sobre lo importante que es pedalear en lugar de ir en auto");

    System.out.println();

    System.out.println(autoCobalt.tipoBencina());
    biciTrek.apagar();
    biciTrek.encender();
    System.out.println();
    autoCobalt.apagar();
    autoCobalt.encender();
    autoCobalt.apagar();

    System.out.println("\n\nLos vehiculos involucrados son:");
    System.out.println();
    System.out.println(autoCobalt);
    System.err.println(biciTrek);
  }
}
