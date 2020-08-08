package com.miulle.sqlspringbootreact.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miulle.sqlspringbootreact.modal.Komponist;

import javax.persistence.EntityManager;

@Repository
public class KomponistDAOImpl implements KomponistDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Komponist> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Komponist> query = currSession.createQuery("from Komponist", Komponist.class);
        List<Komponist> list = query.getResultList();
        return list;
    }

    @Override
    public Komponist get (int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Komponist emp = currSession.get(Komponist.class, id);
        return emp;
    }

    @Override
    public void save(Komponist komponist) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(komponist);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Komponist emp = currSession.get(Komponist.class, id);
        currSession.delete(emp);
    }
}
