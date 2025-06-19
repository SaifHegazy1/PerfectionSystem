package com.example.perfectionsystem.Views;

import com.example.perfectionsystem.Controllers.Accountant.AccountantController;
import com.example.perfectionsystem.Controllers.Admin.AdminController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    private AccountType loginAccountType;



    private final ObjectProperty<AccountantMenuOptions> accountantSelectedMenuItem;
    private AnchorPane registrationView;
    private AnchorPane examView;
    private AnchorPane handInView;
    private AnchorPane dashboardView;
    public ViewFactory(){
        this.loginAccountType=AccountType.ACCOUNTANT;
        this.accountantSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem=new SimpleObjectProperty<>();
    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }



    public ObjectProperty<AccountantMenuOptions> getAccountantSelectedMenuItem(){
        return accountantSelectedMenuItem;
    }
public AnchorPane getRegistrationView(){
    if(registrationView==null){
        try{
            registrationView=new FXMLLoader(getClass().getResource("/Fxml/Accountant/Registration.fxml")).load();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        return registrationView;
}
    public AnchorPane getExamView(){
        if(examView==null){
            try{
                examView=new FXMLLoader(getClass().getResource("/Fxml/Accountant/Exam.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return examView;
    }
    public AnchorPane getHandInView(){
        if(handInView==null){
            try{
                handInView=new FXMLLoader(getClass().getResource("/Fxml/Accountant/HandIn.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return handInView;
    }
    public AnchorPane getDashboardView(){
        if(dashboardView==null){
            try{
                dashboardView=new FXMLLoader(getClass().getResource("/Fxml/Accountant/Dashboard.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

public void showAccountantWindow(){
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Accountant/Accountant.fxml"));
    AccountantController accountantController = new AccountantController();
    loader.setController(accountantController);
    Scene scene =null;
    try{
        scene=new Scene(loader.load());
    }catch(Exception e ){
        e.printStackTrace();
    }
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
    stage.setResizable(false);
    stage.setTitle("Perfection System");
    stage.show();

}
private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem;
    private AnchorPane adminstrationView;
    private AnchorPane bookletsView;
    private AnchorPane employeesView;
    private AnchorPane systemUsersView;
    private AnchorPane logsView;
    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem(){
        return adminSelectedMenuItem;
    }
    public AnchorPane getAdminstrationView(){
        if(adminstrationView==null){
            try{
                adminstrationView=new FXMLLoader(getClass().getResource("/Fxml/Admin/Adminstration.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return adminstrationView;
    }
    public AnchorPane getBookletsView(){
        if(bookletsView==null){
            try{
                bookletsView=new FXMLLoader(getClass().getResource("/Fxml/Admin/Booklets.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return bookletsView;
    }
    public AnchorPane getEmployeesView(){
        if(employeesView==null){
            try{
                employeesView=new FXMLLoader(getClass().getResource("/Fxml/Admin/Employees.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return employeesView;
    }
    public AnchorPane getSystemUsersView(){
        if(systemUsersView==null){
            try{
                systemUsersView=new FXMLLoader(getClass().getResource("/Fxml/Admin/SystemUsers.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return systemUsersView;
    }
    public AnchorPane getLogsView(){
        if(logsView==null){
            try{
                logsView=new FXMLLoader(getClass().getResource("/Fxml/Admin/Logs.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return logsView;
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        Scene scene =null;
        try{
            scene=new Scene(loader.load());
        }catch(Exception e ){
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
        stage.setResizable(false);
        stage.setTitle("Perfection System");
        stage.show();

    }

public void showLoginWindow(){
    FXMLLoader loader=new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
    Scene scene=null;
try{
    scene=new Scene(loader.load());
}catch (Exception e){
e.printStackTrace();
}
Stage stage = new Stage();
stage.setScene(scene);
stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Images/icon.png"))));
stage.setResizable(false);
stage.setTitle("Perfection System");
stage.show();
}
public void closeStage(Stage stage){
    stage.close();
}
}
