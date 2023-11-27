
package controller;

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
    
   
}
