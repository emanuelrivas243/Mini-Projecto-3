package Vista;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Afiliados extends JFrame {

    public  JButton  agregar1, actulizar1, eliminar1, listar1,guardar1,atras1,eliminar11;
    public JPanel  crud1 ,pDatos ,t;
    private JLabel nombre,apellido,cedula,fechaSalida,fechaIngreso,hpra,idAfiliado;
    public JTextField nombre0,apellido0,cedula0,idAfiliado0,hpra0;




    public JDateChooser fechaIngreso0,fechaSalida0;

    public DefaultTableModel Modelo;
    public JTable tabla;
    public String [] columna ;



    private void initGUI1() {
        pDatos = new JPanel(new GridLayout(4,2));
        nombre = new JLabel("Nombre del Afiliado:");
        nombre0 = new JTextField(12);
        apellido = new JLabel("Apellido del Afiliado:");
        apellido0 = new JTextField(12);
        cedula = new JLabel("Cedula del Afiliado:");
        cedula0 = new JTextField(12);
        fechaSalida = new JLabel(" Fecha de Salida:");
        fechaSalida0 = new JDateChooser("dd/MM/yyyy","#######",'_');
        fechaSalida0.setDateFormatString("yyyy-MM-dd");
        fechaIngreso = new JLabel("Fecha de Ingreso:");
        fechaIngreso0 = new JDateChooser("dd/MM/yyyy","#######",'_');
        hpra = new JLabel("Hora de ingreso:");
        hpra0 = new JTextField(12);
        idAfiliado = new JLabel("Id Afiliado:");
        idAfiliado0 = new JTextField(12);
        pDatos.add(nombre);
        pDatos.add(nombre0);
        pDatos.add(apellido);
        pDatos.add(apellido0);
        pDatos.add(cedula);
        pDatos.add(cedula0);
        pDatos.add(fechaSalida);
        pDatos.add(fechaSalida0);
        pDatos.add(fechaIngreso);
        pDatos.add(fechaIngreso0);
        pDatos.add(hpra);
        pDatos.add(hpra0);
        pDatos.add(idAfiliado);
        pDatos.add(idAfiliado0);
        pDatos.setBackground(Color.getHSBColor(178,57,100));
        add(pDatos,BorderLayout.NORTH);

        t = new JPanel();
        String[] columna = new String[7];
        columna[0]="Nombre del Afiliado";
        columna[1]= "Apellido del Afiliado";
        columna[2]=  "Cedula del Afiliado";
        columna[3]="Fecha de Salida";
        columna[4]= "Fecha de Ingreso";
        columna[5]="Hora de Ingreso";
        columna[6]="Id Afiliado";
        Modelo = new DefaultTableModel(columna,0);
        tabla = new JTable(Modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(1100, 500));
        t.add(scrollPane);
        tabla.setBackground(Color.getHSBColor(178,57,100));
        t.setBackground(Color.getHSBColor(178,57,100));
        add(t,BorderLayout.CENTER);






        crud1 = new JPanel();
        agregar1 = new JButton("Agregar");
        actulizar1 = new JButton("Actualizar");
        eliminar1 = new JButton("Eliminar");
        listar1 = new JButton("Listar");
        guardar1 = new JButton("Guardar");
        atras1 = new JButton("Retroceder");
        eliminar11=  new JButton("Eliminar Todo");
        crud1.add(atras1);
        crud1.add(agregar1);
        crud1.add(actulizar1);
        crud1.add(eliminar1);
        crud1.add(eliminar11);
        crud1.add(listar1);
        crud1.add(guardar1);
        crud1.setBackground(Color.getHSBColor(178,57,100));
        add(crud1, BorderLayout.SOUTH);
    }

    public Afiliados() {
        initGUI1();
        this.setTitle("Afiliados");
        this.setSize(1100,600);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.getHSBColor(178,57,100));
        this.setResizable(true);
    }


}
