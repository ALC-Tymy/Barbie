package fr.eni.tp.barbie.bo;

public class Barbie {
    private long id;
    private String name;
    private Type type;

    public Barbie() {
    }

    public Barbie(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Barbie(long id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Barbie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
