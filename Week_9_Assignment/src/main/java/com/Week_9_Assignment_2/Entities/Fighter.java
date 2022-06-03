package com.Week_9_Assignment_2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fighter {


    @Id
    @Column
    private String name;
    private String style;
    private int weight;

    public Fighter() {
    }

    public Fighter(String name, String style, int weight) {
        this.name = name;
        this.style = style;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
