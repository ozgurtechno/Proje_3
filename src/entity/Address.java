package entity;

import enums.City;

public class Address{

    // TODO Bu class a dokunmayiniz
    //----------------------Fields---------------------------------------------------------------------
    private String description;
    private City city;
    private String zipCode;

    // TODO Bu class a dokunmayiniz
    //----------------------Constructor ---------------------------------------------------------------------

    public Address(String description, City city, String zipCode) {
        this.description = description;
        this.city = city;
        this.zipCode = zipCode;
    }

    // TODO Bu class a dokunmayiniz
    //----------------------Getter and Setter ---------------------------------------------------------------------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
