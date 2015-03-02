package org.cap1.model;

// Generated Mar 1, 2015 2:09:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TransactionToCategory.
 * @see org.cap1.model.TransactionToCategory
 * @author Hibernate Tools
 */
@Stateless
public class TransactionToCategoryHome {

    private static final Log log = LogFactory
            .getLog(TransactionToCategoryHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(TransactionToCategory transientInstance) {
        log.debug("persisting TransactionToCategory instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(TransactionToCategory persistentInstance) {
        log.debug("removing TransactionToCategory instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public TransactionToCategory merge(TransactionToCategory detachedInstance) {
        log.debug("merging TransactionToCategory instance");
        try {
            TransactionToCategory result = entityManager
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public TransactionToCategory findById(Integer id) {
        log.debug("getting TransactionToCategory instance with id: " + id);
        try {
            TransactionToCategory instance = entityManager.find(
                    TransactionToCategory.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
