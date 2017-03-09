package org.generaltune.dao;

import org.generaltune.model.Employee;

import java.io.Serializable;

/**
 * Created by zhumin on 2017/3/8.
 */
public interface EmployeeDao {

    Serializable save(Employee employee);

    Employee findById(Serializable id);

}

