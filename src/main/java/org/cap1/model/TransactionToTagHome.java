package org.cap1.model;

// Generated Mar 1, 2015 2:09:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransactionToTag.
 * @see org.cap1.model.TransactionToTag
 * @author Hibernate Tools
 */
@Stateless
public class TransactionToTagHome {

    private static final Log log = LogFactory
            .getLog(TransactionToTagHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(TransactionToTag transientInstance) {
        log.debug("persisting TransactionToTag instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(TransactionToTag persistentInstance) {
        log.debug("removing TransactionToTag instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public TransactionToTag merge(TransactionToTag detachedInstance) {
        log.debug("merging TransactionToTag instance");
        try {
            TransactionToTag result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public TransactionToTag findById(Integer id) {
        log.debug("getting TransactionToTag instance with id: " + id);
        try {
            TransactionToTag instance = entityManager.find(
                    TransactionToTag.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
