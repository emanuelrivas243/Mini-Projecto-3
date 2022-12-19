package MVC;


import Controlador.ManejadoraEventos;
import Modelo.*;
import Vista.*;

public class Main {
    public static void main(String[] args) {

        Principal pri = new Principal();
        Afiliados afi = new Afiliados();
        Consultorios consul = new Consultorios();
        MedicosEspecialistas med = new MedicosEspecialistas();
        Servicios serv = new Servicios();
        Citas cit = new Citas();


        String fechaIngreso = null;
        String fechaSalida = null;
        String hora = "";
        String nombre = "";
        String apellido = "";
        String cedula = "";
        String IdAfiliado ="";
        

        Afiliados1 afi1 = new Afiliados1(fechaIngreso,fechaSalida, hora, nombre, apellido,cedula,IdAfiliado,afi);

        String nombreAfiliado="";
        String apellidoAfiliado="";
        String cedulaAfiliado="";
        String servicioMedico="";
        String nombreMedico="";
        String fechaIngreso1=null;
        String fechaSalida1=null;
        String hora1="";
        String consultorioLaboratorio="";

        Citas1 cit1 = new Citas1(nombreAfiliado, apellidoAfiliado,  cedulaAfiliado,  servicioMedico,
               nombreMedico, fechaIngreso1 , fechaSalida1,  hora1, consultorioLaboratorio,cit);

        String numeroConsultorio="";
        String horaDisponibilidad="";

        Consultorios1 consul1 = new Consultorios1(numeroConsultorio,horaDisponibilidad, consul);

        String nombreEspecialista="";
        String ApellidoMedícooEspecialista="";
        String CedulaMedícooEspecialista="";
        String IddelServicio="";
        String IDMedico="";

        MedicosEspecialistas1 med1= new MedicosEspecialistas1( nombreEspecialista, ApellidoMedícooEspecialista,
                CedulaMedícooEspecialista,  IddelServicio,IDMedico, med);
        String nombreServicio="";
        String IddServicio="";
        Servicios1 serv1 = new Servicios1( nombreServicio,  IddServicio, serv);
        ManejadoraEventos ma = new ManejadoraEventos(pri,afi,consul,med,serv, cit,afi1,cit1,consul1,med1,serv1);

    }
}