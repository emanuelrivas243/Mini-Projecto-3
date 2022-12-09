package Modelo;

public class MedicosEspecialistas {

private String  NombreEspecialista;

private String ApellidoMedícooEspecialista;

private String CedulaMedícooEspecialista;

private String IddelServicio ;

private String IDMedico ;

    public MedicosEspecialistas(String nombreEspecialista,String ApellidoMedícooEspecialista,
                                String CedulaMedícooEspecialista, String IddelServicio,String IDMedico) {
        this.NombreEspecialista = nombreEspecialista;
        this.ApellidoMedícooEspecialista=ApellidoMedícooEspecialista;
        this.CedulaMedícooEspecialista=CedulaMedícooEspecialista;
        this.IddelServicio=IddelServicio;
        this.IDMedico=IDMedico;
    }

    public String getNombreEspecialista() {
        return NombreEspecialista;
    }

    public void setNombreEspecialista(String nombreEspecialista) {
        NombreEspecialista = nombreEspecialista;
    }

    public String getApellidoMedícooEspecialista() {
        return ApellidoMedícooEspecialista;
    }

    public String getCedulaMedícooEspecialista() {
        return CedulaMedícooEspecialista;
    }

    public void setCedulaMedícooEspecialista(String cedulaMedícooEspecialista) {
        CedulaMedícooEspecialista = cedulaMedícooEspecialista;
    }

    public void setApellidoMedícooEspecialista(String apellidoMedícooEspecialista) {
        ApellidoMedícooEspecialista = apellidoMedícooEspecialista;
    }

    public String getIddelServicio() {
        return IddelServicio;
    }

    public void setIddelServicio(String iddelServicio) {
        IddelServicio = iddelServicio;
    }

    public String getIDMedico() {
        return IDMedico;
    }

    public void setIDMedico(String IDMedico) {
        this.IDMedico = IDMedico;
    }

    @Override
    public String toString() {
        return "MedicosEspecialistas{" +
                "NombreEspecialista='" + NombreEspecialista + '\'' +
                ", ApellidoMedícooEspecialista='" + ApellidoMedícooEspecialista + '\'' +
                ", CedulaMedícooEspecialista='" + CedulaMedícooEspecialista + '\'' +
                ", IddelServicio='" + IddelServicio + '\'' +
                ", IDMedico='" + IDMedico + '\'' +
                '}';
    }
}
