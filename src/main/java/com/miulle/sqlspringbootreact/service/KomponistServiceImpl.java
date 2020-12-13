package com.miulle.sqlspringbootreact.service;

import com.miulle.sqlspringbootreact.modal.Komponist;
import com.miulle.sqlspringbootreact.dao.KomponistDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@Service
public class KomponistServiceImpl implements KomponistService{

    @Autowired
    private KomponistDAO komponistDAO;

    @Transactional
    @Override
    public List<Komponist> get() {
        return komponistDAO.get();
    }

    @Transactional
    @Override
    public Komponist get(int id) {
        return komponistDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Komponist komponist) {
        komponistDAO.save(komponist);
    }

    @Transactional
    @Override
    public void delete(int id) {
        komponistDAO.delete(id);
    }
}
