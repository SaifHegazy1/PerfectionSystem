package com.example.perfectionsystem.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminstrationController implements Initializable {
    public Label adminName_lbl;
    public Button StartLec_btn;
    public Button startMonth_btn;
    public Button startHandIn_btn;
    public Button uploadDataBase_btn;
    public Button backUp_btn;
    public Label syncCode_lbl;
    public SplitMenuButton monthReview_menu;
    public Button exportMonthReview_btn;
    public SplitMenuButton centerToOnline_menu;
    public Button exportCenterToOnline_btn;
    public Button exportWhatsappBot_btn;
    public SplitMenuButton whatsappBot_menu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
