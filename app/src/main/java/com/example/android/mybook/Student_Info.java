package com.example.android.mybook;

public class Student_Info {

    String name;
    String email;
    String ID;
    String password;

    public Student_Info(String name, String email, String ID, String password) {
        this.name = name;
        this.email = email;
        this.ID = ID;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }
}
