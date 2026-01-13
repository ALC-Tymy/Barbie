package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TypeDaoMock implements TypeDao {

    List<Type> list = new ArrayList<Type>();
    private static int index = 1;

    public TypeDaoMock() {
        list.add(new Type(1, "pyjama party"));
        list.add(new Type(2, "fée du logis"));
        list.add(new Type(3, "puberté"));
    }

    @Override
    public List<Type> readTypes() {
        return list;
    }

    @Override
    public void addType(Type type) {
        type.setId(index++);
        list.add(type);
    }

    @Override
    public Type getType(long id) {
        return list.stream()
                .filter(t -> t.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public void deleteType(long id) {
        Type type = getType(id);
        list.remove(type);
    }

}
