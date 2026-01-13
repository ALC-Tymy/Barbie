package fr.eni.tp.barbie.bo;

/**
 * Classe métier représentant un type de Barbie.
 * <p>
 * Un type est caractérisé par :
 * <ul>
 *     <li>un identifiant</li>
 *     <li>un nom</li>
 * </ul>
 */
public class Type {

    private long id;
    private String name;

    /**
     * Constructeur par défaut.
     */
    public Type() {
    }

    /**
     * Constructeur avec le nom du type.
     *
     * @param name le nom du type
     */
    public Type(String name) {
        this.name = name;
    }

    /**
     * Constructeur complet.
     *
     * @param id   l'identifiant du type
     * @param name le nom du type
     */
    public Type(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Retourne l'identifiant du type.
     *
     * @return l'id du type
     */
    public long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du type.
     *
     * @param id le nouvel identifiant
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retourne le nom du type.
     *
     * @return le nom du type
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom du type.
     *
     * @param name le nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne une représentation textuelle du type.
     *
     * @return une chaîne décrivant le type
     */
    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
