package com.example.perfectionsystem.Controllers.Accountant;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HandInController implements Initializable {
    public TextField HandIdSearch_fld;
    public TextField HandNameSearch_fld;
    public TextField HandPhoneNoSearch_fld;
    public Button Handsearch_btn;
    public Label HandId_lbl;
    public Label HandName_lbl;
    public Label HandStudentNo_lbl;
    public Label HandParentNo_lbl;
    public Button quickHandEditStudent_btn;
    public Label handInState_lbl;
    public Label handPaymentState_lbl;
    public Label HandPayPaid_lbl;
    public Label handPayRemaining_lbl;
    public Label handPayNote_lbl;
    public Button quickHandPay_btn;
    public Button quickHandIn_btn;
    public Label handRemainingStock_lbl;
    public Label handRemainingStock_value;
    public Button quickHandReport_btn;
    public SplitMenuButton handFilter_menu;
    public Button defualtHand_btn;
    public Button startHandIn_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
