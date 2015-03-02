package org.cap1.model;

// Generated Mar 1, 2015 2:09:19 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Transaction.
 * @see org.cap1.model.Transaction
 * @author Hibernate Tools
 */
@Stateless
public class TransactionHome {

    private static final Log log = LogFactory.getLog(TransactionHome.class);
    
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void persist(Transaction transientInstance) {
        log.debug("persisting Transaction instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(Transaction persistentInstance) {
        log.debug("removing Transaction instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public Transaction merge(Transaction detachedInstance) {
        log.debug("merging Transaction instance");
        try {
            Transaction result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public Transaction findById(Integer id) {
        log.debug("getting Transaction instance with id: " + id);
        try {
            Transaction instance = entityManager.find(Transaction.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List<Transaction> getAllTransactions() {
        log.debug("getting all Transactions");
        try {
            return entityManager.createQuery("select t from Transaction t")
                    .getResultList();
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
}
