package Vista;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Citas  extends JFrame {
    public  JButton salir, agregar5, actulizar5, eliminar5, listar5,guardar5,atras5,eliminar55,afiliado,consultorio,especialista,servicios;
    public JPanel  crud5,pDatos5,ti,pb2;
    private JLabel nombre5,apellido5,cedula5,servicionMedico5,medico5,fechaSalida5,fechaIngreso5,hpra5,consultaorio5;
    public JTextField   nombreCinco,apellidoCinco,cedulaCinco,hpraCinco,servicionMedicoCinco,medicoCinco,consultaorioCinco;
    public JDateChooser fechaSalidaCinco,fechaIngresoCinco;

    public DefaultTableModel Modelo;
    public JTable tabla;
    public String [] columna ;
    public Citas()  {

        initGUI5();
        pb2 = new JPanel(new GridLayout(1,3));
        afiliado= new JButton("Afiliados");
        consultorio= new JButton("Consultorio");
        especialista= new JButton("Medicos");
        servicios= new JButton("servicios");
        pb2.add(afiliado);
        pb2.add(consultorio);
        pb2.add(especialista);
        pb2.add(servicios);
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
        hpra5 = new JLabel("Hora de  ingreso:");
        hpraCinco = new JTextField(12);
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


        pDatos5.add(  pb2);


        pDatos5.setBackground(Color.getHSBColor(178,57,100));
        add( pDatos5,BorderLayout.NORTH);

        ti = new JPanel();
        String[] columna = new String[9];
        columna[0]="Nombre del Afiliado";
        columna[1]= "Apellido del Afiliado";
        columna[2]=  "Cedula del Afiliado";
        columna[3]="Servicio Medico";
        columna[4]= "Nombre del Medico";
        columna[5]="Fecha de Salida";
        columna[6]="Fecha de Ingreso";
        columna[7]="Hora de Ingreso";
        columna[8]="Consultorio o Laboratorio";
        Modelo = new DefaultTableModel(columna,0);
        tabla = new JTable(Modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(1100, 500));
        ti.add(scrollPane);
        tabla.setBackground(Color.getHSBColor(178,57,100));
        ti.setBackground(Color.getHSBColor(178,57,100));
        add(ti,BorderLayout.CENTER);

        crud5 = new JPanel();
        agregar5 = new JButton("Agregar");
        actulizar5 = new JButton("Actualizar");
        eliminar5 = new JButton("Eliminar");
        eliminar55 = new JButton("Eliminar Todo");
        listar5 = new JButton("Listar");
        guardar5 = new JButton("Guardar");
        atras5 = new JButton("Retroceder");
        salir = new JButton("Salir");
        crud5.add(salir);
        crud5.add(atras5);
        crud5.add(agregar5);
        crud5.add(actulizar5);
        crud5.add(eliminar5);
        crud5.add(eliminar55);
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
