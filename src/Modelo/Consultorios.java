package Modelo;

import java.time.LocalTime;

public class Consultorios {
    private String numeroConsultorio;
    private LocalTime HoraDisponibilidad;

    public Consultorios(String numeroConsultorio,LocalTime horaDisponibilidad) {
        this.numeroConsultorio = numeroConsultorio;
        this.HoraDisponibilidad = horaDisponibilidad;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public LocalTime getHoraDisponibilidad() {
        return HoraDisponibilidad;
    }

    public void setHoraDisponibilidad(LocalTime horaDisponibilidad) {
        HoraDisponibilidad = horaDisponibilidad;
    }

    @Override
    public String toString() {
        return "Consultorios{" +
                "numeroConsultorio='" + numeroConsultorio + '\'' +
                ", HoraDisponibilidad=" + HoraDisponibilidad +
                '}';
    }
}
