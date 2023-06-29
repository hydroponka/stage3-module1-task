package com.mjc.school.repository;

import java.util.List;

public interface Repository <T>{
    List<T> readAll();
    T readById(Long id);
    T create(T var1);
    T update(T var1);
    Boolean deleteById(T var1);
    Boolean ifExistById(T var1);

}
