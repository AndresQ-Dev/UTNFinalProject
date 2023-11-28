package controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import persistenceJPA.ControladoraPersistencia;
import persistenceJPA.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorCliente {

    //Clase controladora para llamar a los métodos de la controladora de Persistencia
    ControladoraPersistencia controlPersist = ControladoraPersistencia.getInstance();

    public void crearCliente(Cliente cliente) throws SQLIntegrityConstraintViolationException {
        controlPersist.crearCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) throws Exception {
        controlPersist.actualizarCliente(cliente);
    }

    public List<Cliente> listarClientes() {
        return controlPersist.listarClientes();
    }

    public Cliente buscarClientePorId(int id) {
        return controlPersist.buscarClientePorId(id);
    }

    public void eliminarCliente(int id) {//Aplico captura de Excepciones varias...
        try {
            controlPersist.deleteCliente(id);
        } catch (NonexistentEntityException ex) {//si no existe...
            JOptionPane.showMessageDialog(null, "El Cliente no existe.");
        } catch (IllegalStateException ex) {//si ya esta dado de baja...
            JOptionPane.showMessageDialog(null, "El cliente ya se encuentra dado de baja.");
        } catch (Exception ex) {//cualquier otra Excepcion...
            JOptionPane.showMessageDialog(null, "Exception general" + ex.getMessage());
        }
    }

    //Método AdHoc para busqueda por Cuit
    public List<Cliente> buscarClientePorCuit(String cuit) {
        List<Cliente> resultadosBusqueda = new ArrayList<>();
// Obtengo la lista completa de Clientes para luego filtrar.
        List<Cliente> listaClientes = controlPersist.listarClientes();
        // Lambda para agregar coincidencias...
        listaClientes.stream()
                .filter(cliente -> cliente.getCuit().equals(cuit))
                .forEach(cliente -> resultadosBusqueda.add(cliente));

        return resultadosBusqueda;
    }
}
