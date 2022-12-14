package classes;

import enams.Country;
import enams.Grocerys;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String firstName;
    private String surName;
    private LocalDate dateOfBirth;
    private double bankAccount;
    private Country country;
    private List<Grocerys> basket;

    public Person(String firstName, String surName, LocalDate dateOfBirth, double bankAccount, Country country,List<Grocerys> basket) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.bankAccount = bankAccount;
        this.country = country;
        this.basket = basket;
    }

    public List<Grocerys> getBasket() {
        return basket;
    }

    public void setBasket(List<Grocerys> basket) {
        this.basket = basket;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return " \n    Person : " +
                "\n firstName : " + firstName +
                "\n surName : " + surName +
                "\n dateOfBirth : " + dateOfBirth +
                "\n bankAccount :" + bankAccount +
                "\n country : " + country +
                "\n basket : " + basket +
                "\n=============================";
    }


}
