package com.miulle.sqlspringbootreact.service;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Konzert;

public interface KonzertService {

    List<Konzert> get();

    List<Konzert> getForID(int id);

    Konzert get(int id);

    void save(Konzert konzert);

    void delete(int id);
}
