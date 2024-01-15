package de.aittr.g_31_2_restHW5.repositories;

import java.util.List;

public interface CrudRepository <T>{

    T save(T obj);

    List<T> getAll();
    T getById(int id);

    void upDate(T obj);

    void deleteById(int id);
}
