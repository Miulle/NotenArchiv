package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miulle.sqlspringbootreact.modal.Werkbesetzung;

import javax.persistence.EntityManager;

@Repository
public class WerkbesetzungDAOImpl implements WerkbesetzungDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Werkbesetzung> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Werkbesetzung> query = currSession.createQuery("from Werkbesetzung", Werkbesetzung.class);
        List<Werkbesetzung> list = query.getResultList();
        return list;
    }

    @Override
    public Werkbesetzung get (int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Werkbesetzung emp = currSession.get(Werkbesetzung.class, id);
        return emp;
    }

    @Override
    public void save(Werkbesetzung werkbesetzung) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(werkbesetzung);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Werkbesetzung emp = currSession.get(Werkbesetzung.class, id);
        currSession.delete(emp);
    }
}
