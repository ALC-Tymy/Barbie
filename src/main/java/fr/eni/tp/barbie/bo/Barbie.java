package fr.eni.tp.barbie.bo;

/**
 * Classe métier représentant une Barbie.
 * <p>
 * Une Barbie est caractérisée par :
 * <ul>
 *     <li>un identifiant</li>
 *     <li>un nom</li>
 *     <li>un type</li>
 * </ul>
 */
public class Barbie {

    private long id;
    private String name;
    private Type type;

    /**
     * Constructeur par défaut.
     */
    public Barbie() {
    }

    /**
     * Constructeur avec nom et type.
     *
     * @param name le nom de la Barbie
     * @param type le type de la Barbie
     */
    public Barbie(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Constructeur complet.
     *
     * @param id   l'identifiant de la Barbie
     * @param name le nom de la Barbie
     * @param type le type de la Barbie
     */
    public Barbie(long id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * Retourne l'identifiant de la Barbie.
     *
     * @return l'id de la Barbie
     */
    public long getId() {
        return id;
    }

    /**
     * Définit l'identifiant de la Barbie.
     *
     * @param id le nouvel identifiant
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retourne le nom de la Barbie.
     *
     * @return le nom
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom de la Barbie.
     *
     * @param name le nouveau nom
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne le type de la Barbie.
     *
     * @return le type
     */
    public Type getType() {
        return type;
    }

    /**
     * Définit le type de la Barbie.
     *
     * @param type le nouveau type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Retourne une représentation textuelle de la Barbie.
     *
     * @return une chaîne décrivant la Barbie
     */
    @Override
    public String toString() {
        return "Barbie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
