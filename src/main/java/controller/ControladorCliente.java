
package controller;

import model.Cliente;
import persistencia.ControladoraPersistencia;

public class ControladorCliente {
    //Clase controladora para llmar a los métodos de la controladora de Persistencia
    ControladoraPersistencia controlPersist=new ControladoraPersistencia();
    
    public void crearCliente(Cliente cliente){
      controlPersist.crearAlumno(cliente);
    }
}
