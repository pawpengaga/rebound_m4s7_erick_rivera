package modelo;

public abstract class Vehiculo {

  // Protected funciona con el propio contenido de la clase o con quienes comparten package con la clase.
  public int numRuedas;
  public int cantVentanas;
  public boolean encendido;

  public abstract void encender();
  public abstract void apagar();

  protected void mensaje(String body){
    System.out.print(body + " DICE: ");
  };

}
