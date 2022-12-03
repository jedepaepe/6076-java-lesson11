package com.example.lesson11;

import java.time.Year;

public class Person {
    String identifier;
    String firstName;
    String lastName;
    String email;
    int birthYear;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean Equals(Person other) {
        return identifier.equals(other.identifier);
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public static void main(String[] args) {
        Person sophie = new Person();
        sophie.identifier = "95080612345";
        sophie.firstName = "Sophie";
        sophie.lastName = "Sava";
        sophie.email = "sophie.sava@belgium.be";
        sophie.birthYear = 1995;

        System.out.println(sophie.getFullName() + " a " + sophie.getAge() + " années");

        Person olivier = new Person();
        olivier.identifier = "98010154321";
        olivier.firstName = "Olivier";
        olivier.lastName = "Zatos";
        olivier.email = "olivier.zatos@belgium.be";
        olivier.birthYear = 1998;

        System.out.println(olivier.getFullName() + " a " + olivier.getAge() + " années");

        System.out.println("identiques? " + sophie.equals(olivier));
    }
}
