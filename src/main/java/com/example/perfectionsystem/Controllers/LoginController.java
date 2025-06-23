package com.example.perfectionsystem.Controllers;

import com.example.perfectionsystem.Models.Model;
import com.example.perfectionsystem.Views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_choiceBox;
    public TextField username_fld;
    public PasswordField password_fld;
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
        //Evaluate Client Login Credentials
        Model.getInstance().ecaluateAccountantCred(username_fld.getText(),password_fld.getText());
        if(Model.getInstance().getAccountantLoginSuccessFlag()){

            Model.getInstance().getViewFactory().showAccountantWindow();
            //Close the login stage
            Model.getInstance().getViewFactory().closeStage(stage);
        }else{
            username_fld.setText("");
            password_fld.setText("");
            error_lbl.setText("No Such Login Credentials");
        }

    }else{
        //Evaluate Client Login Credentials
        Model.getInstance().ecaluateAdminCred(username_fld.getText(),password_fld.getText());
        if(Model.getInstance().getAdminLoginSuccessFlag()){

            Model.getInstance().getViewFactory().showAdminWindow();
            //Close the login stage
            Model.getInstance().getViewFactory().closeStage(stage);
        }else{
            username_fld.setText("");
            password_fld.setText("");
            error_lbl.setText("No Such Login Credentials");
        }

    }

    }
}
