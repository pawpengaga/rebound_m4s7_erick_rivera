package modelo;

public abstract class Vehiculo {

  // Como son protected solo funcionaran en instancias de la clase creo
  protected int numRuedas;
  protected int cantVentanas;

  public abstract void encender();
  public abstract void apagar();

}
