package com.mjc.school.service.interfaces;

import java.util.List;

public interface Service<T> {
    List<T> readAll();
    T readById(Long id);
    T create(T var1);
    T update(T var1);
    Boolean deleteById(Long var1);

}
