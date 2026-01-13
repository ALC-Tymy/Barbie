package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Barbie;

import java.util.List;

/**
 * Interface DAO (Data Access Object) pour la gestion des entités {@link Barbie}.
 * <p>
 * Elle définit les opérations d'accès aux données (CRUD) pour les Barbies.
 */
public interface BarbieDao {

    /**
     * Récupère la liste de toutes les Barbies.
     *
     * @return la liste des Barbies
     */
    List<Barbie> readBarbies();

    /**
     * Ajoute une nouvelle Barbie en base de données.
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
     */
    void deleteBarbie(long id);

    /**
     * Met à jour une Barbie existante.
     *
     * @param barbie la Barbie contenant les nouvelles informations
     */
    void updateBarbie(Barbie barbie);
}
