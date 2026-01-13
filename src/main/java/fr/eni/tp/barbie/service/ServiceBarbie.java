package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Barbie;

import java.util.List;

public interface ServiceBarbie {
    List<Barbie> getAll();

    void addBarbie(Barbie barbie);

    Barbie getBarbie(long id);

    void deleteBarbie(long id);

    void updateBarbie(Barbie barbie);
}
