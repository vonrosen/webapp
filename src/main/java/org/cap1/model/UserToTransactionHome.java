package org.cap1.model;

// Generated Mar 1, 2015 2:09:19 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserToTransaction.
 * @see org.cap1.model.UserToTransaction
 * @author Hibernate Tools
 */
@Stateless
public class UserToTransactionHome {

    private static final Log log = LogFactory
            .getLog(UserToTransactionHome.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void persist(UserToTransaction transientInstance) {
        log.debug("persisting UserToTransaction instance");
        try {
            entityManager.persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void remove(UserToTransaction persistentInstance) {
        log.debug("removing UserToTransaction instance");
        try {
            entityManager.remove(persistentInstance);
            log.debug("remove successful");
        } catch (RuntimeException re) {
            log.error("remove failed", re);
            throw re;
        }
    }

    public UserToTransaction merge(UserToTransaction detachedInstance) {
        log.debug("merging UserToTransaction instance");
        try {
            UserToTransaction result = entityManager.merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public UserToTransaction findById(Integer id) {
        log.debug("getting UserToTransaction instance with id: " + id);
        try {
            UserToTransaction instance = entityManager.find(
                    UserToTransaction.class, id);
            log.debug("get successful");
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
}
