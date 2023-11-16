
package controller;

import model.Tecnico;
import persistencia.ControladoraPersistencia;

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

    ControladoraPersistencia controlPersist=new ControladoraPersistencia();
    
    public void crearTecnico(Tecnico tecnico){
       controlPersist.crearTecnico(tecnico); 
    }
}
