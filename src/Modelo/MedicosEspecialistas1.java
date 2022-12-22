
package Modelo;

import Vista.MedicosEspecialistas;

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

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
        String fileName = "src/ArchivosTexto/medicosespecialistas.txt";
        try (BufferedWriter bf = Files.newBufferedWriter(Path.of(fileName),
                StandardOpenOption.TRUNCATE_EXISTING)) {
            try{int fila = med.tabla.getRowCount();
                for (int i = 0; fila >0; i++) {

                    med.Modelo.removeRow(0);
                }}catch (Exception e){
                JOptionPane.showMessageDialog(null, "se elimino por completo.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void  Actualizar(){

        int fila = med.tabla.getRowCount();
        for (int i = fila; i < med.tabla.getRowCount(); i++) {
            med.tabla.setValueAt(infoafi3[i],fila,i);
        }

    }

    public void Guardar() {
        try {

            // File archivo;
            FileWriter Guardar = new FileWriter("src/ArchivosTexto/medicosespecialistas.txt",true);
            BufferedWriter bfw = new BufferedWriter(Guardar);
            PrintWriter out= new PrintWriter(bfw);
            for (int i = 0; i < med.Modelo.getRowCount(); i++) {
                Guardar.write(med.Modelo.getValueAt(i, 0).toString()+";" + "\n");
                Guardar.write(med.Modelo.getValueAt(i, 1).toString()+";" + "\n");

                Guardar.write(med.Modelo.getValueAt(i, 2).toString()+";" + "\n");

                Guardar.write(med.Modelo.getValueAt(i, 3).toString()+";" + "\n");

                Guardar.write(med.Modelo.getValueAt(i, 4).toString()+";" + "\n");



            }
            Guardar.close();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }

    public void Recuperar() {



        String auxiliar = "src/ArchivosTexto/medicosespecialistas.txt";


        Scanner linea;
        File doc = new File(auxiliar);

        try {
            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                NombreEspecialista = linea.nextLine();
                ApellidoMedícooEspecialista = linea.nextLine();
                CedulaMedícooEspecialista = linea.nextLine();
                IddelServicio = linea.nextLine();
                IDMedico= linea.nextLine();

                med.Modelo.addRow(new Object[]{NombreEspecialista, ApellidoMedícooEspecialista, CedulaMedícooEspecialista, IddelServicio, IDMedico});
                //afi.Modelo.addRow(new Object[]{"",""});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }
    public void Recuperar2() {



        String auxiliar = "src/ArchivosTexto/medicosespecialistas.txt";

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
                        NombreEspecialista = linea.nextLine();
                        ApellidoMedícooEspecialista = linea.nextLine();
                        CedulaMedícooEspecialista = linea.nextLine();
                        IddelServicio = linea.nextLine();
                        IDMedico= linea.nextLine();

                        med.Modelo.addRow(new Object[]{NombreEspecialista, ApellidoMedícooEspecialista, CedulaMedícooEspecialista, IddelServicio, IDMedico});
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
        String auxiliar = "src/ArchivosTexto/medicosespecialistas.txt";
        File doc = new File(auxiliar);

        try {
            BufferedReader br = new BufferedReader(new FileReader(doc));
            if(br.readLine()==null){
                JOptionPane.showMessageDialog(null, "No se pueden recuperar los datos porque no se han guardado previmente en medicosespecialistas.txt\n" +
                        "Por favor ingrese los datos en los campos solicitados\n.Oprima agregar,de clic  sobre la fila,oprima actualizar  y finalmente oprima el boton Guardar");
            }else  {
                try {

                    Path fuentecita = Paths.get("src/ArchivosTexto/medicosespecialistas.txt");
                    Path destino = Paths.get("src/ArchivosTexto/copiamed.txt");

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