package model;

public class Car {
    private int id;
    private String name;
    private String prise;

    public Car() {
    }

    public Car(int id, String name, String prise) {
        this.id = id;
        this.name = name;
        this.prise = prise;
    }

    public Car(String name, String prise) {
        this.name = name;
        this.prise = prise;
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

    public String getPrise() {
        return prise;
    }

    public void setPrise(String prise) {
        this.prise = prise;
    }
}
