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
        //EVENTOS FRAME PRINCIPAL
        this.view= view;
      this.view.afiliados.addActionListener(this);
      this.view.consultorios.addActionListener(this);
      this.view.serviciosSalud.addActionListener(this);
      this.view.medicosEspecialistas.addActionListener(this);
      this.view.citas.addActionListener(this);
      //EVENTOS FRAME AFILIADOS
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
      this.consul= consul;

      //EVENTOS FRAME CONSLTORIOS
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

        //EVENTOS FRAME MEDICOS ESPECIALISTAS
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


        //EVENTOS FRAME SERVICIOS
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
        //EVENTOS FRAME CITAS
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




        this.afi1= afi1;
        this.consul1=consul1;
        this.cit1=cit1;
        this.serv1=serv1;
        this.med1=med1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
            ///view.setVisible(false);
            afi.setVisible(true);
            //consul.setVisible(false);
            //med.setVisible(false);
           // serv.setVisible(false);
           // cit.setVisible(false);
        }
        else if (e.getSource().equals(cit.servicios)) {
            ///view.setVisible(false);
           // afi.setVisible(true);
            //consul.setVisible(false);
            //med.setVisible(false);
             serv.setVisible(true);
            // cit.setVisible(false);
        }
        else if (e.getSource().equals(cit.consultorio)) {
            ///view.setVisible(false);
            // afi.setVisible(true);
            consul.setVisible(true);
            //med.setVisible(false);
            //serv.setVisible(true);
            // cit.setVisible(false);
        }
        else if (e.getSource().equals(cit.especialista)) {
            ///view.setVisible(false);
            // afi.setVisible(true);
            //consul.setVisible(true);
            med.setVisible(true);
            //serv.setVisible(true);
            // cit.setVisible(false);
        }

       else if (e.getSource().equals(afi.agregar1)){


                try {
                    if (afi.nombre0.getText().isEmpty() || afi.apellido0.getText().isEmpty() ||
                            afi.cedula0.getText().isEmpty() || afi.idAfiliado0.getText().isEmpty()
                            || afi.fechaSalida0.getDate().toString().isEmpty() || afi.fechaIngreso0.getDate().toString().isEmpty()
                    ) {
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

        else if (e.getSource().equals(consul.agregar2)){
            try{
                if(consul.nombreuno.getText().isEmpty()||consul.horaDisponivilidaduno.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "llene los campus vacios");
                } else{
                    consul1.Agregar();
                    JOptionPane.showMessageDialog(null, "revise los campos y luego oprima Actualizar para ingrezar nuevos datos");
                } }catch (Exception E){

            }
            }


        else if (e.getSource().equals(consul.eliminar2)){
            consul1.Eliminar();
        }

        else if (e.getSource().equals(consul.eliminar22)) {
            consul1.EliminarTodo();
        }
        //
        else if (e.getSource().equals(med.agregar3)){
            try{
                if(med.nombretres.getText().isEmpty()|| med.apellidotres.getText().isEmpty()|| med.cedulatres.getText().isEmpty()||
                med.servicionMedicotres.getText().isEmpty()|| med.medicotres.getText().isEmpty()) {
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

    //////

        else if (e.getSource().equals(serv.agregar4)){

            try{
                if(serv.nombreServicio.getText().isEmpty()||serv.Idservicio.getText().isEmpty()
                ) {
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

}


    @Override
    public void mouseClicked(MouseEvent e) {

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
        //
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

          //
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


    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void caretUpdate(CaretEvent e) {
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
    }
}

