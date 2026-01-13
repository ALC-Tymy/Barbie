package fr.eni.tp.barbie.service;

import fr.eni.tp.barbie.bo.Type;
import org.jspecify.annotations.Nullable;

import java.util.List;

/**
 * Interface définissant les services métiers liés à la gestion des {@link Type}.
 * <p>
 * Elle fournit les opérations principales de création, lecture et suppression
 * des types.
 */
public interface ServiceType {

    /**
     * Récupère la liste de tous les types.
     *
     * @return la liste des types
     */
    List<Type> getAll();

    /**
     * Ajoute un nouveau type.
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
     * @return toujours {@code null}
     */
    @Nullable Object deleteType(long id);
}
