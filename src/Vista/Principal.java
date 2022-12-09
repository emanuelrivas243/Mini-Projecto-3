
package  Vista;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {
    public JPanel  menu;
    public  JLabel afiliados0,medicosEspecialistas0,serviciosSalud0 ,consultorios0, citas0;
    public  JButton  consultorios,serviciosSalud,medicosEspecialistas,afiliados,citas;

    private void initGUI() {
    menu  = new JPanel(new FlowLayout());


        menu.setBackground(Color.getHSBColor(178,57,100));
        afiliados0 = new JLabel("Afiliados:");
        afiliados = new JButton();

        Image img= new ImageIcon(getClass().getResource("/Sources/afiliados.jpg")).getImage();
        ImageIcon imga=new ImageIcon(img.getScaledInstance(45, 40, Image.SCALE_SMOOTH));
        afiliados.setIcon(imga);
        menu.add(afiliados0);
        menu.add(afiliados);



        medicosEspecialistas = new JButton();
        medicosEspecialistas0 = new JLabel("Medícos:");
        Image img1= new ImageIcon(getClass().getResource("/Sources/Especialistas.png")).getImage();
        ImageIcon imgb=new ImageIcon(img1.getScaledInstance(45, 40, Image.SCALE_SMOOTH));
        medicosEspecialistas.setIcon(imgb);
        menu.add(medicosEspecialistas0);
        menu.add(medicosEspecialistas);



        serviciosSalud = new JButton();
        serviciosSalud0 = new JLabel("Servicios:");
        Image img2= new ImageIcon(getClass().getResource("/Sources/serviciosSalud.jpg")).getImage();
        ImageIcon imgc=new ImageIcon(img2.getScaledInstance(45, 40, Image.SCALE_SMOOTH));
        serviciosSalud.setIcon(imgc);
        menu.add(serviciosSalud0);
        menu.add(serviciosSalud);


        consultorios = new JButton();
        consultorios0 = new JLabel("Consultorios:");
        Image img3= new ImageIcon(getClass().getResource("/Sources/consultorios.jpg")).getImage();
        ImageIcon imgd=new ImageIcon(img3.getScaledInstance(45, 40, Image.SCALE_SMOOTH));
        consultorios.setIcon(imgd);
        menu.add(consultorios0);
        menu.add(consultorios);

        citas = new JButton();
        citas0 = new JLabel("Citas:");
        Image img4= new ImageIcon(getClass().getResource("/Sources/citas.png")).getImage();
        ImageIcon imge=new ImageIcon(img4.getScaledInstance(45, 40, Image.SCALE_SMOOTH));
        citas.setIcon(imge);
        menu.add(citas0);
        menu.add(citas);
        add(menu,BorderLayout.NORTH);

    }
    panelImage panel = new panelImage();


    public Principal() {
        initGUI();
        this.setTitle("Servicio de Salud");
        this.setSize(1100,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.add(panel, BorderLayout.CENTER);
    }

    public class panelImage extends JPanel{

        @Override
        public void paint(Graphics g){
            Dimension dimension = this.getSize();
            ImageIcon icon = new ImageIcon(getClass().getResource("/Sources/uno.jpg"));
            g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
            setOpaque(false);
            super.paintChildren(g);

        }


    }


}


