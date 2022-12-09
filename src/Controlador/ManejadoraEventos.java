package Controlador;

import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManejadoraEventos implements ActionListener {
    private Citas cit;
    private Principal view;
    private Afiliados afi;
    private Consultorios consul;
    private MedicosEspecialistas med;
    private Servicios serv;
    public ManejadoraEventos(Principal view,Afiliados afi,Consultorios consul, MedicosEspecialistas med, Servicios serv, Citas cit){
      this.view= view;
      this.view.afiliados.addActionListener(this);
      this.view.consultorios.addActionListener(this);
      this.view.serviciosSalud.addActionListener(this);
      this.view.medicosEspecialistas.addActionListener(this);
      this.view.citas.addActionListener(this);
      this.afi= afi;
      this.afi.actulizar1.addActionListener(this);
      this.afi.agregar1.addActionListener(this);
      this.afi.listar1.addActionListener(this);
      this.afi.eliminar1.addActionListener(this);
      this.afi.guardar1.addActionListener(this);
      this.afi.atras1.addActionListener(this);
      this.consul= consul;
        this.consul.actulizar2.addActionListener(this);
        this.consul.agregar2.addActionListener(this);
        this.consul.listar2.addActionListener(this);
        this.consul.eliminar2.addActionListener(this);
        this.consul.guardar2.addActionListener(this);
        this.consul.atras2.addActionListener(this);
      this.med= med;
        this.med.actulizar3.addActionListener(this);
        this.med.agregar3.addActionListener(this);
        this.med.listar3.addActionListener(this);
        this.med.eliminar3.addActionListener(this);
        this.med.guardar3.addActionListener(this);
        this.med.atras3.addActionListener(this);
      this.serv= serv;
        this.serv.actulizar4.addActionListener(this);
        this.serv.agregar4.addActionListener(this);
        this.serv.listar4.addActionListener(this);
        this.serv.eliminar4.addActionListener(this);
        this.serv.guardar4.addActionListener(this);
        this.serv.atras4.addActionListener(this);

        this.cit= cit;
        this.cit.actulizar5.addActionListener(this);
        this.cit.agregar5.addActionListener(this);
        this.cit.listar5.addActionListener(this);
        this.cit.eliminar5.addActionListener(this);
        this.cit.guardar5.addActionListener(this);
        this.cit.atras5.addActionListener(this);


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
    }
}
