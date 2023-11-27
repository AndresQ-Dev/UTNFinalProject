/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenceJPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Incidente;
import persistenceJPA.exceptions.NonexistentEntityException;

/**
 *
 * @author andres
 */
public class IncidenteJpaController implements Serializable {

    public IncidenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    //Constructor para usar método creados automáticamente...
    public IncidenteJpaController() {
        emf = Persistence.createEntityManagerFactory("persistenceUnit");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Incidente incidente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(incidente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Incidente incidente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            incidente = em.merge(incidente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = incidente.getIdIncidente();
                if (findIncidente(id) == null) {
                    throw new NonexistentEntityException("The incidente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Incidente incidente;
            try {
                incidente = em.getReference(Incidente.class, id);
                incidente.getIdIncidente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The incidente with id " + id + " no longer exists.", enfe);
            }
            em.remove(incidente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Incidente> findIncidenteEntities() {
        return findIncidenteEntities(true, -1, -1);
    }

    public List<Incidente> findIncidenteEntities(int maxResults, int firstResult) {
        return findIncidenteEntities(false, maxResults, firstResult);
    }

    private List<Incidente> findIncidenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Incidente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Incidente findIncidente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Incidente.class, id);
        } finally {
            em.close();
        }
    }

    public int getIncidenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Incidente> rt = cq.from(Incidente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
