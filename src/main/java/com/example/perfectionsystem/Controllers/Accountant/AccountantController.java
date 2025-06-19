package com.example.perfectionsystem.Controllers.Accountant;

import com.example.perfectionsystem.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountantController implements Initializable {
    public BorderPane accountant_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAccountantSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case Exam->accountant_parent.setCenter(Model.getInstance().getViewFactory().getExamView());
                case HandIn->accountant_parent.setCenter(Model.getInstance().getViewFactory().getHandInView());
                case Dashboard -> accountant_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                default -> accountant_parent.setCenter(Model.getInstance().getViewFactory().getRegistrationView());
            }
        });
    }
    }

