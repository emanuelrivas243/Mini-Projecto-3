package Modelo;

import Vista.Afiliados;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Afiliados1 /*extends MouseAdapter*/ {

    private String fechaIngreso;
    private String fechaSalida;
    private String hora;
    private String nombre;
    private String apellido;
    private String cedula;
    private String IdAfiliado;
    private Afiliados afi;
    private String[] infoafi;


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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos,y editelos si es necesario,en los Campos llenados anteriormente.");

        }

    }

    public void LimpiarTabla(){
        try {

            infoafi = new String[7];
            infoafi[0] = setNombre("");
            infoafi[1] = setApellido("");
            infoafi[2] = setCedula("");
            infoafi[3] = setFechaIngreso("");
            infoafi[4] = setFechaSalida("");
            infoafi[5] = setHora("");
            infoafi[6] = setIdAfiliado("");
            afi.Modelo.addRow(infoafi);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "tabla Limpia");

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
        String fileName = "src/ArchivosTexto/afiliados.txt";
try (BufferedWriter bf = Files.newBufferedWriter(Path.of(fileName),
                StandardOpenOption.TRUNCATE_EXISTING)) {
    try{int fila = afi.tabla.getRowCount();
        for (int i = 0; fila >0; i++) {

            afi.Modelo.removeRow(0);
        }}catch (Exception e){
        JOptionPane.showMessageDialog(null, "se elimino por completo.");
    }

} catch (IOException e) {
e.printStackTrace();
}
    }

    public void Actualizar() {

        int fila = afi.tabla.getRowCount();
        for (int i =fila; i < afi.tabla.getRowCount(); i++) {
            afi.tabla.setValueAt(infoafi[i], fila, i);

        }

    }

    public void Buscar() {
        String dato = afi.buscar1.getText();
        if (dato.isEmpty()) {
            afi.tabla.clearSelection();
        } else {
            for (int i = 0; i < afi.tabla.getRowCount(); i++) {

                if (afi.tabla.getValueAt(i, 2).equals(dato)) {
                    afi.tabla.changeSelection(i, 2, false, false);
                    afi.Modelo.isCellEditable(i, 2);
                }
            }
        }
    }


    public void Guardar() {
        try {

           // File archivo;
            FileWriter Guardar = new FileWriter("src/ArchivosTexto/afiliados.txt",true);
            BufferedWriter bfw = new BufferedWriter(Guardar);
            PrintWriter out= new PrintWriter(bfw);
                for (int i = 0; i < afi.Modelo.getRowCount(); i++) {
                    Guardar.write(afi.Modelo.getValueAt(i, 0).toString()+";" + "\n");
                    Guardar.write(afi.Modelo.getValueAt(i, 1).toString()+";" + "\n");

                    Guardar.write(afi.Modelo.getValueAt(i, 2).toString()+";" + "\n");

                    Guardar.write(afi.Modelo.getValueAt(i, 3).toString()+";" + "\n");

                    Guardar.write(afi.Modelo.getValueAt(i, 4).toString()+";" + "\n");

                    Guardar.write(afi.Modelo.getValueAt(i, 5).toString()+";" + "\n");

                    Guardar.write(afi.Modelo.getValueAt(i, 6).toString()+";" + "\n");


                }
                Guardar.close();
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


        }


    public void Recuperar() {
        String fechaIngreso, fechaSalida, hora, nombre, cedula, IdAfiliado, apellido;

        String auxiliar = "src/ArchivosTexto/afiliados.txt";


        Scanner linea;
        File doc = new File(auxiliar);

        try {
            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                nombre = linea.nextLine();
                apellido = linea.nextLine();
                cedula = linea.nextLine();
                fechaIngreso = linea.nextLine();
                fechaSalida = linea.nextLine();
                hora = linea.nextLine();
                IdAfiliado = linea.nextLine();
                afi.Modelo.addRow(new Object[]{nombre, apellido, cedula, fechaIngreso, fechaSalida, hora, IdAfiliado});
                //afi.Modelo.addRow(new Object[]{"",""});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
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

