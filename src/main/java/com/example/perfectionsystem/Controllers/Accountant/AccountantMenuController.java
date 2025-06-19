package com.example.perfectionsystem.Controllers.Accountant;
import com.example.perfectionsystem.Models.Model;
import com.example.perfectionsystem.Views.AccountantMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
public class AccountantMenuController implements Initializable {
    public Button registration_btn;
    public Button exam_btn;
    public Button dashboard_btn;
    public Button handin_btn;
    public Button logout_btn;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
addListeners();
    }
    private void addListeners(){
        registration_btn.setOnAction(event -> onRegistration());
        exam_btn.setOnAction(event -> onExam());
        handin_btn.setOnAction(event -> onHandIn());
        dashboard_btn.setOnAction(event -> onDashboard());
        logout_btn.setOnAction(event -> onLogout());
    }
    private void onRegistration(){
        Model.getInstance().getViewFactory().getAccountantSelectedMenuItem().set(AccountantMenuOptions.Registration);
    }
    private void onExam(){
        Model.getInstance().getViewFactory().getAccountantSelectedMenuItem().set(AccountantMenuOptions.Exam);
    }
    private void onHandIn(){
        Model.getInstance().getViewFactory().getAccountantSelectedMenuItem().set(AccountantMenuOptions.HandIn);
    }
    private void onDashboard(){
        Model.getInstance().getViewFactory().getAccountantSelectedMenuItem().set(AccountantMenuOptions.Dashboard);
    }
    private void onLogout(){
        Stage stage =(Stage)registration_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().showLoginWindow();;
        Model.getInstance().getViewFactory().closeStage(stage);

    }
}
