package Modelo;

import Vista.Servicios;

import javax.swing.*;

public class Servicios1 {
    private String  NombreServicio;

    private String  IddServicio;

    private Servicios serv;
    private  String[] infoafi4 ;

    public Servicios1(String nombreServicio,String  IddServicio, Servicios serv) {
        this.NombreServicio = nombreServicio;
        this.IddServicio = IddServicio;
        this.serv=serv;
    }
    public void Agregar() {
        try {
            infoafi4 = new String[4];
            infoafi4[0] = setNombreServicio(serv.nombreServicio.getText());
            infoafi4[1] = setIddServicio(serv.Idservicio.getText());

            serv.Modelo.addRow(infoafi4);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }


    public void Eliminar() {
        int fila = serv.tabla.getSelectedRow();
        if (fila >= 0) {
            serv.Modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {

        int fila = serv.tabla.getRowCount();
        for (int i = fila - 1; i > 0; i--) {

            serv.Modelo.removeRow(i);
        }
    }

    public void  Actualizar(){

        int fila = serv.tabla.getRowCount();
        for (int i = fila; i < serv.tabla.getRowCount(); i++) {
            serv.tabla.setValueAt(infoafi4[i],fila,i);
        }

    }




    public String getNombreServicio() {
        return NombreServicio;
    }

    public String setNombreServicio(String nombreServicio) {
        NombreServicio = nombreServicio;
        return nombreServicio;
    }

    public String getIddServicio() {
        return IddServicio;
    }

    public String setIddServicio(String iddServicio) {
        IddServicio = iddServicio;
        return iddServicio;
    }

    @Override
    public String toString() {
        return "Servicios{" +
                "NombreServicio='" + NombreServicio + '\'' +
                ", IddServicio='" + IddServicio + '\'' +
                '}';
    }

    public void Buscar() {
        String dato= serv.buscar3.getText();
        if(dato.isEmpty()){
            serv.tabla.clearSelection();
        }else{
            for (int i = 0; i < serv.tabla.getRowCount(); i++) {
                if(serv.tabla.getValueAt(i,1).equals(dato)){
                    // afi.tabla.requestFocus();
                    serv.tabla.changeSelection(i,1,false,false);
                    serv.Modelo.isCellEditable(i,2);
                }
            }
        }
    }
}
