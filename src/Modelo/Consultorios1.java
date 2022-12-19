package Modelo;

import Vista.Consultorios;

import javax.swing.*;

public class Consultorios1 {
    private String numeroConsultorio;
    private String HoraDisponibilidad;

    private Consultorios consul;
    private  String[] infoafi2;

    public Consultorios1(String numeroConsultorio,String horaDisponibilidad,Consultorios consul) {
        this.numeroConsultorio = numeroConsultorio;
        this.HoraDisponibilidad = horaDisponibilidad;
        this.consul= consul;
    }

    public void Agregar() {
        try {
            infoafi2 = new String[3];
            infoafi2[0] = setNumeroConsultorio(consul.nombreuno.getText());
            infoafi2[1] = setHoraDisponibilidad(consul.horaDisponivilidaduno.getText());

            consul.Modelo.addRow(infoafi2);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }


    public void Eliminar() {
        int fila = consul.tabla.getSelectedRow();
        if (fila >= 0) {
            consul.Modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {

        int fila = consul.tabla.getRowCount();
        for (int i = fila - 1; i > 0; i--) {

            consul.Modelo.removeRow(i);
        }
    }

    public void  Actualizar(){

        int fila = consul.tabla.getRowCount();
        for (int i = fila; i < consul.tabla.getRowCount(); i++) {
            consul.tabla.setValueAt(infoafi2[i],fila,i);
        }

    }


    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
        return numeroConsultorio;
    }

    public String getHoraDisponibilidad() {
        return HoraDisponibilidad;
    }

    public String setHoraDisponibilidad(String horaDisponibilidad) {
        HoraDisponibilidad = horaDisponibilidad;
        return horaDisponibilidad;
    }

    @Override
    public String toString() {
        return "Consultorios{" +
                "numeroConsultorio='" + numeroConsultorio + '\'' +
                ", HoraDisponibilidad=" + HoraDisponibilidad +
                '}';
    }

    public void Buscar() {
        String dato= consul.buscar3.getText();
        if(dato.isEmpty()){
            consul.tabla.clearSelection();
        }else{
            for (int i = 0; i < consul.tabla.getRowCount(); i++) {
                if(consul.tabla.getValueAt(i,0).equals(dato)){
                    // afi.tabla.requestFocus();
                    consul.tabla.changeSelection(i,0,false,false);
                    consul.Modelo.isCellEditable(i,0);
                }
            }
        }
    }
}
