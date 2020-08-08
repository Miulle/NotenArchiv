package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miulle.sqlspringbootreact.modal.Konzert;

import javax.persistence.EntityManager;

@Repository
public class KonzertDAOImpl implements KonzertDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Konzert> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Konzert> query = currSession.createQuery("from Konzert", Konzert.class);
        List<Konzert> list = query.getResultList();
        return list;
    }

    @Override
    public List<Konzert> getForID(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Konzert> query = currSession.createQuery(" Select * from Konzert where konzertID=" + id, Konzert.class);
        List<Konzert> list = query.getResultList();
        return list;
    }

    @Override
    public Konzert get (int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Konzert emp = currSession.get(Konzert.class, id);
        return emp;
    }

    @Override
    public void save(Konzert konzert) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(konzert);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Konzert emp = currSession.get(Konzert.class, id);
        currSession.delete(emp);
    }
}
