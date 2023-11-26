package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Tecnico;
import persistenceJPA.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author andres
 */
public class ControladorTecnico {

    /*
    //Clase controladora para llmar a los métodos de la controladora de Persistencia
    ControladoraPersistencia controlPersist=new ControladoraPersistencia();
    
    public void crearCliente(Cliente cliente){
      controlPersist.crearAlumno(cliente);
    }*/

    ControladoraPersistencia controlPersist = ControladoraPersistencia.getInstance();

    public void crearTecnico(Tecnico tecnico) {
            controlPersist.crearTecnico(tecnico);
    }

    public void actualizarTecnico(Tecnico tecnico) throws Exception {
        controlPersist.actualizarTecnico(tecnico);
    }

    public Tecnico buscarTecnicoPorID(int id) {
        return controlPersist.buscarTecnicoPorId(id);
    }
    
    public void eliminarTecnico(int id) throws NonexistentEntityException{
        controlPersist.eliminarTecnico(id);
    }
    
    public List<Tecnico> listarTecnicos(){
        return controlPersist.listarTecnico();
    }
}
