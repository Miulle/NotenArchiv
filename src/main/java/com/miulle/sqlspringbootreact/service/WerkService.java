package com.miulle.sqlspringbootreact.service;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Werk;

public interface WerkService {

    List<Werk> get();

    Werk get(int id);

    void save(Werk werk);

    void delete(int id);
}
