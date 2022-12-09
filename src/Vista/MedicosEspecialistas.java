package Vista;

import javax.swing.*;
import java.awt.*;

public class MedicosEspecialistas extends JFrame {

    public  JButton  agregar3, actulizar3, eliminar3, listar3,guardar3,atras3;
    public JPanel  crud3,pDatos3;
    private JLabel nombre3,apellido3,cedula3,servicionMedico3,medico3;
    public JTextField nombretres,apellidotres,cedulatres,servicionMedicotres,medicotres;

    private void initGUI3() {
        pDatos3 = new JPanel(new GridLayout(3,2));
        nombre3 = new JLabel("Nombre  del Medíco o Especialista:");
        nombretres = new JTextField(12);
        apellido3 = new JLabel("Apellido del Medíco o Especialista:");
        apellidotres = new JTextField(12);
        cedula3 = new JLabel("Cedula del Medíco o Especialista:");
        cedulatres = new JTextField(12);
        servicionMedico3 = new JLabel(" Id del Servicio:");
        servicionMedicotres = new JTextField(12);
        medico3 = new JLabel("ID Medico:");
        medicotres = new JTextField(12);
        pDatos3.add(nombre3);
        pDatos3.add(nombretres);
        pDatos3.add(apellido3);
        pDatos3.add(apellidotres);
        pDatos3.add(cedula3);
        pDatos3.add(cedulatres);
        pDatos3.add(servicionMedico3);
        pDatos3.add(servicionMedicotres);
        pDatos3.add(medico3);
        pDatos3.add(medicotres);
        pDatos3.setBackground(Color.getHSBColor(178,57,100));
        add( pDatos3,BorderLayout.NORTH);

        crud3 = new JPanel();
        agregar3 = new JButton("Agregar");
        actulizar3 = new JButton("Actualizar");
        eliminar3 = new JButton("Eliminar");
        listar3 = new JButton("Listar");
        guardar3 = new JButton("Guardar");
        atras3 = new JButton("Retroceder");
        crud3.add(atras3);
        crud3.add(agregar3);
        crud3.add(actulizar3);
        crud3.add(eliminar3);
        crud3.add(listar3);
        crud3.add(guardar3);
        crud3.setBackground(Color.getHSBColor(178,57,100));
        add(crud3, BorderLayout.SOUTH);
    }

    public MedicosEspecialistas() {
        initGUI3();
        this.setTitle("Medicos y Especialistas");
        this.setSize(1100,600);
        this.setVisible(false);
        this.getContentPane().setBackground(Color.getHSBColor(178,57,100));
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

}
