package com.mjc.school.repository.interfaces;

import java.util.List;

public interface Repository <T>{
    List<T> readAll();
    T readById(Long id);
    T create(T var1);
    T update(T var1);
    Boolean deleteById(Long var1);
    Boolean ifExistById(Long var1);

}
