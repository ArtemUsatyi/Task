package BankingSystem;

public class Person {
    private String name;
    private String surName;
    private String numberPhone;

    public Person(String name, String surName, String numberPhone) {
        this.name = name;
        this.surName = surName;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
