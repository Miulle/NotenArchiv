package com.miulle.sqlspringbootreact.service;

import com.miulle.sqlspringbootreact.modal.Konzert;
import com.miulle.sqlspringbootreact.dao.KonzertDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class KonzertServiceImpl implements KonzertService{

    @Autowired
    private KonzertDAO konzertDAO;

    @Transactional
    @Override
    public List<Konzert> get() {
        return konzertDAO.get();
    }

    @Transactional
    @Override
    public List<Konzert> getForID(int id) {
        return konzertDAO.getForID(id);
    }

    @Transactional
    @Override
    public Konzert get(int id) {
        return konzertDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Konzert konzert) {
        konzertDAO.save(konzert);
    }

    @Transactional
    @Override
    public void delete(int id) {
        konzertDAO.delete(id);
    }
}
