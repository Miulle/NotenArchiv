package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miulle.sqlspringbootreact.modal.Werk;

import javax.persistence.EntityManager;

@Repository
public class WerkDAOImpl implements WerkDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Werk> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Werk> query = currSession.createQuery("from Werk", Werk.class);
        List<Werk> list = query.getResultList();
        return list;
    }

    @Override
    public Werk get (int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Werk emp = currSession.get(Werk.class, id);
        return emp;
    }

    @Override
    public void save(Werk werk) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(werk);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Werk emp = currSession.get(Werk.class, id);
        currSession.delete(emp);
    }
}
