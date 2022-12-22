package Modelo;

import Vista.Consultorios;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

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
            String fileName = "src/ArchivosTexto/consultorios.txt";
            try (BufferedWriter bf = Files.newBufferedWriter(Path.of(fileName),
                    StandardOpenOption.TRUNCATE_EXISTING)) {
                try{int fila = consul.tabla.getRowCount();
                    for (int i = 0; fila >0; i++) {

                        consul.Modelo.removeRow(0);
                    }}catch (Exception e){
                    JOptionPane.showMessageDialog(null, "se elimino por completo.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public void  Actualizar(){

        int fila = consul.tabla.getRowCount();
        for (int i = fila; i < consul.tabla.getRowCount(); i++) {
            consul.tabla.setValueAt(infoafi2[i],fila,i);
        }

    }

    public void Guardar() {
        try {

            // File archivo;
            FileWriter Guardar = new FileWriter("src/ArchivosTexto/consultorios.txt",true);
            BufferedWriter bfw = new BufferedWriter(Guardar);
            PrintWriter out= new PrintWriter(bfw);
            for (int i = 0; i < consul.Modelo.getRowCount(); i++) {
                Guardar.write(consul.Modelo.getValueAt(i, 0).toString()+";" + "\n");
                Guardar.write(consul.Modelo.getValueAt(i, 1).toString()+";" + "\n");
            }
            Guardar.close();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }

    public void Recuperar() {


        String auxiliar = "src/ArchivosTexto/consultorios.txt";


        Scanner linea;
        File doc = new File(auxiliar);

        try {
            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                numeroConsultorio = linea.nextLine();
                HoraDisponibilidad = linea.nextLine();
                consul.Modelo.addRow(new Object[]{numeroConsultorio,HoraDisponibilidad});
                //afi.Modelo.addRow(new Object[]{"",""});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }
    public void Recuperar2() {



        String auxiliar = "src/ArchivosTexto/copiaconsul.txt";

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
                        numeroConsultorio = linea.nextLine();
                        HoraDisponibilidad = linea.nextLine();
                        consul.Modelo.addRow(new Object[]{numeroConsultorio,HoraDisponibilidad});
                        //afi.Modelo.addRow(new Object[]{"",""});
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error");
                }


            }
        } catch (IOException e) {
            e.printStackTrace();}

    }

    public void HacerSoporte(){
        String auxiliar = "src/ArchivosTexto/consultorios.txt";
        File doc = new File(auxiliar);

        try {
            BufferedReader br = new BufferedReader(new FileReader(doc));
            if(br.readLine()==null){
                JOptionPane.showMessageDialog(null, "No se pueden recuperar los datos porque no se han guardado previmente en consultorios.txt\n" +
                        "Por favor ingrese los datos en los campos solicitados\n.Oprima agregar,de clic  sobre la fila,oprima actualizar  y finalmente oprima el boton Guardar");
            }else  {
                try {

                    Path fuentecita = Paths.get("src/ArchivosTexto/consultorios.txt");
                    Path destino = Paths.get("src/ArchivosTexto/copiaconsul.txt");

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
