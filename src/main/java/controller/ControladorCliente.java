
package controller;

import java.util.List;
import model.Cliente;
import persistenceJPA.ControladoraPersistencia;
import persistenceJPA.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorCliente {
    //Clase controladora para llamar a los métodos de la controladora de Persistencia
    ControladoraPersistencia controlPersist= ControladoraPersistencia.getInstance();
    
    public void crearCliente(Cliente cliente){
      controlPersist.crearCliente(cliente);
    }
    
    public void actualizarCliente(Cliente cliente) throws Exception{
      controlPersist.actualizarCliente(cliente);
    }
    
    public List<Cliente> listarClientes(){
        return controlPersist.listarClientes();
    }
    
    public Cliente buscarClientePorId(int id){
        return controlPersist.buscarClientePorId(id);
    }
    
    public void eliminarCliente(int id) throws NonexistentEntityException{
        controlPersist.delete(id);
    }
}
