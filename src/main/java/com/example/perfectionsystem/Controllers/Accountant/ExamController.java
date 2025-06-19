package com.example.perfectionsystem.Controllers.Accountant;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ExamController implements Initializable {
    public TextField examIdSearch_fld;
    public TextField examNameSearch_fld;
    public TextField examPhoneNoSearch_fld;
    public Button search_btn;
    public TextField examMark_fld;
    public Button examConfirm_btn;
    public Label examId_lbl;
    public Label examName_lbl;
    public Label examGroup_lbl;
    public Label examRegTime_lbl;
    public Label examMark_lbl;
    public Button startAssigning_btn;
    public CheckBox examShamal_checkbox;
    public Label quickExamError_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
