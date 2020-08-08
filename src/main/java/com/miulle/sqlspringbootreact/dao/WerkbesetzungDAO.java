package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Werkbesetzung;

public interface WerkbesetzungDAO {

    List<Werkbesetzung> get();

    Werkbesetzung get(int id);

    void save(Werkbesetzung werkbesetzung);

    void delete(int id);
}
