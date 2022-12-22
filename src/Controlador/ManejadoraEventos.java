package Controlador;


import Modelo.*;
import Vista.*;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;


public class ManejadoraEventos  implements ActionListener, MouseListener, KeyListener, CaretListener {
    private Citas cit;
    private Principal view;
    private Afiliados afi;
    private Consultorios consul;
    private MedicosEspecialistas med;
    private Servicios serv;
    private Citas1 cit1;
    private Afiliados1 afi1;
    private Consultorios1 consul1;
    private MedicosEspecialistas1 med1;
    private Servicios1 serv1;

    public ManejadoraEventos(Principal view, Afiliados afi, Consultorios consul, MedicosEspecialistas med, Servicios serv, Citas cit, Afiliados1 afi1,
                             Citas1 cit1, Consultorios1 consul1, MedicosEspecialistas1 med1, Servicios1 serv1){
        //ESCUCHA FRAME PRINCIPAL
        this.view= view;
      this.view.afiliados.addActionListener(this);
      this.view.consultorios.addActionListener(this);
      this.view.serviciosSalud.addActionListener(this);
      this.view.medicosEspecialistas.addActionListener(this);
      this.view.citas.addActionListener(this);
      //ESCUCHA FRAME AFILIADOS
      this.afi= afi;
      this.afi.actulizar1.addMouseListener(this);
      this.afi.agregar1.addActionListener(this);
      this.afi.listar1.addActionListener(this);
      this.afi.eliminar1.addActionListener(this);
      this.afi.eliminar11.addActionListener(this);
      this.afi.guardar1.addActionListener(this);
      this.afi.atras1.addActionListener(this);
      this.afi.nombre0.addKeyListener(this);
      this.afi.apellido0.addKeyListener(this);
      this.afi.cedula0.addKeyListener(this);
      this.afi.hpra0.addKeyListener(this);
      this.afi.idAfiliado0.addKeyListener(this);
      this.afi.buscar1.addCaretListener(this);
      this.afi.salir.addActionListener(this);
      this.afi.mostrar.addActionListener(this);
      this.afi.recuperar.addActionListener(this);
      //ESCCHA FRAME CONSLTORIOS
        this.consul= consul;
        this.consul.actulizar2.addMouseListener(this);
        this.consul.agregar2.addActionListener(this);
        this.consul.listar2.addActionListener(this);
        this.consul.eliminar2.addActionListener(this);
        this.consul.eliminar22.addActionListener(this);
        this.consul.guardar2.addActionListener(this);
        this.consul.atras2.addActionListener(this);
        this.consul.nombreuno.addKeyListener(this);
        this.consul.horaDisponivilidaduno.addKeyListener(this);
        this.consul.buscar3.addCaretListener(this);
        this.consul.salir.addActionListener(this);
        this.consul.mostrar.addActionListener(this);
        this.consul.recuperar.addActionListener(this);
        //ESCCHA FRAME MEDICOS ESPECIALISTAS
      this.med= med;
        this.med.actulizar3.addMouseListener(this);
        this.med.agregar3.addActionListener(this);
        this.med.listar3.addActionListener(this);
        this.med.eliminar3.addActionListener(this);
        this.med.eliminar33.addActionListener(this);
        this.med.guardar3.addActionListener(this);
        this.med.atras3.addActionListener(this);
        this.med.nombretres.addKeyListener(this);
        this.med.apellidotres.addKeyListener(this);
        this.med.cedulatres.addKeyListener(this);
        this.med.servicionMedicotres.addKeyListener(this);
        this.med.medicotres.addKeyListener(this);
        this.med.buscar4.addCaretListener(this);
        this.med.salir.addActionListener(this);
        this.med.mostrar.addActionListener(this);
        this.med.recuperar.addActionListener(this);
        //ESCUCHA FRAME SERVICIOS
      this.serv= serv;
        this.serv.actulizar4.addMouseListener(this);
        this.serv.agregar4.addActionListener(this);
        this.serv.listar4.addActionListener(this);
        this.serv.eliminar4.addActionListener(this);
        this.serv.eliminar44.addActionListener(this);
        this.serv.guardar4.addActionListener(this);
        this.serv.atras4.addActionListener(this);
        this.serv.nombreServicio.addKeyListener(this);
        this.serv.Idservicio.addKeyListener(this);
        this.serv.buscar3.addCaretListener(this);
        this.serv.salir.addActionListener(this);
        this.serv.mostrar.addActionListener(this);
        this.serv.recuperar.addActionListener(this);
        //ESCUCHAS FRAME CITAS
        this.cit= cit;
        this.cit.actulizar5.addMouseListener(this);
        this.cit.agregar5.addActionListener(this);
        this.cit.listar5.addActionListener(this);
        this.cit.eliminar5.addActionListener(this);
        this.cit.eliminar55.addActionListener(this);
        this.cit.guardar5.addActionListener(this);
        this.cit.atras5.addActionListener(this);
        this.cit.afiliado.addActionListener(this);
        this.cit.especialista.addActionListener(this);
        this.cit.servicios.addActionListener(this);
        this.cit.consultorio.addActionListener(this);
        this.cit.nombreCinco.addKeyListener(this);
        this.cit.apellidoCinco.addKeyListener(this);
        this.cit.cedulaCinco.addKeyListener(this);
        this.cit.servicionMedicoCinco.addKeyListener(this);
        this.cit.medicoCinco.addKeyListener(this);
        this.cit.hpraCinco.addKeyListener(this);
        this.cit.consultaorioCinco.addKeyListener(this);
        this.cit.salir.addActionListener(this);
        this.cit.buscar.addCaretListener(this);
        this.cit.recuperar.addActionListener(this);
        this.cit.mostrar.addActionListener(this);

        this.afi1= afi1;
        this.consul1=consul1;
        this.cit1=cit1;
        this.serv1=serv1;
        this.med1=med1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       ///////EVENTOS MOVIMIENTOS ENTRE FRAMES
        if (e.getSource().equals(view.afiliados)) {
            view.setVisible(false);
            afi.setVisible(true);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        if (e.getSource().equals(view.citas)) {
            view.setVisible(false);
            afi.setVisible(false);
            consul.setVisible(false);
            cit.setVisible(true);
            med.setVisible(false);
            serv.setVisible(false);
        }

        else if (e.getSource().equals(view.medicosEspecialistas)) {
            view.setVisible(false);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(true);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        else  if (e.getSource().equals(view.serviciosSalud)) {
            view.setVisible(false);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(true);
            cit.setVisible(false);
        }

        else if (e.getSource().equals(view.consultorios)) {
            view.setVisible(false);
            afi.setVisible(false);
            consul.setVisible(true);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        else if (e.getSource().equals(afi.atras1)) {
            view.setVisible(true);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        else if (e.getSource().equals(consul.atras2)) {
            view.setVisible(true);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        else if (e.getSource().equals(med.atras3)) {
            view.setVisible(true);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }
        else if (e.getSource().equals(serv.atras4)) {
            view.setVisible(true);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }

        else if (e.getSource().equals(cit.atras5)) {
            view.setVisible(true);
            afi.setVisible(false);
            consul.setVisible(false);
            med.setVisible(false);
            serv.setVisible(false);
            cit.setVisible(false);
        }

        else if (e.getSource().equals(cit.afiliado)) {
            afi.setVisible(true);
        }
        else if (e.getSource().equals(cit.servicios)) {
            serv.setVisible(true);
        }
        else if (e.getSource().equals(cit.consultorio)) {
            consul.setVisible(true);
        }
        else if (e.getSource().equals(cit.especialista)) {
            med.setVisible(true);
        }
    ///////EVENTOS CRUD AFILIADOS  A EXEPCION DE ACTUALIZAR
       else if (e.getSource().equals(afi.agregar1)){
           try {
               if (afi.nombre0.getText().isEmpty() || afi.apellido0.getText().isEmpty() ||
                            afi.cedula0.getText().isEmpty() || afi.idAfiliado0.getText().isEmpty()
                            || afi.fechaSalida0.getDate().toString().isEmpty() || afi.fechaIngreso0.getDate().toString().isEmpty()
                    ) { if(!afi.nombre0.getText().isEmpty() && !afi.apellido0.getText().isEmpty() &&
                       !afi.cedula0.getText().isEmpty() && !afi.idAfiliado0.getText().isEmpty()
                       && !afi.fechaSalida0.getDate().toString().isEmpty() && !afi.fechaIngreso0.getDate().toString().isEmpty()){
                        afi.Modelo.addRow(new Object[]{"",""});}

                        JOptionPane.showMessageDialog(null, "llene los campus vacios");
                    } else {
                        afi1.Agregar();
                        JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                    }
                } catch (Exception E) {
                    JOptionPane.showMessageDialog(null, "llene los campos de fecha de Ingreso y fecha de salida");
                }
       }

       else if (e.getSource().equals(afi.eliminar1)){
           afi1.Eliminar();
       }

       else if (e.getSource().equals(afi.eliminar11)) {
            afi1.EliminarTodo();

       }
        else if(e.getSource().equals(afi.guardar1)){
            if(this.afi.Modelo.getRowCount()==0
            ){
                JOptionPane.showMessageDialog(null, "No se pueden  guardar los datos porque no se agregaron  a la tabla");
            }else {
                afi1.Guardar();
                try {
                    int fila = afi.tabla.getRowCount();
                    for (int i = 0; fila > 0; i++) {

                        afi.Modelo.removeRow(0);
                    }
                } catch (Exception E) {
                    System.out.println();
                }
            }
        }
        if(e.getSource().equals(afi.listar1)){

            afi1.Recuperar();
        }
        if(e.getSource().equals(afi.mostrar)){

            afi1.Recuperar2();
        }

        if (e.getSource().equals(afi.recuperar)) {
            afi1.HacerSoporte();
        }

        if(e.getSource().equals(afi.listar1)){
            afi.agregar1.setEnabled(false);
            afi.guardar1.setEnabled(false);
        }

        if (e.getSource().equals(afi.salir)) {
            afi.dispose();
        }


        ////////EVENTOS CRUD CONSULTORIOS A EXEPCION DE ACTUALIZAR
        else if (e.getSource().equals(consul.agregar2)){
            try{
                if(consul.nombreuno.getText().isEmpty()||consul.horaDisponivilidaduno.getText().isEmpty()) {

                    if (!consul.nombreuno.getText().isEmpty()&&!consul.horaDisponivilidaduno.getText().isEmpty()) {
                        consul.Modelo.addRow(new Object[]{"", ""});
                    }
                    JOptionPane.showMessageDialog(null, "llene los campus vacios");
                }else{
                    consul1.Agregar();
                    JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                }
            }catch (Exception E){

            }
        }

        else if (e.getSource().equals(consul.eliminar2)){
            consul1.Eliminar();
        }

        else if (e.getSource().equals(consul.eliminar22)) {
            consul1.EliminarTodo();
        }
        else if(e.getSource().equals(consul.guardar2)){
            if(this.consul.Modelo.getRowCount()==0
            ){
                JOptionPane.showMessageDialog(null, "No se pueden  guardar los datos porque no se agregaron  a la tabla");
            }else {
                consul1.Guardar();
                try {
                    int fila = consul.tabla.getRowCount();
                    for (int i = 0; fila > 0; i++) {

                        consul.Modelo.removeRow(0);
                    }
                } catch (Exception E) {
                    System.out.println();
                }
            }
        }
        if(e.getSource().equals(consul.listar2)){

            consul1.Recuperar();


        }
        if(e.getSource().equals(consul.mostrar)){

            consul1.Recuperar2();
        }

        if (e.getSource().equals(consul.recuperar)) {
            consul1.HacerSoporte();
        }
        if(e.getSource().equals(consul.listar2)){

            consul.agregar2.setEnabled(false);
            consul.guardar2.setEnabled(false);

        }
        if (e.getSource().equals(consul.salir)) {
            consul.dispose();
        }

        ////////EVENTOS CRUD MEDICOS Y ESPECIALISTAS  A EXEPCION DE ACTUALIZAR

        else if (e.getSource().equals(med.agregar3)){
            try{
                if(med.nombretres.getText().isEmpty()|| med.apellidotres.getText().isEmpty()|| med.cedulatres.getText().isEmpty()||
                med.servicionMedicotres.getText().isEmpty()|| med.medicotres.getText().isEmpty()) {
                    if(!med.nombretres.getText().isEmpty()&& !med.apellidotres.getText().isEmpty()&& !med.cedulatres.getText().isEmpty()&&
                            !med.servicionMedicotres.getText().isEmpty()&& !med.medicotres.getText().isEmpty()){med.Modelo.addRow(new Object[]{"",""});}

                    JOptionPane.showMessageDialog(null, "llene los campus vacios");
                } else{
                    med1.Agregar();
                    JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                } }catch (Exception E){

            }
        }


        else if (e.getSource().equals(med.eliminar3)){
            med1.Eliminar();

        }

        else if (e.getSource().equals(med.eliminar33)) {
            med1.EliminarTodo();
        }
        else if(e.getSource().equals(med.guardar3)){
            if(this.med.Modelo.getRowCount()==0
            ){
                JOptionPane.showMessageDialog(null, "No se pueden  guardar los datos porque no se agregaron  a la tabla");
            }else {
                med1.Guardar();
                try {
                    int fila = med.tabla.getRowCount();
                    for (int i = 0; fila > 0; i++) {

                        med.Modelo.removeRow(0);
                    }
                } catch (Exception E) {
                    System.out.println();
                }
            }
        }
        if(e.getSource().equals(med.listar3)){
            med1.Recuperar();
        }
        if(e.getSource().equals(med.mostrar)){

            med1.Recuperar2();
        }

        if (e.getSource().equals(med.recuperar)) {
            med1.HacerSoporte();
        }

        if(e.getSource().equals(med.listar3)){
            med.agregar3.setEnabled(false);
            med.guardar3.setEnabled(false);
        }

        if (e.getSource().equals(med.salir)) {
            med.dispose();
        }

        ////////EVENTOS CRUD SERVCIOS MEDICOS  A EXEPCION DE ACTUALIZAR

        else if (e.getSource().equals(serv.agregar4)){

            try{
                if(serv.nombreServicio.getText().isEmpty()||serv.Idservicio.getText().isEmpty()
                ) {
                    if(!serv.nombreServicio.getText().isEmpty()||!serv.Idservicio.getText().isEmpty()){
                    serv.Modelo.addRow(new Object[]{"",""});}
                    JOptionPane.showMessageDialog(null, "llene los campus vacios");
                } else{

                    serv1.Agregar();
                    JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                } }catch (Exception E){
                JOptionPane.showMessageDialog(null, "llene los campos de fecha de Ingreso y fecha de salida");
            }
        }

        else if (e.getSource().equals(serv.eliminar4)){
            serv1.Eliminar();
        }

        else if (e.getSource().equals(serv.eliminar44)) {
            serv1.EliminarTodo();
        }
        else if(e.getSource().equals(serv.guardar4)){
            if(this.serv.Modelo.getRowCount()==0
            ){
                JOptionPane.showMessageDialog(null, "No se pueden  guardar los datos porque no se agregaron  a la tabla");
            }else {
                serv1.Guardar();
                try {
                    int fila = serv.tabla.getRowCount();
                    for (int i = 0; fila > 0; i++) {

                        serv.Modelo.removeRow(0);
                    }
                } catch (Exception E) {
                    System.out.println();
                }
            }
        }
        if(e.getSource().equals(serv.listar4)){

            serv1.Recuperar();


        }
        if(e.getSource().equals(serv.mostrar)){

            serv1.Recuperar2();
        }

        if (e.getSource().equals(serv.recuperar)) {
            serv1.HacerSoporte();
        }
        if(e.getSource().equals(serv.listar4)){

            serv.agregar4.setEnabled(false);
            serv.guardar4.setEnabled(false);

        }
        if (e.getSource().equals(serv.salir)) {
            serv.dispose();
        }

        //////EVENTOS CRUD CITAS  A EXEPCION DE ACTUALIZAR
        else if (e.getSource().equals(cit.agregar5)){

            try{

                if(cit.nombreCinco.getText().isEmpty()||cit.apellidoCinco.getText().isEmpty()
                        ||cit.cedulaCinco.getText().isEmpty()||cit.servicionMedicoCinco.getText().isEmpty()
                        ||cit.medicoCinco.getText().isEmpty()||cit.fechaSalidaCinco.getDate().toString().isEmpty()
                        ||cit.fechaIngresoCinco.getDate().toString().isEmpty()||cit.hpraCinco.getText().isEmpty()
                        ||cit.consultaorioCinco.getText().isEmpty()
                ) {
                    if(!cit.nombreCinco.getText().isEmpty()&&!cit.apellidoCinco.getText().isEmpty()
                            &&!cit.cedulaCinco.getText().isEmpty()&&!cit.servicionMedicoCinco.getText().isEmpty()
                            &&!cit.medicoCinco.getText().isEmpty()&&!cit.fechaSalidaCinco.getDate().toString().isEmpty()
                            &&!cit.fechaIngresoCinco.getDate().toString().isEmpty()&&!cit.hpraCinco.getText().isEmpty()
                            &&!cit.consultaorioCinco.getText().isEmpty()
                    ){cit.Modelo.addRow(new Object[]{"",""});}

                    JOptionPane.showMessageDialog(null, "llene los campus vacios");

                } else{

                    cit1.Agregar();
                    JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                } }catch (Exception E){
                JOptionPane.showMessageDialog(null, "llene los campos de fecha de Ingreso y fecha de salida");
            }
        }

        else if (e.getSource().equals(cit.eliminar5)){
            cit1.Eliminar();
        }

        else if (e.getSource().equals(cit.eliminar55)) {
            cit1.EliminarTodo();
        }
        else if(e.getSource().equals(cit.guardar5)){
            if(this.cit.Modelo.getRowCount()==0
            ){
                JOptionPane.showMessageDialog(null, "No se pueden  guardar los datos porque no se agregaron  a la tabla");
            }else{

            cit1.Guardar();
            try{int fila = cit.tabla.getRowCount();
                for (int i = 0; fila >0; i++) {

                    cit.Modelo.removeRow(0);
                }}catch (Exception E){
                System.out.println();
            }}
        }
        if(e.getSource().equals(cit.listar5)){

            cit1.Recuperar();
        }
        if(e.getSource().equals(cit.mostrar)){

            cit1.Recuperar2();
        }

        if (e.getSource().equals(cit.recuperar)) {
            cit1.HacerSoporte();
        }

        if(e.getSource().equals(cit.listar5)){
            cit.agregar5.setEnabled(false);
            cit.guardar5.setEnabled(false);
        }
        if (e.getSource().equals(cit.salir)) {
            cit.dispose();
        }





    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //////EVENTOS CRUD ACTUALIZAR DE SERVICIOS MEDICOS
        int i = serv.tabla.getSelectedRow();

        String[] infoafi = new String[7];
        if(e.getSource().equals(serv.actulizar4)){

            if(i>=0) {
                serv.Modelo.setValueAt(serv.nombreServicio.getText(), i, 0);
                serv.nombreServicio.setText(serv.tabla.getValueAt(i,0).toString());
                serv.Modelo.setValueAt(serv.Idservicio.getText(), i, 1);
                serv.Idservicio.setText(serv.tabla.getValueAt(i,1).toString());
                serv1.Actualizar();

                serv.Idservicio.setText("");
                serv.nombreServicio.setText("");


            }else {
                JOptionPane.showMessageDialog(null, "Selecionarfilas");
            }
        }

        //////EVENTOS CRUD ACTUALIZAR DE CONSULTORIOS
        int j = consul.tabla.getSelectedRow();

        String[] infoafi1 = new String[4];
        if(e.getSource().equals(consul.actulizar2)){

            if(j>=0) {
                consul.Modelo.setValueAt(consul.nombreuno.getText(), j, 0);
                consul.nombreuno.setText(consul.tabla.getValueAt(j,0).toString());
                consul.Modelo.setValueAt(consul.horaDisponivilidaduno.getText(), j, 1);
                consul.horaDisponivilidaduno.setText(consul.tabla.getValueAt(j,1).toString());
                consul1.Actualizar();

                consul.nombreuno.setText("");
                consul.horaDisponivilidaduno.setText("");


            }else {
                JOptionPane.showMessageDialog(null, "Selecionarfilas");
            }
        }
        //////EVENTOS CRUD ACTUALIZAR DE  MEDICOS Y ESPECIALISTAS
        int k =med.tabla.getSelectedRow();

        String[] infoafi2 = new String[9];
        if(e.getSource().equals(med.actulizar3)){

            if(k>=0) {
                med.Modelo.setValueAt(med.nombretres.getText(), k, 0);
                med.nombretres.setText(med.tabla.getValueAt(k,0).toString());
                med.Modelo.setValueAt(med.apellidotres.getText(), k, 1);
                med.apellidotres.setText(med.tabla.getValueAt(k,1).toString());
                med.Modelo.setValueAt( med.cedulatres.getText(),k,2);
                med.cedulatres.setText(med.tabla.getValueAt(k,2).toString());
                med.Modelo.setValueAt(  med.servicionMedicotres.getText(),k,3);
                med.servicionMedicotres.setText(med.tabla.getValueAt(k,3).toString());
                med.Modelo.setValueAt( med.medicotres.getText(),k,4);
                med.medicotres.setText(med.tabla.getValueAt(k,4).toString());
                consul1.Actualizar();

                med.nombretres.setText("");
                med.apellidotres.setText("");
                med.cedulatres.setText("");
                med.servicionMedicotres.setText("");
                med.medicotres.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "Selecionarfilas");
            }
        }
        //////EVENTOS CRUD ACTUALIZAR DE AFILIADOS
        int l =afi.tabla.getSelectedRow();

        String[] infoafi3 = new String[9];
        if(e.getSource().equals(afi.actulizar1)){

            if(l>=0) {
                afi.Modelo.setValueAt(afi.nombre0.getText(), l, 0);
                afi.nombre0.setText(afi.tabla.getValueAt(l,0).toString());
                afi.Modelo.setValueAt(afi.apellido0.getText(), l, 1);
                afi.apellido0.setText(afi.tabla.getValueAt(l,1).toString());
                afi.Modelo.setValueAt(afi.cedula0.getText(),l,2);
                afi.cedula0.setText(afi.tabla.getValueAt(l,2).toString());
                afi.fechaSalida0.setDateFormatString(afi.tabla.getValueAt(l,3).toString());
                afi.fechaIngreso0.setDateFormatString(afi.tabla.getValueAt(l,4).toString());
                afi.Modelo.setValueAt(afi.hpra0.getText(),l,5);
                afi.hpra0.setText(afi.tabla.getValueAt(l,5).toString());
                afi.Modelo.setValueAt( afi.idAfiliado0.getText(),l,6);
                afi.idAfiliado0.setText(afi.tabla.getValueAt(l,6).toString());
                afi1.Actualizar();

                afi.nombre0.setText("");
                afi.apellido0.setText("");
                afi.cedula0.setText("");
                afi.hpra0.setText("");
                afi.idAfiliado0.setText("");
                afi.fechaSalida0.setDate(null);
                afi.fechaIngreso0.setDate(null);
            }else {
                JOptionPane.showMessageDialog(null, "Selecionarfilas");
            }
        }
        //////EVENTOS CRUD ACTUALIZAR DE CITAS
        int m =cit.tabla.getSelectedRow();

        String[] infoafi4 = new String[9];
        if(e.getSource().equals(cit.actulizar5)){

            if(m>=0) {
                cit.Modelo.setValueAt(cit.nombreCinco.getText(), m, 0);
                cit.nombreCinco.setText(cit.tabla.getValueAt(m,0).toString());
                cit.Modelo.setValueAt(cit.apellidoCinco.getText(), m, 1);
                cit.apellidoCinco.setText(cit.tabla.getValueAt(m,1).toString());
                cit.Modelo.setValueAt(cit.cedulaCinco.getText(),m,2);
                cit.cedulaCinco.setText(cit.tabla.getValueAt(m,2).toString());
                cit.Modelo.setValueAt(cit.servicionMedicoCinco.getText(),m,3);
                cit.servicionMedicoCinco.setText(cit.tabla.getValueAt(m,3).toString());
                cit.Modelo.setValueAt(cit.medicoCinco.getText(),m,4);
                cit.medicoCinco.setText(cit.tabla.getValueAt(m,4).toString());
                cit.fechaSalidaCinco.setDateFormatString(cit.tabla.getValueAt(m,5).toString());
                cit.fechaIngresoCinco.setDateFormatString(cit.tabla.getValueAt(m,6).toString());
                cit.Modelo.setValueAt(cit.hpraCinco.getText(),m,7);
                cit.hpraCinco.setText(cit.tabla.getValueAt(m,7).toString());
                cit.Modelo.setValueAt( cit.consultaorioCinco.getText(),m,8);
                cit.consultaorioCinco.setText(cit.tabla.getValueAt(m,8).toString());

                cit1.Actualizar();

                cit.nombreCinco.setText("");
                cit.apellidoCinco.setText("");
                cit.cedulaCinco.setText("");
                cit.servicionMedicoCinco.setText("");
                cit.medicoCinco.setText("");
                cit.fechaSalidaCinco.setDate(null);
                cit.fechaIngresoCinco.setDate(null);
                cit.hpraCinco.setText("");
                cit.consultaorioCinco.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "Selecionarfilas");
            }
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //////VALIDACIONES DE CARACTERES NUMERICOS O ALFABETICOS Y LONGITUD DE TODOS LOS DATOS INGRESADOS
        if(e.getSource().equals(afi.nombre0)){
          if(afi.nombre0.getText().length()>=10){
              e.consume();
              Toolkit.getDefaultToolkit().beep();
          }
          char carater = e.getKeyChar();
           if (!Character.isAlphabetic(carater)){
              e.consume();
          }
        }
        else if(e.getSource().equals(afi.apellido0)){
            if(afi.apellido0.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals(afi.cedula0)){
            if(afi.cedula0.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(afi.hpra0)){
            if(afi.hpra0.getText().length()>=6){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)&& carater!=':'& carater!='P'&carater!='M'&carater!='A'& carater!='p'&carater!='m'&carater!='a'){
                e.consume();
            }

        }
        else  if(e.getSource().equals(afi.idAfiliado0)){
            if(afi.idAfiliado0.getText().length()>=11){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
       else if(e.getSource().equals(consul.nombreuno)){
            if(consul.nombreuno.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(consul.horaDisponivilidaduno)) {
            if(consul.horaDisponivilidaduno.getText().length()>=6){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)&& carater!=':'& carater!='P'&carater!='M'&carater!='A'& carater!='p'&carater!='m'&carater!='a'){
                e.consume();
            }

        }

       else if(e.getSource().equals( med.nombretres)){
            if( med.nombretres.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(med.apellidotres)){
            if(med.apellidotres.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals(med.cedulatres)){
            if(med.cedulatres.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(med.servicionMedicotres)){
            if(med.servicionMedicotres.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
          else if(e.getSource().equals( med.medicotres)){
            if( med.medicotres.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(serv.nombreServicio)){
            if(serv.nombreServicio.getText().length()>=20){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals( serv.Idservicio)){
            if( serv.Idservicio.getText().length()>=11){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals(cit.cedulaCinco)){
            if(cit.cedulaCinco.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals(cit.consultaorioCinco)){
            if(cit.consultaorioCinco.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)){
                e.consume();
            }
        }
        if(e.getSource().equals(cit.nombreCinco)){
            if(cit.nombreCinco.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals(cit.apellidoCinco)){
            if(cit.apellidoCinco.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }


        else  if(e.getSource().equals(cit.medicoCinco)){
            if(cit.medicoCinco.getText().length()>=11){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }

        else if(e.getSource().equals(cit.apellidoCinco)){
            if(cit.apellidoCinco.getText().length()>=10){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals(cit.medicoCinco)){
            if(cit.medicoCinco.getText().length()>=11){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else  if(e.getSource().equals( cit.servicionMedicoCinco)){
            if( cit.servicionMedicoCinco.getText().length()>=11){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isAlphabetic(carater)){
                e.consume();
            }
        }
        else if(e.getSource().equals( cit.hpraCinco)) {
            if( cit.hpraCinco.getText().length()>=6){
                e.consume();
                Toolkit.getDefaultToolkit().beep();
            }
            char carater = e.getKeyChar();
            if (!Character.isDigit(carater)&& carater!=':'& carater!='P'&carater!='M'&carater!='A'& carater!='p'&carater!='m'&carater!='a'){
                e.consume();
            }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void caretUpdate(CaretEvent e) {
        ////BUSQUEDA DATOS ESPECIFICOS
        if(e.getSource().equals(afi.buscar1)) {
            afi1.Buscar();
        }
        if(e.getSource().equals(med.buscar4)) {
            med1.Buscar();
        }
        if(e.getSource().equals(serv.buscar3)) {
            serv1.Buscar();
        }
        if(e.getSource().equals(consul.buscar3)) {
            consul1.Buscar();
        }
        if(e.getSource().equals(cit.buscar)) {
            cit1.Buscar();
        }
    }
}

