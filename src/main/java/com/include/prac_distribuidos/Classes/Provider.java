package com.include.prac_distribuidos.Classes;


//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Provider {

    //@Id
    private String dni;
    private String name;
    private String address;
    private String email;
    private String phone;

    public Provider() {
    }

    public Provider(String dni, String name, String address, String email, String phone) {
        this.dni = dni;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
