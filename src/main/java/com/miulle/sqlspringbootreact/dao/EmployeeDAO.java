package com.miulle.sqlspringbootreact.dao;

import java.util.List;

import com.miulle.sqlspringbootreact.modal.Employee;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
