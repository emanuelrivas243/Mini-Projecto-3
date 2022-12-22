package Modelo;


import Vista.Citas;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

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
            infoafi1[4] = setNombreMedico(cit.medicoCinco.getText());
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
            JOptionPane.showMessageDialog(null, "Se Eliminaron los datos de la tabla ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecionarfilas");

        }

    }

    public void EliminarTodo() {
        String fileName = "src/ArchivosTexto/citas.txt";
        try (BufferedWriter bf = Files.newBufferedWriter(Path.of(fileName),
                StandardOpenOption.TRUNCATE_EXISTING)) {
            try{int fila = cit.tabla.getRowCount();
                for (int i = 0; fila >0; i++) {

                    cit.Modelo.removeRow(0);
                }}catch (Exception e){
                JOptionPane.showMessageDialog(null, "se elimino por completo .");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Guardar() {
        try {

            // File archivo;
            FileWriter Guardar = new FileWriter("src/ArchivosTexto/citas.txt",true);
            BufferedWriter bfw = new BufferedWriter(Guardar);
            PrintWriter out= new PrintWriter(bfw);
            for (int i = 0; i < cit.Modelo.getRowCount(); i++) {
                Guardar.write(cit.Modelo.getValueAt(i, 0).toString()+";" + "\n");
                Guardar.write(cit.Modelo.getValueAt(i, 1).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 2).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 3).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 4).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 5).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 6).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 7).toString()+";" + "\n");

                Guardar.write(cit.Modelo.getValueAt(i, 8).toString()+";" + "\n");
            }
            Guardar.close();
            JOptionPane.showMessageDialog(null, "Datos Guardados correcamente");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }



    public void  Actualizar(){

        int fila = cit.tabla.getRowCount();
        for (int i = fila; i < cit.tabla.getRowCount(); i++) {
            cit.tabla.setValueAt(infoafi1[i],fila,i);
        }

    }

    public void Recuperar() {

        String nombreAfiliado, apellidoAfiliado, cedulaAfiliado,fechaIngreso ,servicioMedico, nombreMedico,  hora, consultorioLaboratorio,fechaSalida;

        String auxiliar = "src/ArchivosTexto/citas.txt";



        Scanner linea;
        File doc = new File(auxiliar);

        try {
            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                nombreAfiliado = linea.nextLine();
                apellidoAfiliado = linea.nextLine();
                cedulaAfiliado = linea.nextLine();
                servicioMedico = linea.nextLine();
                nombreMedico = linea.nextLine();
                fechaIngreso = linea.nextLine();
                fechaSalida = linea.nextLine();
                hora= linea.nextLine();
                consultorioLaboratorio= linea.nextLine();
                cit.Modelo.addRow(new Object[]{nombreAfiliado, apellidoAfiliado ,cedulaAfiliado, servicioMedico, nombreMedico, fechaSalida ,fechaIngreso,hora, consultorioLaboratorio});
                //afi.Modelo.addRow(new Object[]{"",""});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }




    }

    public void Recuperar2() {

        String nombreAfiliado, apellidoAfiliado, cedulaAfiliado,fechaIngreso ,servicioMedico, nombreMedico,  hora, consultorioLaboratorio,fechaSalida;

        String auxiliar = "src/ArchivosTexto/copiacit.txt";

            File doc = new File(auxiliar);
            try {
                BufferedReader bM = new BufferedReader(new FileReader(doc));
                if(bM.readLine()==null){
                    JOptionPane.showMessageDialog(null, "No Hay soporte");
                }else  {
                  Scanner linea;

        try {
            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                nombreAfiliado = linea.nextLine();
                apellidoAfiliado = linea.nextLine();
                cedulaAfiliado = linea.nextLine();
                servicioMedico = linea.nextLine();
                nombreMedico = linea.nextLine();
                fechaIngreso = linea.nextLine();
                fechaSalida = linea.nextLine();
                hora= linea.nextLine();
                consultorioLaboratorio= linea.nextLine();
                cit.Modelo.addRow(new Object[]{nombreAfiliado, apellidoAfiliado ,cedulaAfiliado, servicioMedico, nombreMedico, fechaSalida ,fechaIngreso,hora, consultorioLaboratorio});
                //afi.Modelo.addRow(new Object[]{"",""});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Hay soporte");
        }

            }
            } catch (IOException e) {
                e.printStackTrace();}

    }

    public void HacerSoporte(){
        String auxiliar = "src/ArchivosTexto/citas.txt";
        File doc = new File(auxiliar);

        try {
            BufferedReader br = new BufferedReader(new FileReader(doc));
            if(br.readLine()==null){
                JOptionPane.showMessageDialog(null, "No se pueden recuperar los datos porque no se han guardado previmente en citas.txt\n" +
                        "Por favor ingrese los datos en los campos solicitados\n.Oprima agregar,de clic  sobre la fila,oprima actualizar  y finalmente oprima el boton Guardar");
            }else  {
                try {

                    Path fuentecita = Paths.get("src/ArchivosTexto/citas.txt");
                    Path destino = Paths.get("src/ArchivosTexto/copiacit.txt");

                    Files.copy(fuentecita, destino, StandardCopyOption.REPLACE_EXISTING);
                    JOptionPane.showMessageDialog(null, "Datos Guardados correcamente en un punto de recuperacion");
                } catch (IOException e) {
                    System.out.println("Error");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Buscar() {
        String dato = cit.buscar.getText();
        if (dato.isEmpty()) {
            cit.tabla.clearSelection();
        } else {
            for (int i = 0; i < cit.tabla.getRowCount(); i++) {

                if (cit.tabla.getValueAt(i, 2).equals(dato)) {
                    cit.tabla.changeSelection(i, 2, false, false);
                    cit.Modelo.isCellEditable(i, 2);
                }
            }
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




