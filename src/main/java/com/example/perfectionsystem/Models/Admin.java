package com.example.perfectionsystem.Models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Admin {
    private final StringProperty name;

    public Admin(String name) {
        this.name = new SimpleStringProperty(this,"Name",name);
    }
    public StringProperty nameProperty(){return name;}
}
