package main;

import controller.ControladorCliente;
import controller.ControladorTecnico;
import model.Cliente;
import model.EnumTipoServicio;
import model.Especialidad;
import model.Tecnico;
import persistencia.ControladoraPersistencia;

public class TicketManager {

    public static void main(String[] args) {

        ControladoraPersistencia controlpersis = new ControladoraPersistencia();//Para crear tabla en base de datos

        /*ControladorCliente controlCliente=new ControladorCliente();//Instancia para hacer llamar métodos CRUD de "cliente"
        
        //se instancia un cliente...
        Cliente cliente0=new Cliente("2010500400", "HardSoft S.A.", true, EnumTipoServicio.TANGO, "Av. Cabildo 1035", "011456456", "hardsoft@hardsoft.com");
        Cliente cliente1=new Cliente("1622500500", "Java S.A.", true, EnumTipoServicio.RHEL, "Av. Siempre Viva 3055", "011999999", "java@java.com");
       
        //se llama el método crearCliente desde una instancia del controlador de Cliente y se le pasa el cliente creado...
        //controlCliente.crearCliente(cliente0);
        //controlCliente.crearCliente(cliente1);
        
        //Se crea tabla Técnico
        ControladorTecnico controlTecnico=new ControladorTecnico();
        
        //se instancia a Técnicos
        Tecnico tecnico0=new Tecnico("Brown Emmet", Especialidad.TANGO);
        Tecnico tecnico1=new Tecnico("Wozniak Steve", Especialidad.RHEL);
        
        //Se llama a método para crear técnicos en persistencia
        controlTecnico.crearTecnico(tecnico0);
        controlTecnico.crearTecnico(tecnico1);*/
        
        
    }
}
