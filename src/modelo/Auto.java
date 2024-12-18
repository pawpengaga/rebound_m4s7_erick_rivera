package modelo;

import java.util.Scanner;

import interfaces.InterfazVehiculo;

public class Auto extends Vehiculo implements InterfazVehiculo {

  private String color;
  private String modelo;

  public Auto(String color, String modelo, int cantVentanas) {
    super();

    this.color = color;
    this.modelo = modelo;
    this.encendido = false;

    this.numRuedas = 4;
    this.cantVentanas = cantVentanas;
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
      ", numero_ruedas='" + this.numRuedas + "'" +
      ", cantidad_ventanas='" + this.cantVentanas + "'" +
      " }";
  }
  

  @Override
  public void encender() {
    mensaje("AUTO");
    if (!encendido) {
      System.out.println("Encendiendo el motor del auto VROOM!");
      encendido = true;
    } else {
      System.out.println("El auto ya está encendido...");
    }
  }

  @Override
  public void apagar() {
    mensaje("AUTO");
    if (encendido) {
      System.out.println("Apagando el auto...");
      encendido = false;
    } else {
      System.out.println("El auto ya esta apagado...");
    }
  }

  @Override
  public String tipoBencina() {
    mensaje("AUTO");
    Scanner myscan = new Scanner(System.in);
    System.out.println("Hola! que bencina va a cargar?");
    String tipoBencina = myscan.nextLine();
    myscan.close();
    return "Gracias por prefererinos. Bencina " + tipoBencina + " cargada!!";

  }

}
