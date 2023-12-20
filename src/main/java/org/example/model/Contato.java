package org.example.model;

public class Contato {

    private String name;
    private String email;
    public static  String COMPANY_USER = "girludev";
    public Contato(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        this.email = email;
        return false;
    }
}
