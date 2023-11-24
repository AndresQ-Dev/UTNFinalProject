package main;

import controller.ControladorCliente;
import controller.ControladorTecnico;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import model.Cliente;
import model.EnumTipoServicio;
import model.Especialidad;
import model.Tecnico;
import persistenceJPA.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class TicketManager {

    public static void main(String[] args) {

        ControladoraPersistencia controlpersis = ControladoraPersistencia.getInstance(); //Para crear tabla en base de datos
        ControladorCliente controlCliente = new ControladorCliente();//Instancia para hacer llamar métodos CRUD de "cliente"
        /*
        //se instancia un cliente...
        Cliente cliente0=new Cliente("2010500400", "HardSoft S.A.", true, EnumTipoServicio.TANGO, "Av. Cabildo 1035", "011456456", "hardsoft@hardsoft.com");
        Cliente cliente1=new Cliente("1622500500", "Java S.A.", true, EnumTipoServicio.RHEL, "Av. Siempre Viva 3055", "011999999", "java@java.com");
       
        //se llama el método crearCliente desde una instancia del controlador de Cliente y se le pasa el cliente creado...
        
        //Test Metodo CREATE
        //controlCliente.crearCliente(cliente0);
        //controlCliente.crearCliente(cliente1);
        
        //Test Metodo EDIT
        Cliente cliente3 = new Cliente(8, "1622500500", "Java JPA S.A.", true, EnumTipoServicio.MS_OFFICE, "Av. Siempre Viva 3055", "011999999", "javaSwing@java.com");
        try {
            controlCliente.actualizarCliente(cliente3);
        } catch (Exception ex) {
            System.out.println("No se encontro el cliente " + ex.getMessage());
        }

        //Test Metodo LIST        
        List<Cliente> listaClientes=controlCliente.listarClientes();
        listaClientes.forEach((cliente) -> System.out.println(cliente));
        
        //Test Metodo FindID
        Cliente clienteEncontrado=controlCliente.buscarClientePorId(3);
        if (clienteEncontrado!=null) {    
        System.out.println(Stream.of("Id: " +clienteEncontrado.getId(),"\nRazon Social: "+clienteEncontrado.getRazonSocial(),"\nTipo de Servicio Contratado: "+clienteEncontrado.getTipoServicio()).collect(Collectors.joining()));
        }else System.out.println("Nada por aca...");*/
        //Test SoftDelete
        controlCliente.eliminarCliente(89);

        

        //======================================================================
        /*
            //Se crea tabla Técnico
            ControladorTecnico controlTecnico=new ControladorTecnico();
            /*
            //se instancia a Técnicos
            Tecnico tecnico0=new Tecnico("Brown Emmet", Especialidad.TANGO);
            Tecnico tecnico1=new Tecnico("Wozniak Steve", Especialidad.RHEL);
            
            //Se llama a método para crear técnicos en persistencia
            controlTecnico.crearTecnico(tecnico0);
            controlTecnico.crearTecnico(tecnico1);
            
            //======================================================================
            //Se crea...*/
    }
}
