package fr.eni.tp.barbie.repository;


import fr.eni.tp.barbie.bo.Type;

import java.util.List;

public interface TypeDao {
    public List<Type> readTypes();

    void addType(Type type);

    Type getType(long id);

    void deleteType(long id);
}
