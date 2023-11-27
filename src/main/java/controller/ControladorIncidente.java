
package controller;

import java.util.List;
import model.Incidente;
import persistenceJPA.ControladoraPersistencia;
import persistenceJPA.exceptions.NonexistentEntityException;


public class ControladorIncidente {
  
    ControladoraPersistencia controlPersist= ControladoraPersistencia.getInstance();
    
    //Metodos Incidentes
    public void crearIncidente(Incidente incidente){
        controlPersist.crearIncidente(incidente);
    }
    
    public void eliminarIncidente(int id) throws NonexistentEntityException,IllegalStateException{
        controlPersist.eliminarIncidente(id);
    }
    
    public void editarIncidente(Incidente incidente) throws Exception{
        controlPersist.editarIncidente(incidente);
    }
    
    public Incidente buscarIncidentePorId(int id){
        return controlPersist.buscarIncidentePorId(id);
    }
    
    public List<Incidente> listarIncidentes(){
        return controlPersist.listarincidentes();
    }
   
}
