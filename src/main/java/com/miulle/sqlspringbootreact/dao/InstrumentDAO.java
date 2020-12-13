package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Instrument;

public interface InstrumentDAO {

    List<Instrument> get();

    Instrument get(int id);

    void save(Instrument instrument);

    void delete(int id);
}
