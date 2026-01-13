package fr.eni.tp.barbie.repository;


import fr.eni.tp.barbie.bo.Barbie;

import java.util.List;

public interface BarbieDao {
    public List<Barbie> readBarbies();

    void addBarbie(Barbie barbie);

    Barbie getBarbie(long id);

    void deleteBarbie(long id);

    void updateBarbie(Barbie barbie);
}
