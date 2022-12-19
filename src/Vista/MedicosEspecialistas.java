package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MedicosEspecialistas extends JFrame {

    public  JButton  agregar3, actulizar3, eliminar3, listar3,guardar3,atras3,eliminar33;
    public JPanel  crud3,pDatos3,ti;
    private JLabel nombre3,apellido3,cedula3,servicionMedico3,medico3;
    public JTextField nombretres,apellidotres,cedulatres,servicionMedicotres,medicotres;

    public DefaultTableModel Modelo;
    public JTable tabla;
    public String [] columna ;

    private void initGUI3() {
        pDatos3 = new JPanel(new GridLayout(3,2));
        nombre3 = new JLabel("Nombre  del Medíco o Especialista:");
        nombretres = new JTextField(12);
        apellido3 = new JLabel("Apellido del Medíco o Especialista:");
        apellidotres = new JTextField(12);
        cedula3 = new JLabel("Cedula del Medíco o Especialista:");
        cedulatres = new JTextField(12);
        servicionMedico3 = new JLabel(" ID del Servicio:");
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

        ti = new JPanel();
        String[] columna = new String[5];
        columna[0]="Nombre  del Medíco o Especialista";
        columna[1]= "Apellido del Medíco o Especialista";
        columna[2]=  "Cedula del Medíco o Especialista";
        columna[3]=" ID del Servicio";
        columna[4]= "ID del Medico";
        Modelo = new DefaultTableModel(columna,0);
        tabla = new JTable(Modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(1100, 500));
        ti.add(scrollPane);
        tabla.setBackground(Color.getHSBColor(178,57,100));
        ti.setBackground(Color.getHSBColor(178,57,100));
        add(ti,BorderLayout.CENTER);



        crud3 = new JPanel();
        agregar3 = new JButton("Agregar");
        actulizar3 = new JButton("Actualizar");
        eliminar3 = new JButton("Eliminar");
        listar3 = new JButton("Listar");
        guardar3 = new JButton("Guardar");
        atras3 = new JButton("Retroceder");
        eliminar33 = new JButton("Eliminar Todo");
        crud3.add(atras3);
        crud3.add(agregar3);
        crud3.add(actulizar3);
        crud3.add(eliminar3);
        crud3.add(eliminar33);
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
