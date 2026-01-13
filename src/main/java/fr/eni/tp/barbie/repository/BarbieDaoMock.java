package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Barbie;
import fr.eni.tp.barbie.bo.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BarbieDaoMock implements BarbieDao {

    List<Barbie> list = new ArrayList<Barbie>();
    private static int index = 4;

    public BarbieDaoMock() {
        list.add(new Barbie(1, "Brenda", new Type(1, "pyjama party")));
        list.add(new Barbie(2, "Tyra", new Type(2, "fée du logis")));
        list.add(new Barbie(3, "Amanda", new Type(3, "puberté")));
    }

    @Override
    public List<Barbie> readBarbies() {
        return list;
    }

    @Override
    public void addBarbie(Barbie barbie) {
        barbie.setId(index++);
        list.add(barbie);
    }

    @Override
    public Barbie getBarbie(long id) {
        return list.stream()
                .filter(b -> b.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public void deleteBarbie(long id) {
        Barbie barbie = getBarbie(id);
        list.remove(barbie);
    }

    @Override
    public void updateBarbie(Barbie barbie) {
        deleteBarbie(barbie.getId());
        list.add(barbie);
    }

}
