package persistenceJPA;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.Tecnico;
import model.Incidente;
import persistencia.exceptions.NonexistentEntityException;

/*Controla cada una de las instancias de la JpaController 
para cada clase Modelo (Cliente, Incidente, etc)*/
public class ControladoraPersistencia {

// =====Pruebo Implementación de SINGLETON=====
    private final ClienteJpaController clienteJpa; //variable global para Controlador JPA
    private final TecnicoJpaController tecnicoJpa; //variable global para Controlador JPA
    private final IncidenteJpaController incidenteJpa; //variable global para Controlador JPA

// Instancia única Controlador de Persistencia
    private static final ControladoraPersistencia instanciaContPersistencia = new ControladoraPersistencia();
// EntityManagerFactory gestiona conexiones con la BD
    private final EntityManagerFactory emf;

// Constructor privado (no se acepta instanciacion externa a la clase)
    private ControladoraPersistencia() {
// una única instancia de EntityManagerFactory que toma la "Unidad unica de persitencia"
//creada por JPA automáticamente por parametro...
        emf = Persistence.createEntityManagerFactory("persistenceUnit");
        clienteJpa = new ClienteJpaController(emf);
        tecnicoJpa = new TecnicoJpaController(emf);
        incidenteJpa=new IncidenteJpaController(emf);
    }

// Método para obtener la instancia única de la clase
// En vez de llamar al contructor se llama la instancia creada internamente.    
    public static ControladoraPersistencia getInstance() {
        return instanciaContPersistencia;
    }

// Método para obtener un EntityManager de la instancia única
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

//===============Métodos para CLIENTE================//
    public void crearCliente(Cliente cliente) throws SQLIntegrityConstraintViolationException {
        clienteJpa.create(cliente);
    }

    public void actualizarCliente(Cliente cliente) throws Exception {
        clienteJpa.edit(cliente);
    }

//TODO cómo se implementa el "Soft Delete" en este contexto?
//se podría actualizar??? ;)
    public void deleteCliente(int id) throws NonexistentEntityException {
        clienteJpa.delete(id);
    }

    public List<Cliente> listarClientes() {
        return clienteJpa.findClienteEntities();
    }

    public Cliente buscarClientePorId(int id) {
        return clienteJpa.findCliente(id);
    }

//==============Metodos para TECNICO=================//
    public void crearTecnico(Tecnico tecnico) {
        tecnicoJpa.create(tecnico);
    }

    public void actualizarTecnico(Tecnico tecnico) throws Exception {
        tecnicoJpa.edit(tecnico);
    }

    public List<Tecnico> listarTecnico() {
        return tecnicoJpa.findTecnicoEntities();
    }

    public Tecnico buscarTecnicoPorId(int id) {
        return tecnicoJpa.findTecnico(id);
    }
    
    public void eliminarTecnico(int id) throws NonexistentEntityException{
        tecnicoJpa.deleteTecnico(id);
    }
    
    //==============Metodos para Incidente=================//
    public void crearIncidente(Incidente incidente){
      incidenteJpa.create(incidente);
    }
    
    public void eliminarIncidente(int id) throws persistenceJPA.exceptions.NonexistentEntityException,IllegalStateException{
        incidenteJpa.destroySoftIncident(id);
    }
    
    public void editarIncidente(Incidente incidente) throws Exception{
        incidenteJpa.edit(incidente);
    }
    
    public Incidente buscarIncidentePorId(int id){
        return incidenteJpa.findIncidente(id);
    }
    
    public List<Incidente> listarincidentes(){
        return incidenteJpa.findIncidenteEntities();
    }
}
