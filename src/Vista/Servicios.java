package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Servicios extends JFrame {
    public  JButton  agregar4, actulizar4, eliminar4,eliminar44 ,listar4,guardar4,atras4;
    public JPanel  crud4,pDatos4,ti;
    private JLabel nombreServicio4,Idservicio4;
    public JTextField nombreServicio,Idservicio;

    public DefaultTableModel Modelo;
    public JTable tabla;
    public String [] columna ;
    private void initGUI4() {
        pDatos4 = new JPanel(new GridLayout(3,1));
        nombreServicio4 = new JLabel("Nombre del Servicio:");
        nombreServicio = new JTextField(12);
        Idservicio4 = new JLabel("Id del Servicio:");
        Idservicio = new JTextField(12);
        pDatos4.add(nombreServicio4);
        pDatos4.add(nombreServicio);
        pDatos4.add(Idservicio4);
        pDatos4.add(Idservicio);
        pDatos4.setBackground(Color.getHSBColor(178,57,100));
        add( pDatos4,BorderLayout.NORTH);

        ti = new JPanel();
        String[] columna = new String[2];
        columna[0]="Nombre del Servicio";
        columna[1]= "ID del Servicio";

        Modelo = new DefaultTableModel(columna,0);
        tabla = new JTable(Modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(1100, 500));
        ti.add(scrollPane);
        tabla.setBackground(Color.getHSBColor(178,57,100));
        ti.setBackground(Color.getHSBColor(178,57,100));
        add(ti,BorderLayout.CENTER);


        crud4 = new JPanel();
        agregar4 = new JButton("Agregar");
        actulizar4 = new JButton("Actualizar");
        eliminar4 = new JButton("Eliminar");
        eliminar44 = new JButton("Eliminar Todo");
        listar4 = new JButton("Listar");
        guardar4 = new JButton("Guardar");
        atras4 = new JButton("Retroceder");
        crud4.add(atras4);
        crud4.add(agregar4);
        crud4.add(actulizar4);
        crud4.add(eliminar4);
        crud4.add(eliminar44);
        crud4.add(listar4);
        crud4.add(guardar4);
        crud4.setBackground(Color.getHSBColor(178,57,100));
        add(crud4, BorderLayout.SOUTH);
    }
    public Servicios() {
        initGUI4();
        this.setTitle("Servicios");
        this.setSize(1100,600);
        this.setVisible(false);
        this.getContentPane().setBackground(Color.getHSBColor(178,57,100));
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

}
