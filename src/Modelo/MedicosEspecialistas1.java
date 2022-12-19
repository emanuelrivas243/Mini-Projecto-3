
package Modelo;

import Vista.MedicosEspecialistas;

import javax.swing.*;

public class MedicosEspecialistas1 {

    private String  NombreEspecialista;

    private String ApellidoMedícooEspecialista;

    private String CedulaMedícooEspecialista;

    private String IddelServicio ;

    private String IDMedico ;


    private MedicosEspecialistas med;
    private  String[] infoafi3 ;

    public MedicosEspecialistas1(String nombreEspecialista,String ApellidoMedícooEspecialista,
                                String CedulaMedícooEspecialista, String IddelServicio,String IDMedico,MedicosEspecialistas med) {
        this.NombreEspecialista = nombreEspecialista;
        this.ApellidoMedícooEspecialista=ApellidoMedícooEspecialista;
        this.CedulaMedícooEspecialista=CedulaMedícooEspecialista;
        this.IddelServicio=IddelServicio;
        this.IDMedico=IDMedico;
        this.med= med;
    }

    public void Agregar() {
        try {
            infoafi3 = new String[7];
            infoafi3[0] = setNombreEspecialista(med.nombretres.getText());
            infoafi3[1] = setApellidoMedícooEspecialista(med.apellidotres.getText());
            infoafi3[2] = setCedulaMedícooEspecialista(med.cedulatres.getText());
            infoafi3[3] = setIddelServicio(med.servicionMedicotres.getText());
            infoafi3[4] = setIDMedico(med.medicotres.getText());
            med.Modelo.addRow(infoafi3);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }


    public void Eliminar() {
        int fila = med.tabla.getSelectedRow();
        if (fila >= 0) {
            med.Modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {

        int fila = med.tabla.getRowCount();
        for (int i = fila - 1; i > 0; i--) {

            med.Modelo.removeRow(i);
        }
    }

    public void  Actualizar(){

        int fila = med.tabla.getRowCount();
        for (int i = fila; i < med.tabla.getRowCount(); i++) {
            med.tabla.setValueAt(infoafi3[i],fila,i);
        }

    }


    public String getNombreEspecialista() {
        return NombreEspecialista;
    }

    public String setNombreEspecialista(String nombreEspecialista) {
        NombreEspecialista = nombreEspecialista;
        return nombreEspecialista;
    }

    public String getApellidoMedícooEspecialista() {
        return ApellidoMedícooEspecialista;
    }

    public String getCedulaMedícooEspecialista() {
        return CedulaMedícooEspecialista;
    }

    public String setCedulaMedícooEspecialista(String cedulaMedícooEspecialista) {
        CedulaMedícooEspecialista = cedulaMedícooEspecialista;
        return cedulaMedícooEspecialista;
    }

    public String setApellidoMedícooEspecialista(String apellidoMedícooEspecialista) {
        ApellidoMedícooEspecialista = apellidoMedícooEspecialista;
        return apellidoMedícooEspecialista;
    }

    public String getIddelServicio() {
        return IddelServicio;
    }

    public String setIddelServicio(String iddelServicio) {
        IddelServicio = iddelServicio;
        return iddelServicio;
    }

    public String getIDMedico() {
        return IDMedico;
    }

    public String setIDMedico(String IDMedico) {
        this.IDMedico = IDMedico;
        return IDMedico;
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

    public void Buscar() {
        String dato= med.buscar4.getText();
        if(dato.isEmpty()){
            med.tabla.clearSelection();
        }else{
            for (int i = 0; i < med.tabla.getRowCount(); i++) {
                if(med.tabla.getValueAt(i,2).equals(dato)){
                    // afi.tabla.requestFocus();
                    med.tabla.changeSelection(i,2,false,false);
                    med.Modelo.isCellEditable(i,2);
                }
            }
        }
    }
}