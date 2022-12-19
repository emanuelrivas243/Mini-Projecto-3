package Modelo;


import Vista.Citas;

import javax.swing.*;

public class Citas1 {

    private String nombreAfiliado;
    private String apellidoAfiliado;
    private String cedulaAfiliado;
    private String  servicioMedico;
    private String  nombreMedico;
    private String fechaIngreso ;
    private String fechaSalida;
    private String hora;
    private String consultorioLaboratorio;
    private Citas cit;
    private  String[] infoafi1;

    public Citas1(String nombreAfiliado, String apellidoAfiliado, String cedulaAfiliado, String  servicioMedico,
                  String nombreMedico, String fechaIngreso , String fechaSalida, String hora, String consultorioLaboratorio,Citas cit)
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
        this.cit=cit;
    }
    public void Agregar() {
        try {
            infoafi1 = new String[10];
            infoafi1[0] = setNombreAfiliado(cit.nombreCinco.getText());
            infoafi1[1] =setApellidoAfiliado(cit.apellidoCinco.getText());
            infoafi1[2] = setCedulaAfiliado(cit.cedulaCinco.getText());
            infoafi1[3] = setServicioMedico(cit.servicionMedicoCinco.getText());
            infoafi1[4] = setNombreMedico(cit.nombreCinco.getText());
            infoafi1[5] = setFechaSalida(cit.fechaSalidaCinco.getDate().toString());
            infoafi1[6] = setFechaIngreso(cit.fechaIngresoCinco.getDate().toString());
            infoafi1[7] = setHora(cit.hpraCinco.getText());
            infoafi1[8] = setConsultorioLaboratorio(cit.consultaorioCinco.getText());
            cit.Modelo.addRow(infoafi1);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }


    public void Eliminar() {
        int fila = cit.tabla.getSelectedRow();
        if (fila >= 0) {
            cit.Modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {

        int fila = cit.tabla.getRowCount();
        for (int i = fila - 1; i > 0; i--) {

            cit.Modelo.removeRow(i);
        }
    }

    public void  Actualizar(){

        int fila = cit.tabla.getRowCount();
        for (int i = fila; i < cit.tabla.getRowCount(); i++) {
            cit.tabla.setValueAt(infoafi1[i],fila,i);
        }

    }


    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public String setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
        return nombreAfiliado;
    }

    public String getApellidoAfiliado() {
        return apellidoAfiliado;
    }

    public String setApellidoAfiliado(String apellidoAfiliado) {
        this.apellidoAfiliado = apellidoAfiliado;
        return apellidoAfiliado;
    }

    public String getCedulaAfiliado() {
        return cedulaAfiliado;
    }

    public String setCedulaAfiliado(String cedulaAfiliado) {
        this.cedulaAfiliado = cedulaAfiliado;
        return cedulaAfiliado;
    }

    public String getServicioMedico() {
        return servicioMedico;
    }

    public String setServicioMedico(String servicioMedico) {
        this.servicioMedico = servicioMedico;
        return servicioMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public String setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
        return nombreMedico;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
        return fechaSalida;
    }

    public String getHora() {
        return hora;
    }

    public String setHora(String hora) {
        this.hora = hora;
        return hora;
    }

    public String getConsultorioLaboratorio() {
        return consultorioLaboratorio;
    }

    public String setConsultorioLaboratorio(String consultorioLaboratorio) {
        this.consultorioLaboratorio = consultorioLaboratorio;
        return consultorioLaboratorio;
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
