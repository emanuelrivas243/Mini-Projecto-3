package Modelo;


import java.time.LocalDate;
import java.time.LocalTime;

public class Citas {

    private String nombreAfiliado;
    private String apellidoAfiliado;
    private String cedulaAfiliado;
    private String  servicioMedico;
    private String  nombreMedico;
    private LocalDate fechaIngreso ;
    private LocalDate fechaSalida;
    private LocalTime hora;
    private String consultorioLaboratorio;


    public Citas(String nombreAfiliado, String apellidoAfiliado, String cedulaAfiliado, String  servicioMedico,
                 String nombreMedico, LocalDate fechaIngreso , LocalDate fechaSalida, LocalTime hora, String consultorioLaboratorio)
    {
        this.nombreAfiliado = nombreAfiliado;
        this.apellidoAfiliado = apellidoAfiliado;
        this.cedulaAfiliado = cedulaAfiliado;
        this.servicioMedico= servicioMedico;
        this.nombreMedico= nombreMedico;
        this.fechaIngreso= fechaIngreso;
        this.fechaSalida= fechaSalida;
        this.hora= hora;
        this.consultorioLaboratorio= consultorioLaboratorio;
    }

    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public void setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
    }

    public String getApellidoAfiliado() {
        return apellidoAfiliado;
    }

    public void setApellidoAfiliado(String apellidoAfiliado) {
        this.apellidoAfiliado = apellidoAfiliado;
    }

    public String getCedulaAfiliado() {
        return cedulaAfiliado;
    }

    public void setCedulaAfiliado(String cedulaAfiliado) {
        this.cedulaAfiliado = cedulaAfiliado;
    }

    public String getServicioMedico() {
        return servicioMedico;
    }

    public void setServicioMedico(String servicioMedico) {
        this.servicioMedico = servicioMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getConsultorioLaboratorio() {
        return consultorioLaboratorio;
    }

    public void setConsultorioLaboratorio(String consultorioLaboratorio) {
        this.consultorioLaboratorio = consultorioLaboratorio;
    }

    @Override
    public String toString() {
        return "Citas{" +
                "nombreAfiliado='" + nombreAfiliado + '\'' +
                ", apellidoAfiliado='" + apellidoAfiliado + '\'' +
                ", cedulaAfiliado='" + cedulaAfiliado + '\'' +
                ", servicioMedico='" + servicioMedico + '\'' +
                ", nombreMedico='" + nombreMedico + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", hora=" + hora +
                ", consultorioLaboratorio='" + consultorioLaboratorio + '\'' +
                '}';
    }
}
