package fr.eni.tp.barbie.service;

import fr.eni.tp.barbie.bo.Type;
import fr.eni.tp.barbie.repository.TypeDao;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implémentation du service métier {@link ServiceType}.
 * <p>
 * Cette classe assure la communication entre la couche contrôleur
 * et la couche DAO pour la gestion des objets {@link Type}.
 */
@Service
public class ServiceTypeImpl implements ServiceType {

    private TypeDao typeDao;

    /**
     * Constructeur avec injection du DAO.
     *
     * @param typeDao le composant d'accès aux données des types
     */
    public ServiceTypeImpl(TypeDao typeDao) {
        this.typeDao = typeDao;
    }

    /**
     * Récupère la liste de tous les types.
     *
     * @return la liste des types
     */
    @Override
    public List<Type> getAll() {
        return this.typeDao.readTypes();
    }

    /**
     * Ajoute un nouveau type.
     *
     * @param type le type à ajouter
     */
    @Override
    public void addType(Type type) {
        this.typeDao.addType(type);
    }

    /**
     * Récupère un type à partir de son identifiant.
     *
     * @param id l'identifiant du type
     * @return le type correspondant
     */
    @Override
    public Type getType(long id) {
        return this.typeDao.getType(id);
    }

    /**
     * Supprime un type à partir de son identifiant.
     *
     * @param id l'identifiant du type à supprimer
     * @return toujours {@code null}
     */
    @Override
    public @Nullable Object deleteType(long id) {
        this.typeDao.deleteType(id);
        return null;
    }
}
