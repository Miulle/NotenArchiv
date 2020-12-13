package com.miulle.sqlspringbootreact.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.miulle.sqlspringbootreact.modal.Komponist;

public interface KomponistDAO {

    List<Komponist> get();

    Komponist get(int id);

    void save(Komponist komponist);

    void delete(int id);
}
