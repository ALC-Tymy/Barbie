package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation mock du {@link TypeDao}.
 * <p>
 * Cette classe simule une base de données en mémoire pour les {@link Type}
 * à l'aide d'une liste. Elle est utilisée pour les tests et l'apprentissage.
 */
@Repository
public class TypeDaoMock implements TypeDao {

    /**
     * Liste simulant la table des types.
     */
    private List<Type> list = new ArrayList<>();

    /**
     * Index utilisé pour générer les identifiants des nouveaux types.
     */
    private static int index = 1;

    /**
     * Constructeur initialisant des données de démonstration.
     */
    public TypeDaoMock() {
        list.add(new Type(1, "pyjama party"));
        list.add(new Type(2, "fée du logis"));
        list.add(new Type(3, "puberté"));
    }

    /**
     * Récupère tous les types.
     *
     * @return la liste des types
     */
    @Override
    public List<Type> readTypes() {
        return list;
    }

    /**
     * Ajoute un nouveau type dans la liste.
     * Un identifiant est généré automatiquement.
     *
     * @param type le type à ajouter
     */
    @Override
    public void addType(Type type) {
        type.setId(index++);
        list.add(type);
    }

    /**
     * Recherche un type par son identifiant.
     *
     * @param id l'identifiant recherché
     * @return le type correspondant ou {@code null} s'il n'existe pas
     */
    @Override
    public Type getType(long id) {
        return list.stream()
                .filter(t -> t.getId() == id)
                .findAny()
                .orElse(null);
    }

    /**
     * Supprime un type à partir de son identifiant.
     *
     * @param id l'identifiant du type à supprimer
     */
    @Override
    public void deleteType(long id) {
        Type type = getType(id);
        list.remove(type);
    }
}
