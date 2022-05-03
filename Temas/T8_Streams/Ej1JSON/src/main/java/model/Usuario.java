package model;

import java.io.Serializable;

public class Usuario implements Serializable{

    private Object name, city, country, email, picture;

    public Usuario(){}

    public Usuario(Object name, Object city, Object country, Object email, Object picture) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.email = email;
        this.picture = picture;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name=" + name +
                ", city=" + city +
                ", country=" + country +
                ", email=" + email +
                ", picture=" + picture +
                '}';
    }
}