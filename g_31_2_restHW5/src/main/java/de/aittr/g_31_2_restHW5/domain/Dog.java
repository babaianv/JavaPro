package de.aittr.g_31_2_restHW5.domain;

import java.util.Objects;

public class Dog {

    private int id;
    private String breed;
    private String color;
    private double weight;

    public Dog() {
    }

    public Dog(String breed, String color, double weight) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return id == dog.id && Double.compare(dog.weight, weight) == 0 && Objects.equals(breed, dog.breed) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, breed, color, weight);
    }

    @Override
    public String toString(){
        return String.format("Собака: ИД - %d, порода - %s, цвет - %s, вес - %.3f", id,breed, color, weight);
    }
}
