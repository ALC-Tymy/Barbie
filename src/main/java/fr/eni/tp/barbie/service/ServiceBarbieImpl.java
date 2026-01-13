package fr.eni.tp.barbie.service;


import fr.eni.tp.barbie.bo.Barbie;
import fr.eni.tp.barbie.repository.BarbieDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBarbieImpl implements ServiceBarbie {
    BarbieDao barbieDao;

    public ServiceBarbieImpl(BarbieDao barbieDao) {
        this.barbieDao = barbieDao;
    }

    @Override
    public List<Barbie> getAll() {
        return this.barbieDao.readBarbies();
    }

    @Override
    public void addBarbie(Barbie barbie) {
        this.barbieDao.addBarbie(barbie);
    }

    @Override
    public Barbie getBarbie(long id) {
        return this.barbieDao.getBarbie(id);
    }

    @Override
    public void deleteBarbie(long id) {
        this.barbieDao.deleteBarbie(id);
    }

    @Override
    public void updateBarbie(Barbie barbie) {
        this.barbieDao.updateBarbie(barbie);
    }
}
