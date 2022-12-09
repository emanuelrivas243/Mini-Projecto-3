package Modelo;

public class Servicios {
  private String  NombreServicio;

  private String  IddServicio;

    public Servicios(String nombreServicio,String  IddServicio) {
       this.NombreServicio = nombreServicio;
       this.IddServicio = IddServicio;
    }

    public String getNombreServicio() {
        return NombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        NombreServicio = nombreServicio;
    }

    public String getIddServicio() {
        return IddServicio;
    }

    public void setIddServicio(String iddServicio) {
        IddServicio = iddServicio;
    }

    @Override
    public String toString() {
        return "Servicios{" +
                "NombreServicio='" + NombreServicio + '\'' +
                ", IddServicio='" + IddServicio + '\'' +
                '}';
    }
}
