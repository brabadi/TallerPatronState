package co.unicauca.ordermanagement.domain;

/**
 * Representa un objeto de tipo plato
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
*/

public class Dish {
    private int id;
    private String name;
    private int price;
    
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
