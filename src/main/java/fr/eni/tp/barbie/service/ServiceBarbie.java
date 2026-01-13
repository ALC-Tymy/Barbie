package fr.eni.tp.barbie.service;

import fr.eni.tp.barbie.bo.Barbie;
import org.jspecify.annotations.Nullable;

import java.util.List;

/**
 * Interface définissant les services métiers liés à la gestion des {@link Barbie}.
 * <p>
 * Elle expose les opérations CRUD (Create, Read, Update, Delete)
 * pour manipuler les objets Barbie.
 */
public interface ServiceBarbie {

    /**
     * Récupère la liste de toutes les Barbies.
     *
     * @return la liste des Barbies
     */
    List<Barbie> getAll();

    /**
     * Ajoute une nouvelle Barbie.
     *
     * @param barbie la Barbie à ajouter
     */
    void addBarbie(Barbie barbie);

    /**
     * Récupère une Barbie à partir de son identifiant.
     *
     * @param id l'identifiant de la Barbie
     * @return la Barbie correspondante
     */
    Barbie getBarbie(long id);

    /**
     * Supprime une Barbie à partir de son identifiant.
     *
     * @param id l'identifiant de la Barbie à supprimer
     * @return toujours {@code null}
     */
    @Nullable Object deleteBarbie(long id);

    /**
     * Met à jour une Barbie existante.
     *
     * @param barbie la Barbie contenant les nouvelles informations
     */
    void updateBarbie(Barbie barbie);
}
