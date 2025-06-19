package com.example.perfectionsystem.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SystemUsersController implements Initializable {
    public SplitMenuButton systemUsersFilter_menu;
    public TextField systemUsersNameSearch_fld;
    public Button systemUserssearch_btn;
    public Button addUser_btn;
    public SplitMenuButton userAcess_menu;
    public TextField addUserName_fld;
    public PasswordField addUserPassword_fld;
    public ChoiceBox addUserType_choiceBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
