package MVC;


import Controlador.ManejadoraEventos;
import Vista.*;


public class Main {
    public static void main(String[] args) {

        Principal pri = new Principal();
        Afiliados afi = new Afiliados();
        Consultorios consul = new Consultorios();
        MedicosEspecialistas med = new MedicosEspecialistas();
        Servicios serv = new Servicios();
        Citas cit = new Citas();
        ManejadoraEventos ma = new ManejadoraEventos(pri,afi,consul,med,serv, cit);

    }
}