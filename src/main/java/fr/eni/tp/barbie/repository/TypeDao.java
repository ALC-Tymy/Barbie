package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Type;

import java.util.List;

/**
 * Interface DAO (Data Access Object) pour la gestion des entités {@link Type}.
 * <p>
 * Elle définit les opérations d'accès aux données (CRUD) pour les types.
 */
public interface TypeDao {

    /**
     * Récupère la liste de tous les types.
     *
     * @return la liste des types
     */
    List<Type> readTypes();

    /**
     * Ajoute un nouveau type en base de données.
     *
     * @param type le type à ajouter
     */
    void addType(Type type);

    /**
     * Récupère un type à partir de son identifiant.
     *
     * @param id l'identifiant du type
     * @return le type correspondant
     */
    Type getType(long id);

    /**
     * Supprime un type à partir de son identifiant.
     *
     * @param id l'identifiant du type à supprimer
     */
    void deleteType(long id);
}
