package Modelo;

import Vista.Afiliados;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public class Afiliados1 extends MouseAdapter {

    private String fechaIngreso;
    private String fechaSalida;
    private String hora;
    private String nombre;
    private String apellido;
    private String cedula;
    private String IdAfiliado;
    private Afiliados afi;
  private  String[] infoafi;


    public Afiliados1(String fechaIngreso, String fechaSalida, String hora, String nombre, String apellido, String cedula, String IdAfiliado, Afiliados afi) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.hora = hora;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.IdAfiliado = IdAfiliado;
        this.afi = afi;

    }
      public boolean Bandera(JTable tabla, String dato,int c){
        boolean Bandera = false;
        for (int i = 0 ; i > tabla.getRowCount(); i++){
            if(tabla.getValueAt(i,c).equals(dato)){
                Bandera = true;
            }
        }
        return Bandera;
      }

    public void registro2(JTable tabla, String dato,int c,String fechaIngreso, String fechaSalida, String hora, String nombre, String apellido, String cedula, String IdAfiliado){
       if(!Bandera(tabla,dato,c)){
           Object struct []= {fechaIngreso,fechaSalida,hora,nombre,apellido,cedula, IdAfiliado};afi.Modelo.addRow(struct);
       }else{
           JOptionPane.showMessageDialog(null, "Id  Existe");
       }
    }
    public void Agregar() {



        try {

            infoafi = new String[7];
            infoafi[0] = setNombre(afi.nombre0.getText());
            infoafi[1] = setApellido(afi.apellido0.getText());
            infoafi[2] = setCedula(afi.cedula0.getText());
            infoafi[3] = setFechaIngreso(afi.fechaIngreso0.getDate().toString());
            infoafi[4] = setFechaSalida(afi.fechaSalida0.getDate().toString());
            infoafi[5] = setHora(afi.hpra0.getText());
            infoafi[6] = setIdAfiliado(afi.idAfiliado0.getText());
            afi.Modelo.addRow(infoafi);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }


    public void Eliminar() {
        int fila = afi.tabla.getSelectedRow();
        if (fila >= 0) {
            afi.Modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {

        int fila = afi.tabla.getRowCount();
        for (int i = fila - 1; i > 0; i--) {

            afi.Modelo.removeRow(i);
        }
    }

    public void  Actualizar(){

        int fila = afi.tabla.getRowCount();
        for (int i = fila; i < afi.tabla.getRowCount(); i++) {
            afi.tabla.setValueAt(infoafi[i],fila,i);
        }

    }







    public String getIdAfiliado() {
        return IdAfiliado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getHora() {
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

    public String setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return fechaIngreso;
    }

    public String setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
        return fechaSalida;
    }

    public String setHora(String hora) {
        this.hora = hora;
        return hora;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String setApellido(String apellido) {
        this.apellido = apellido;
        return apellido;
    }

    public String setCedula(String cedula) {
        this.cedula = cedula;
        return cedula;
    }

    public String setIdAfiliado(String idAfiliado) {
        IdAfiliado = idAfiliado;
        return idAfiliado;
    }

    @Override
    public String toString() {
        return "Afiliados1{" +
                "fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", hora='" + hora + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", IdAfiliado='" + IdAfiliado + '\'' +
                ", afi=" + afi +
                '}';
    }
}

