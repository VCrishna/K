```java
package com.placement.app.repository;

import com.placement.app.model.Explore;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ExploreRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Explore> getAllExplores() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Explore", Explore.class).getResultList();
    }

    public Explore getExploreById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Explore.class, id);
    }

    public void saveOrUpdateExplore(Explore explore) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(explore);
    }

    public void deleteExplore(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Explore explore = session.get(Explore.class, id);
        if (explore != null) {
            session.delete(explore);
        }
    }
}
```