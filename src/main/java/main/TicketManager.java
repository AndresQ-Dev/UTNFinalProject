package main;

import controller.ControladorCliente;
import controller.ControladorIncidente;
import controller.ControladorTecnico;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import model.Cliente;
import model.EnumTipoServicio;
import model.Incidente;
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
            }else System.out.println("Nada por aca...");
            //Test SoftDelete
            controlCliente.eliminarCliente(80);*/

        //======================================================================
        //Se crea tabla Técnico
        ControladorTecnico controlTecnico = new ControladorTecnico();

        //Test Metodo CREATE
        //se instancia a Técnicos
        /*Tecnico tecnico0 = new Tecnico("18251212338", "Brown Emmet II", EnumTipoServicio.LINUX_DESKTOP, true, true);
            Tecnico tecnico1 = new Tecnico("20301234565", "Wozniak Steve", EnumTipoServicio.IMPRESION_COORPORATIVA, true, true);
            
            //Se llama a método para crear técnicos en persistencia
            controlTecnico.crearTecnico(tecnico0);
            controlTecnico.crearTecnico(tecnico1);*/
        //Test Metodo Edit
        /*Tecnico tecnicoExistente = controlTecnico.buscarTecnicoPorID(8);
            tecnicoExistente.setApellidoNombre("Brown Emmet IV");
            tecnicoExistente.setDisponibilidad(false);
            Tecnico newT=new Tecnico();
            newT.setApellidoNombre("Underwood Frank II");
            newT.setId(100);
            newT.setCuil("20251212338");
            newT.setCategoria(EnumTipoServicio.DATABASE_MANAGER);
            try {
            controlTecnico.actualizarTecnico(tecnicoExistente);
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el Tecnico");
            }*/
        //Test Metodo Eliminar
        /*try {
            controlTecnico.eliminarTecnico(150);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(TicketManager.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No existe...");
        } catch(IllegalStateException iee){
            JOptionPane.showMessageDialog(null, "ya está dado de baja...");
        }*/
        //Test Metodo Listar Tecnico
        /*List<Tecnico> listadoTecnicos = controlTecnico.listarTecnicos();
        System.out.println("=====LISTADO DE TECNICOS=====");
        if (listadoTecnicos != null) {
            listadoTecnicos.forEach(tec -> System.out.println("Id: "+tec.getId()
                    + "\n" + tec.getApellidoNombre() + "\n" + tec.getCuil()
                    + "\nCategoria: " + tec.getCategoria()
                    + "\nDisponibilidad: " + tec.isDisponibilidad()
                    + "\nEstado: "+tec.isEstado()+"\n"));
        }*/
        //======================================================================//
        //Tabla Incidentes
        //Prueba Metodo Crear
        ControladorIncidente controlIncidente = new ControladorIncidente();

        Cliente cliente1 = new Cliente("20150000008", "ProClean S.A.", true, EnumTipoServicio.TANGO, "Los Arayanes 1500", "26115456456", "proclean@proclean.com");
        Cliente cliente2 = new Cliente("20150000002", "Tech Solutions", true, EnumTipoServicio.WINDOWS_SERVER, "Tech Street 123, Tech City, Techland", "123456789", "info@techsolutions.com");
        Cliente cliente3 = new Cliente("20150000003", "Green Energy Corp.", true, EnumTipoServicio.LINUX_DESKTOP, "Green Avenue 789, Eco City, Greendland", "987654321", "info@greenenergy.com");
        Cliente cliente4 = new Cliente("20150000004", "Global Finance Ltd.", true, EnumTipoServicio.DATABASE_MANAGER, "Finance Street 456, Money City, Richland", "555888999", "info@globalfinance.com");
        Cliente cliente5 = new Cliente("20150000005", "Health Innovations Inc.", true, EnumTipoServicio.MS_OFFICE, "Health Street 567, Medi City, Healthyland", "777111333", "info@healthinnovations.com");
        Cliente cliente6 = new Cliente("20150000006", "Innovation Labs LLC", true, EnumTipoServicio.SERVER_DEBIAN, "Innovation Lane 789, Tech Hub, Innovationland", "999333555", "info@innovationlabs.com");

        /*controlCliente.crearCliente(cliente1);
        controlCliente.crearCliente(cliente2);
        controlCliente.crearCliente(cliente3);
        controlCliente.crearCliente(cliente4);
        controlCliente.crearCliente(cliente5);
        controlCliente.crearCliente(cliente6);*/
        Tecnico tec1 = controlTecnico.buscarTecnicoPorID(1);
        Cliente cli1=controlCliente.buscarClientePorId(3);
        String detalle = "Ubuntu 22.04 no termina de cargar al inicio. Muestra pantalla negra despues de login...";
        Incidente incidenteA = new Incidente(cli1, tec1, EnumTipoServicio.LINUX_DESKTOP, detalle, Date.from(Instant.now()), true);
        controlIncidente.crearIncidente(incidenteA);
    }
}
