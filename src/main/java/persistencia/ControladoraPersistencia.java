
package persistencia;

import model.Cliente;
import model.Tecnico;

/*controla cada una de las instancias de la JpaController 
para cada clase Modelo (Cliente, Incidente, etc)*/
public class ControladoraPersistencia {
  
    ClienteJpaController clienteJpa=new ClienteJpaController();
    TecnicoJpaController tecnicoJpa=new TecnicoJpaController();

    public void crearAlumno(Cliente cliente) {
       clienteJpa.create(cliente);
    }

    public void crearTecnico(Tecnico tecnico) {
        tecnicoJpa.create(tecnico);
    }
    
}
