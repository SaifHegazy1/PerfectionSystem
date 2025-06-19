package com.example.perfectionsystem.Controllers.Admin;

import com.example.perfectionsystem.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case Booklets -> admin_parent.setCenter(Model.getInstance().getViewFactory().getBookletsView());
                case Employees -> admin_parent.setCenter(Model.getInstance().getViewFactory().getEmployeesView());
                case SystemUsers -> admin_parent.setCenter(Model.getInstance().getViewFactory().getSystemUsersView());
                case Logs -> admin_parent.setCenter(Model.getInstance().getViewFactory().getLogsView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminstrationView());
            }
        });
    }
}
