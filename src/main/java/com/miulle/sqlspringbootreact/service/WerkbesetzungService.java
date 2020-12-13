package com.miulle.sqlspringbootreact.service;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Werkbesetzung;

public interface WerkbesetzungService {

    List<Werkbesetzung> get();

    Werkbesetzung get(int id);

    void save(Werkbesetzung werkbesetzung);

    void delete(int id);
}
