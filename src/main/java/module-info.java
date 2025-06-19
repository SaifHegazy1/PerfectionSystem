module com.example.perfectionsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.perfectionsystem to javafx.fxml;
    exports com.example.perfectionsystem;
    exports com.example.perfectionsystem.Controllers;
    exports com.example.perfectionsystem.Views;
    exports com.example.perfectionsystem.Models;
    exports com.example.perfectionsystem.Controllers.Accountant;
    exports com.example.perfectionsystem.Controllers.Admin;
}