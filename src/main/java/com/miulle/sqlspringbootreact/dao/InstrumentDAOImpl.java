package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miulle.sqlspringbootreact.modal.Instrument;

import javax.persistence.EntityManager;

@Repository
public class InstrumentDAOImpl implements InstrumentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Instrument> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Instrument> query = currSession.createQuery("from Instrument", Instrument.class);
        List<Instrument> list = query.getResultList();
        return list;
    }

    @Override
    public Instrument get (int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Instrument emp = currSession.get(Instrument.class, id);
        return emp;
    }

    @Override
    public void save(Instrument instrument) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(instrument);
    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Instrument emp = currSession.get(Instrument.class, id);
        currSession.delete(emp);
    }
}
