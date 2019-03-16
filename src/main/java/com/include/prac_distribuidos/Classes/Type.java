package com.include.prac_distribuidos.Classes;


/*import javax.persistence.Entity;
import javax.persistence.Id;*/

import java.util.List;

/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/

//@Entity
public class Type {

    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int value;
    private String monetaryUnit;
    private int diameter;
    private List<String> metals;
    private String description;

    public Type() {}

    public Type(int value, String monetaryUnit, int diameter, List<String> metals, String description) {
        this.value = value;
        this.monetaryUnit = monetaryUnit;
        this.diameter = diameter;
        this.metals = metals;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMonetaryUnit() {
        return monetaryUnit;
    }

    public void setMonetaryUnit(String monetaryUnit) {
        this.monetaryUnit = monetaryUnit;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public List<String> getMetals() {
        return metals;
    }

    public void setMetals(List<String> metals) {
        this.metals = metals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
