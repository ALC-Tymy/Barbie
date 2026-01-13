package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Type;

import java.util.List;

public interface ServiceType {
    List<Type> getAll();

    void addType(Type type);

    Type getType(long id);

    void deleteType(long id);
}
