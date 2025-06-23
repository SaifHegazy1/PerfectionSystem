package com.example.perfectionsystem.Controllers.Accountant;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterationController implements Initializable {

    public Button startRegistration_btn;
    public Tab quickreg_tab;



    public Label lastPresence_lbl;

    public Label monthlyPayState_lbl;
    public Label monthlyPayPaid_lbl;
    public Label monthlyPayRemaining_lbl;
    public Label monthlyPayNote_lbl;

    public Label bookPayState_lbl;
    public Label bookPayPaid_lbl;
    public Label bookPayRemaining_lbl;
    public Label bookPayNote_lbl;

    public Button centerToOnline_btn;
    public Button onlineToCenter_btn;
    public Button changeGroup_btn;
    public Button removeStudent_btn;
    public Tab defaultreg_tab;

    public Tab addStudent_tab;
    public Button defualtRegister_btn;
    public Button quickRegister_btn;
    public Label registrationTime_value;
    public Label registrationTime_lbl;
    public TextField addstdName_fld;
    public TextField addstdPhoneNo_fld;
    public TextField addstdParentNo_fld;
    public Text addStudentID_lbl;
    public Label addStudentID_value;
    public ChoiceBox addstdGroup_choiceBox;
    public Text addStudentChoosegp_lbl;
    public Button addstudent_btn;
    public TextField RegIdSearch_fld;
    public TextField RegNameSearch_fld;
    public TextField RegPhoneNoSearch_fld;
    public Button Regsearch_btn;
    public Label RegId_lbl;
    public Label RegName_lbl;
    public Label RegStudentNo_lbl;
    public Label RegParentNo_lbl;
    public Button quickRegEditStudent_btn;
    public Button RegBookPay_btn;
    public Button RegmonthlyPay_btn;
    public SplitMenuButton registrationFilter_menu;
    public ChoiceBox onlineType_choiceBox;
    public TextField onlineName_fld;
    public TextField onlineStudentNo_fld;
    public TextField onlineParentNo_fld;
    public TextField onlineNotes_fld;
    public Button onlineDone_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
