package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Barbie;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ServiceBarbie {
    List<Barbie> getAll();

    void addBarbie(Barbie barbie);

    Barbie getBarbie(long id);

    @Nullable Object deleteBarbie(long id);

    void updateBarbie(Barbie barbie);
}
