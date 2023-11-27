
package controller;

import model.Incidente;
import persistenceJPA.ControladoraPersistencia;


public class ControladorIncidente {
  
    ControladoraPersistencia controlPersist= ControladoraPersistencia.getInstance();
    
    //Metodos Incidentes
    public void crearIncidente(Incidente incidente){
        controlPersist.crearIncidente(incidente);
    }
    
   
}
