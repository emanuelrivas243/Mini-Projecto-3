package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Consultorios extends JFrame {
    public  JButton  salir,agregar2, actulizar2, eliminar2, eliminar22,listar2,guardar2,atras2;
    public JPanel  crud2,pDatos2,ti;

    private JLabel nombre1,horaDisponivilidad,buscartres;
    public JTextField nombreuno,horaDisponivilidaduno,buscar3;
    public DefaultTableModel Modelo;


    public JTable tabla;
    public String [] columna ;

    private void initGUI2() {
        pDatos2 = new JPanel(new GridLayout(3,2));
        nombre1 = new JLabel("Numero de Consultorio o Laboratorio:");
        nombreuno = new JTextField(12);
        horaDisponivilidad = new JLabel("Hora de Disponibilidad:");
        horaDisponivilidaduno = new JTextField(12);
        buscartres= new JLabel("Buscar");
        buscar3 = new JTextField(12);
        pDatos2.add(nombre1);
        pDatos2.add(nombreuno);
        pDatos2.add(horaDisponivilidad);
        pDatos2.add(horaDisponivilidaduno);
        pDatos2.add(buscartres);
        pDatos2.add(buscar3);
        pDatos2.setBackground(Color.getHSBColor(178,57,100));
        add(pDatos2,BorderLayout.NORTH);

        ti = new JPanel();
        String[] columna = new String[2];
        columna[0]="Numero de Consultorio o Laboratorio";
        columna[1]= "Hora de Disponibilidad";

        Modelo = new DefaultTableModel(columna,0);
        tabla = new JTable(Modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(1100, 500));
        ti.add(scrollPane);
        tabla.setBackground(Color.getHSBColor(178,57,100));
        ti.setBackground(Color.getHSBColor(178,57,100));
        add(ti,BorderLayout.CENTER);


        crud2 = new JPanel();
        agregar2 = new JButton("Agregar");
        actulizar2 = new JButton("Actualizar");
        eliminar2 = new JButton("Eliminar");
        listar2 = new JButton("Listar");
        guardar2 = new JButton("Guardar");
        atras2 = new JButton("Retroceder");
        eliminar22 = new JButton("Eliminaar Todo");
        salir= new JButton("Salir");
        crud2.add(salir);
        crud2.add(atras2);
        crud2.add(agregar2);
        crud2.add(actulizar2);
        crud2.add(eliminar2);
        crud2.add(eliminar22);
        crud2.add(listar2);
        crud2.add(guardar2);
        crud2.setBackground(Color.getHSBColor(178,57,100));
        add(crud2, BorderLayout.SOUTH);

    }
    public Consultorios() {
        initGUI2();
        this.setTitle("Consultorios y Laboratorios");
        this.setSize(1100,600);
        this.setVisible(false);
        this.getContentPane().setBackground(Color.getHSBColor(178,57,100));
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

}
