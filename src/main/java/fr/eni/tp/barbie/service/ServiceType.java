package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Type;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ServiceType {
    List<Type> getAll();

    void addType(Type type);

    Type getType(long id);

    @Nullable Object deleteType(long id);
}
