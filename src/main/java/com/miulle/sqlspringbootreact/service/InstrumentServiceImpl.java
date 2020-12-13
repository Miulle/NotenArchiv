package com.miulle.sqlspringbootreact.service;

import com.miulle.sqlspringbootreact.modal.Instrument;
import com.miulle.sqlspringbootreact.dao.InstrumentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class InstrumentServiceImpl implements InstrumentService{

    @Autowired
    private InstrumentDAO instrumentDAO;

    @Transactional
    @Override
    public List<Instrument> get() {
        return instrumentDAO.get();
    }

    @Transactional
    @Override
    public Instrument get(int id) {
        return instrumentDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Instrument instrument) {
        instrumentDAO.save(instrument);
    }

    @Transactional
    @Override
    public void delete(int id) {
        instrumentDAO.delete(id);
    }
}
