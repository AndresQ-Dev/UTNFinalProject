package main;

import controller.ControladorCliente;
import controller.ControladorIncidente;
import controller.ControladorTecnico;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
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

        //Tecnico tec1 = controlTecnico.buscarTecnicoPorID(1);
        /*Tecnico tec4 = controlTecnico.buscarTecnicoPorID(4);
            Cliente cli4 = controlCliente.buscarClientePorId(2);
            String detalle = "Ubuntu 22.04 no termina de cargar al inicio. Muestra pantalla negra despues de login...";
            Incidente incidenteA = new Incidente(cli1, tec1, EnumTipoServicio.LINUX_DESKTOP, detalle, Date.from(Instant.now()), true);
            controlIncidente.crearIncidente(incidenteA);
            String detalle = "Problema con usuario administrador registrado en Windows Server, no se reconoce...";
            Incidente incidenteC = new Incidente(cli4, tec4, EnumTipoServicio.WINDOWS_SERVER, detalle, Date.from(Instant.now()), true);
            controlIncidente.crearIncidente(incidenteC);
            //Prueba Metodo Eliminar
        try{
            controlIncidente.eliminarIncidente(6);
        } catch (persistenceJPA.exceptions.NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "No existe..."+ex.fillInStackTrace());
        }catch(IllegalStateException ise){
            JOptionPane.showMessageDialog(null, "Error: "+ise.fillInStackTrace());
        } 
        //Prueba Metodo Editar y Buscar por ID
        Incidente incidente1 = controlIncidente.buscarIncidentePorId(166);
        if (incidente1!=null) {  
        incidente1.setEstado(true);
        incidente1.setFechaAlta(new Date());
        try {
            controlIncidente.editarIncidente(incidente1);
        } catch (Exception ex) {
            Logger.getLogger(TicketManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "No existe... no se encuentra...");
        } 
        //Prueba Metodo Listar Incidentes
        List<Incidente> listadoIncidentes = controlIncidente.listarIncidentes();

        if (listadoIncidentes != null) {
            listadoIncidentes.forEach(inci -> {
                System.out.println("Incidente: " + inci.getIdIncidente()
                        + "\nCliente: " + inci.getCliente().getRazonSocial()
                        + "\nTécnico: " + inci.getTecnico().getApellidoNombre()
                        + "\nTipo de Servicio: " + inci.getCategoriaServicio()
                        + "\nDetalle: " + inci.getDetalle()
                        + "\nFecha de Alta: " + inci.getFechaAlta()
                        + "\nEstado: " + inci.isEstado() 
                        + "\n*******************************************");
            });
        } */
        //PRUEBAS CONCLUIDAS...
//        Tecnico tec1= controlTecnico.buscarTecnicoPorID(2);
//        Cliente cli1 = controlCliente.buscarClientePorId(1);
//        String detalle = "Despues de actualización de Windows 11 en Pc4 no se muestra menu inferior de inicio...";
//        
//        Incidente incidenteA = new Incidente(cli1, tec1, EnumTipoServicio.WINDOWS, detalle, Date.from(Instant.now()), true);
//        controlIncidente.crearIncidente(incidenteA);
//Incidente inci1=controlIncidente.buscarIncidentePorId(1);
//String obsTec="Se encontraron varias fallas en HDD, se cambia por un SSD.";
//inci1.setObservacionesTecnico(obsTec);
//inci1.setEstado(false);
//inci1.setFechaFinalizacion(Date.from(Instant.now()));
//
//        try {
//            controlIncidente.editarIncidente(inci1);
//        } catch (Exception ex) {
//            Logger.getLogger(TicketManager.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("paso algo..."+ex.getMessage());
//        }
        Incidente inciUpate = controlIncidente.buscarIncidentePorId(7);
        System.out.println("estado antes " + inciUpate.isEstado());
        try {
            controlIncidente.eliminarIncidente(7);
        } catch (persistenceJPA.exceptions.NonexistentEntityException ex) {
            Logger.getLogger(TicketManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(TicketManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Incidente despues = controlIncidente.buscarIncidentePorId(7);
        System.out.println("estado despues " + despues.isEstado());
    }
}
