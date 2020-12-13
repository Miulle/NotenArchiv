package com.miulle.sqlspringbootreact.service;

import com.miulle.sqlspringbootreact.dao.WerkbesetzungDAO;
import com.miulle.sqlspringbootreact.modal.Werkbesetzung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class WerkbesetzungServiceImpl implements WerkbesetzungService{

    @Autowired
    private WerkbesetzungDAO werkbesetzungDAO;

    @Transactional
    @Override
    public List<Werkbesetzung> get() {
        return werkbesetzungDAO.get();
    }

    @Transactional
    @Override
    public Werkbesetzung get(int id) {
        return werkbesetzungDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Werkbesetzung werkbesetzung) {
        werkbesetzungDAO.save(werkbesetzung);
    }

    @Transactional
    @Override
    public void delete(int id) {
        werkbesetzungDAO.delete(id);
    }
}
