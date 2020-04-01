package com.company;

public class User {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean guestAccount;

    public User(String email) {
        this.email = email;
        this.guestAccount = false;
    }

    public User(String name, String lastName, String email, String password, User u1) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.guestAccount = false;
    }

    public User(User u, String name, String lastName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.guestAccount = true;
    }

    public boolean isGuestAccount() {
        return guestAccount;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

}
