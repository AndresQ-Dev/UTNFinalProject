
package persistencia;

import Model.Cliente;

/*controla cada una de las instancias de la JpaController 
para cada clase Modelo (Cliente, Incidente, etc)*/
public class ControladoraPersistencia {
  
    ClienteJpaController clienteJpa=new ClienteJpaController();

    public void crearAlumno(Cliente cliente) {
       clienteJpa.create(cliente);
    }
    
}
