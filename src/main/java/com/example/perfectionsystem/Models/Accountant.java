package com.example.perfectionsystem.Models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Accountant {
    private final StringProperty name;

    public Accountant(String name) {
        this.name = new SimpleStringProperty(this,"Name",name);
    }
    public StringProperty nameProperty(){return name;}
}
