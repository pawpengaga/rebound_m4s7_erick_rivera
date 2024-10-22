package modelo;

import interfaces.InterfazVehiculo;

public class Auto extends Vehiculo implements InterfazVehiculo {

  public String color;
  public String modelo;

  public Auto(String color, String modelo) {
    super();
    this.color = color;
    this.modelo = modelo;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public String toString() {
    return "{" +
      " color='" + getColor() + "'" +
      ", modelo='" + getModelo() + "'" +
      "}";
  }

  @Override
  public void encender() {
  }


  @Override
  public void apagar() {
  }

  @Override
  public String tipoBencina(String tipoBencina) {
    return "Bencina " + tipoBencina + " cargada!!";
  }

}
