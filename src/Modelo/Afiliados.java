package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Afiliados {

    private LocalDate fechaIngreso ;
    private LocalDate fechaSalida;
    private LocalTime hora;
    private String nombre;
    private String apellido;
    private String cedula;
    private String  IdAfiliado;

    public Afiliados(LocalDate fechaIngreso,LocalDate fechaSalida,LocalTime hora,String nombre, String apellido,String cedula,String  IdAfiliado) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.hora= hora;
        this.nombre=  nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.IdAfiliado= IdAfiliado;

    }

    public String getIdAfiliado() {
        return IdAfiliado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setIdAfiliado(String idAfiliado) {
        IdAfiliado = idAfiliado;
    }

    @Override
    public String toString() {
        return "Afiliados{" +
                "fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", hora=" + hora +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", IdAfiliado='" + IdAfiliado + '\'' +
                '}';
    }
}
