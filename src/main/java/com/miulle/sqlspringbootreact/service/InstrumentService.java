package com.miulle.sqlspringbootreact.service;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Instrument;

public interface InstrumentService {

    List<Instrument> get();

    Instrument get(int id);

    void save(Instrument instrument);

    void delete(int id);
}
