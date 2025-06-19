package com.example.perfectionsystem.Controllers.Admin;

import com.example.perfectionsystem.Models.Model;
import com.example.perfectionsystem.Views.AccountantMenuOptions;
import com.example.perfectionsystem.Views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button adminstration_btn;
    public Button booklets_btn;
    public Button employees_btn;
    public Button systemUsers_btn;
    public Button logs_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
        private void addListeners(){
            adminstration_btn.setOnAction(event -> onAdminstration());
            booklets_btn.setOnAction(event -> onBooklets());
            employees_btn.setOnAction(event -> onEmployees());
            systemUsers_btn.setOnAction(event -> onSystemUsers());
            logout_btn.setOnAction(event -> onLogout());
        }
        private void onAdminstration(){
            Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.Adminstration);
        }
        private void onBooklets(){
            Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.Booklets);
        }
        private void onEmployees(){
            Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.Employees);
        }
        private void onSystemUsers(){
            Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.SystemUsers);
        }
        private void onLogout(){
            Stage stage =(Stage)adminstration_btn.getScene().getWindow();
            Model.getInstance().getViewFactory().showLoginWindow();;
            Model.getInstance().getViewFactory().closeStage(stage);

        }
    }
