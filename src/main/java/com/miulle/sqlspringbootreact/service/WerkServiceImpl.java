package com.miulle.sqlspringbootreact.service;

import com.miulle.sqlspringbootreact.modal.Werk;
import com.miulle.sqlspringbootreact.dao.WerkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class WerkServiceImpl implements WerkService{

    @Autowired
    private WerkDAO werkDAO;

    @Transactional
    @Override
    public List<Werk> get() {
        return werkDAO.get();
    }

    @Transactional
    @Override
    public Werk get(int id) {
        return werkDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Werk werk) {
        werkDAO.save(werk);
    }

    @Transactional
    @Override
    public void delete(int id) {
        werkDAO.delete(id);
    }
}
