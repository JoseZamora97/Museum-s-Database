package com.include.prac_distribuidos.Classes;


//import javax.persistence.Id;

import java.sql.Date;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/

// @Entity
public class Coin {

    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private long id = 1;
    private Type type;
    private int year;
    private String coinageCity;
    private Date acquisitionDate;
    private String status;
    private Provider provider;

    public Coin(){
    }

    public Coin(Type type, int year, String coinageCity, Date acquisitionDate, String status, Provider provider) {
        this.type = type;
        this.year = year;
        this.coinageCity = coinageCity;
        this.acquisitionDate = acquisitionDate;
        this.status = status;
        this.provider = provider;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoinageCity() {
        return coinageCity;
    }

    public void setCoinageCity(String coinageCity) {
        this.coinageCity = coinageCity;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
