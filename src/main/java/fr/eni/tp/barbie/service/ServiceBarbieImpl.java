package fr.eni.tp.barbie.service;

import fr.eni.tp.barbie.bo.Barbie;
import fr.eni.tp.barbie.repository.BarbieDao;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implémentation du service métier {@link ServiceBarbie}.
 * <p>
 * Cette classe fait le lien entre la couche contrôleur et la couche DAO
 * pour la gestion des objets {@link Barbie}.
 */
@Service
public class ServiceBarbieImpl implements ServiceBarbie {

    private BarbieDao barbieDao;

    /**
     * Constructeur avec injection du DAO.
     *
     * @param barbieDao le composant d'accès aux données des Barbies
     */
    public ServiceBarbieImpl(BarbieDao barbieDao) {
        this.barbieDao = barbieDao;
    }

    /**
     * Récupère toutes les Barbies.
     *
     * @return la liste de toutes les Barbies
     */
    @Override
    public List<Barbie> getAll() {
        return this.barbieDao.readBarbies();
    }

    /**
     * Ajoute une nouvelle Barbie.
     *
     * @param barbie la Barbie à ajouter
     */
    @Override
    public void addBarbie(Barbie barbie) {
        this.barbieDao.addBarbie(barbie);
    }

    /**
     * Récupère une Barbie à partir de son identifiant.
     *
     * @param id l'identifiant de la Barbie
     * @return la Barbie correspondante
     */
    @Override
    public Barbie getBarbie(long id) {
        return this.barbieDao.getBarbie(id);
    }

    /**
     * Supprime une Barbie à partir de son identifiant.
     *
     * @param id l'identifiant de la Barbie à supprimer
     * @return toujours {@code null}
     */
    @Override
    public @Nullable Object deleteBarbie(long id) {
        this.barbieDao.deleteBarbie(id);
        return null;
    }

    /**
     * Met à jour une Barbie existante.
     *
     * @param barbie la Barbie contenant les nouvelles informations
     */
    @Override
    public void updateBarbie(Barbie barbie) {
        this.barbieDao.updateBarbie(barbie);
    }
}
