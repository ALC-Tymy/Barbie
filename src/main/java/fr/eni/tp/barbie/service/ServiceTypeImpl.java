package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Type;
import fr.eni.tp.barbie.repository.TypeDao;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeImpl implements ServiceType {
    TypeDao typeDao;

    public ServiceTypeImpl(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    @Override
    public List<Type> getAll() {
        return this.typeDao.readTypes();
    }

    @Override
    public void addType(Type type) {
        this.typeDao.addType(type);
    }

    @Override
    public Type getType(long id) {

        return this.typeDao.getType(id);
    }

    @Override
    public @Nullable Object deleteType(long id) {
        this.typeDao.deleteType(id);
        return null;
    }
}
