```java
package com.placement.app.repository;

import com.placement.app.model.Problem;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class ProblemRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public Problem save(Problem problem) {
        Session session = sessionFactory.getCurrentSession();
        session.save(problem);
        return problem;
    }

    public Problem get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Problem.class, id);
    }

    public List<Problem> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Problem> cq = cb.createQuery(Problem.class);
        cq.from(Problem.class);
        return session.createQuery(cq).getResultList();
    }

    public void update(Long id, Problem problem) {
        Session session = sessionFactory.getCurrentSession();
        Problem problemToUpdate = session.byId(Problem.class).load(id);
        problemToUpdate.setTitle(problem.getTitle());
        problemToUpdate.setDescription(problem.getDescription());
        session.flush();
    }

    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Problem problem = session.byId(Problem.class).load(id);
        session.delete(problem);
    }
}
```