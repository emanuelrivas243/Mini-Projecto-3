package Vista;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class Citas  extends JFrame {
    public  JButton  agregar5, actulizar5, eliminar5, listar5,guardar5,atras5;
    public JPanel  crud5,pDatos5;
    private JLabel nombre5,apellido5,cedula5,servicionMedico5,medico5,fechaSalida5,fechaIngreso5,hpra5,consultaorio5;
    public JTextField nombreCinco,apellidoCinco,cedulaCinco,servicionMedicoCinco,medicoCinco,consultaorioCinco;
    public JDateChooser fechaSalidaCinco,fechaIngresoCinco,hpraCinco;
    public Citas()  {
        initGUI5();
        pDatos5 = new JPanel(new GridLayout(5,2));
        nombre5 = new JLabel("Nombre Del Afiliado:");
        nombreCinco = new JTextField(12);
        apellido5 = new JLabel("Apellido del Afiliado:");
        apellidoCinco = new JTextField(12);
        cedula5 = new JLabel("Cedula del Afiliado:");
        cedulaCinco= new JTextField(12);
        servicionMedico5 = new JLabel("Servicio Medico:");
        servicionMedicoCinco = new JTextField(12);
        medico5 = new JLabel("Nombre del Medico:");
        medicoCinco = new JTextField(12);
        fechaSalida5 = new JLabel(" Fecha de Salida:");
        fechaSalidaCinco = new JDateChooser("dd/MM/yyyy","#######",'_');
        fechaIngreso5 = new JLabel("Fecha de Ingreso:");
        fechaIngresoCinco = new JDateChooser("dd/MM/yyyy","#######",'_');
        hpra5 = new JLabel("Hora:");
        hpraCinco = new JDateChooser("HH:mm","#######",'_');
        consultaorio5 = new JLabel("Consultorio o Laboratorio:");
        consultaorioCinco= new JTextField(12);
        pDatos5.add(nombre5);
        pDatos5.add(nombreCinco);
        pDatos5.add(apellido5);
        pDatos5.add(apellidoCinco);
        pDatos5.add(cedula5);
        pDatos5.add(cedulaCinco);
        pDatos5.add(servicionMedico5);
        pDatos5.add(servicionMedicoCinco);
        pDatos5.add(medico5);
        pDatos5.add(medicoCinco);
        pDatos5 .add(fechaSalida5);
        pDatos5.add(fechaSalidaCinco);
        pDatos5.add(fechaIngreso5);
        pDatos5.add(fechaIngresoCinco);
        pDatos5.add(hpra5);
        pDatos5.add(hpraCinco);
        pDatos5.add(consultaorio5);
        pDatos5.add(consultaorioCinco);
        pDatos5.setBackground(Color.getHSBColor(178,57,100));
        add( pDatos5,BorderLayout.NORTH);

        crud5 = new JPanel();
        agregar5 = new JButton("Agregar");
        actulizar5 = new JButton("Actualizar");
        eliminar5 = new JButton("Eliminar");
        listar5 = new JButton("Listar");
        guardar5 = new JButton("Guardar");
        atras5 = new JButton("Retroceder");
        crud5.add(atras5);
        crud5.add(agregar5);
        crud5.add(actulizar5);
        crud5.add(eliminar5);
        crud5.add(listar5);
        crud5.add(guardar5);
        crud5.setBackground(Color.getHSBColor(178,57,100));
        add(crud5, BorderLayout.SOUTH);
    }

    private void initGUI5() {
        this.setTitle("Citas");
        this.setSize(1100,600);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.getHSBColor(178,57,100));
        this.setResizable(true);

    }
}
