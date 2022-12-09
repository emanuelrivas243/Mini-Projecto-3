package Vista;

import javax.swing.*;
import java.awt.*;

public class Consultorios extends JFrame {
    public  JButton  agregar2, actulizar2, eliminar2, listar2,guardar2,atras2;
    public JPanel  crud2,pDatos2;
    private JLabel nombre1,horaDisponivilidad;
    public JTextField nombreuno,horaDisponivilidaduno;

    private void initGUI2() {
        pDatos2 = new JPanel(new GridLayout(3,2));
        nombre1 = new JLabel("Numero de Consultorio o Laboratorio:");
        nombreuno = new JTextField(12);
        horaDisponivilidad = new JLabel("Hora de Disponibilidad:");
        horaDisponivilidaduno = new JTextField(12);
        pDatos2.add(nombre1);
        pDatos2.add(nombreuno);
        pDatos2.add(horaDisponivilidad);
        pDatos2.add(horaDisponivilidaduno);
        pDatos2.setBackground(Color.getHSBColor(178,57,100));
        add(pDatos2,BorderLayout.NORTH);

        crud2 = new JPanel();
        agregar2 = new JButton("Agregar");
        actulizar2 = new JButton("Actualizar");
        eliminar2 = new JButton("Eliminar");
        listar2 = new JButton("Listar");
        guardar2 = new JButton("Guardar");
        atras2 = new JButton("Retroceder");
        crud2.add(atras2);
        crud2.add(agregar2);
        crud2.add(actulizar2);
        crud2.add(eliminar2);
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
