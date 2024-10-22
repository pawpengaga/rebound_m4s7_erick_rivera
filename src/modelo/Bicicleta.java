package modelo;

public class Bicicleta extends Vehiculo {

  public String tipoBicicleta;

  public Bicicleta(String tipoBicicleta) {
    super();
    this.tipoBicicleta = tipoBicicleta;
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
      "}";
  }

  @Override
  public void encender() {
    
  }

  @Override
  public void apagar() {
    
  }

}
