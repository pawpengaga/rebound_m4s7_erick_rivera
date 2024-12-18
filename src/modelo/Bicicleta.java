package modelo;

public class Bicicleta extends Vehiculo {

  private String tipoBicicleta;

  public Bicicleta(String tipoBicicleta) {

    super();
    
    this.tipoBicicleta = tipoBicicleta;
    this.encendido = false;

    this.numRuedas = 2;
    this.cantVentanas = 0;

  }

  public String getTipoBicicleta() {
    return this.tipoBicicleta;
  }

  public void setTipoBicicleta(String tipoBicicleta) {
    this.tipoBicicleta = tipoBicicleta;
  }

  @Override
  public String toString() {
    return "{" +
      " tipoBicicleta='" + getTipoBicicleta() + "'" +
      " numero_ruedas='" + this.numRuedas + " (porque es una bici.) " + "'" +
      " tipoBicicleta='" + this.cantVentanas + " (porque es una bici.) " +
      " }";
  }

  @Override
  public void encender() {
    mensaje("BICI");
    if (!this.encendido) {
      System.out.println("Empezando a pedalear!!");
      this.encendido = true;
    } else {
      System.out.println("El auto ya está encendido.");
    }
  }

  @Override
  public void apagar() {
    mensaje("BICI");
    if (this.encendido) {
      System.out.println("Dejando de pedalear...");
      this.encendido = false;
    } else {
      System.out.println("Ya no estas pedaleando.");
    }
  }

}
