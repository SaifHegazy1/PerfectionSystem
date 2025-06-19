package com.example.perfectionsystem.Controllers;

import com.example.perfectionsystem.Models.Model;
import com.example.perfectionsystem.Views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_choiceBox;
    public TextField username_fld;
    public TextField password_fld;
    public Label error_lbl;
    public Button login_btn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      acc_choiceBox.setItems(FXCollections.observableArrayList(AccountType.ADMIN,AccountType.ACCOUNTANT));
        acc_choiceBox.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_choiceBox.valueProperty().addListener(observable -> Model.getInstance().getViewFactory().setLoginAccountType(acc_choiceBox.getValue()));
        login_btn.setOnAction(event ->onLogin());
        error_lbl.setText("");
    }
private void onLogin(){
    Stage stage =(Stage)error_lbl.getScene().getWindow();
    if(Model.getInstance().getViewFactory().getLoginAccountType()==AccountType.ACCOUNTANT){
            Model.getInstance().getViewFactory().showAccountantWindow();
            Model.getInstance().getViewFactory().closeStage(stage);
    }else{
        Model.getInstance().getViewFactory().showAdminWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }

    }
}
