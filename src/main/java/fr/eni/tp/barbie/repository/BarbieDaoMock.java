package fr.eni.tp.barbie.repository;

import fr.eni.tp.barbie.bo.Barbie;
import fr.eni.tp.barbie.bo.Type;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation mock du {@link BarbieDao}.
 * <p>
 * Cette classe simule une base de données en mémoire à l'aide d'une liste.
 * Elle est utilisée principalement à des fins de tests ou d'apprentissage.
 */
@Repository
public class BarbieDaoMock implements BarbieDao {

    /**
     * Liste simulant la table des Barbies.
     */
    private List<Barbie> list = new ArrayList<>();

    /**
     * Index utilisé pour générer les identifiants des nouvelles Barbies.
     */
    private static int index = 4;

    /**
     * Constructeur initialisant des données de démonstration.
     */
    public BarbieDaoMock() {
        list.add(new Barbie(1, "Brenda", new Type(1, "pyjama party")));
        list.add(new Barbie(2, "Tyra", new Type(2, "fée du logis")));
        list.add(new Barbie(3, "Amanda", new Type(3, "puberté")));
    }

    /**
     * Récupère toutes les Barbies.
     *
     * @return la liste des Barbies
     */
    @Override
    public List<Barbie> readBarbies() {
        return list;
    }

    /**
     * Ajoute une nouvelle Barbie dans la liste.
     * Un identifiant est généré automatiquement.
     *
     * @param barbie la Barbie à ajouter
     */
    @Override
    public void addBarbie(Barbie barbie) {
        barbie.setId(index++);
        list.add(barbie);
    }

    /**
     * Recherche une Barbie par son identifiant.
     *
     * @param id l'identifiant recherché
     * @return la Barbie correspondante ou {@code null} si non trouvée
     */
    @Override
    public Barbie getBarbie(long id) {
        return list.stream()
                .filter(b -> b.getId() == id)
                .findAny()
                .orElse(null);
    }

    /**
     * Supprime une Barbie à partir de son identifiant.
     *
     * @param id l'identifiant de la Barbie à supprimer
     */
    @Override
    public void deleteBarbie(long id) {
        Barbie barbie = getBarbie(id);
        list.remove(barbie);
    }

    /**
     * Met à jour une Barbie existante.
     *
     * @param barbie la Barbie contenant les nouvelles informations
     */
    @Override
    public void updateBarbie(Barbie barbie) {
        deleteBarbie(barbie.getId());
        list.add(barbie);
    }
}
