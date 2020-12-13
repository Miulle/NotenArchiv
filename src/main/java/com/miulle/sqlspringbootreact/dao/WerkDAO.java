package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Werk;

public interface WerkDAO {

    List<Werk> get();

    Werk get(int id);

    void save(Werk werk);

    void delete(int id);
}
