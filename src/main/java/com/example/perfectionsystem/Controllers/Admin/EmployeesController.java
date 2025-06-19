package com.example.perfectionsystem.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeesController implements Initializable {
    public SplitMenuButton employeeMangementFilter_menu;
    public Button employeeStartMonth_btn;
    public Button exportEmployee_btn;
    public SplitMenuButton employeeDailyAssignmentFilter_menu;
    public Button StartAssignment_btn;
    public Label employeeMonthlySalary_lbl;
    public Label employeeLectureValue_lbl;
    public TextField employeeName_fld;
    public TextField employeePhoneNo_fld;
    public TextField employeeMonthlySalary_fld;
    public TextField employeeLectureValue_fld;
    public ChoiceBox employeeType_choiceBox;
    public Button addEmployee_btn;
    public TextField EmployeeNameSearch_fld;
    public Button Employeesearch_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
