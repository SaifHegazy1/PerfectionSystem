package com.example.perfectionsystem.Models;

import com.example.perfectionsystem.Views.AccountType;
import com.example.perfectionsystem.Views.ViewFactory;

import java.sql.ResultSet;
import java.time.LocalDate;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DataBaseDriver dataBaseDriver;
private AccountType loginAccountType= AccountType.ACCOUNTANT;
private final Accountant accountant;
private boolean accountantLoginSuccessFlag;
private final Admin admin;
private boolean adminLoginSuccessFlag;
    private Model() {
        this.viewFactory = new ViewFactory();
        this.dataBaseDriver=new DataBaseDriver();
        this.accountant=new Accountant("");
        this.accountantLoginSuccessFlag=false;
        this.admin=new Admin("");
        this.adminLoginSuccessFlag=false;
    }
    public static synchronized Model getInstance(){
        if(model==null){
            model=new Model();
        }
        return model;
    }
    public ViewFactory getViewFactory() {
        return viewFactory;
    }
    public DataBaseDriver getDataBaseDriver(){
        return dataBaseDriver;}
    public AccountType getLoginAccountType() {
        return loginAccountType;
    }
    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    /*
    Accountant Method Section
     */
    public boolean getAccountantLoginSuccessFlag(){return this.accountantLoginSuccessFlag;}
    public void setAccountantLoginSuccessFlag(boolean flag){this.accountantLoginSuccessFlag=flag;}

    public Accountant getAccountant(){return accountant;}
    public void ecaluateAccountantCred(String username, String password){
        ResultSet resultSet= dataBaseDriver.getAccountantData(username, password);
        try {
            if(resultSet.isBeforeFirst()){
                this.accountant.nameProperty().set(resultSet.getString("username"));
                this.accountantLoginSuccessFlag=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    /*
    Admin Method Section
     */
    public boolean getAdminLoginSuccessFlag(){return this.adminLoginSuccessFlag;}
    public void setAdminLoginSuccessFlag(boolean flag){this.adminLoginSuccessFlag=flag;}

    public Admin getAdmin(){return admin;}
    public void ecaluateAdminCred(String username, String password){
        ResultSet resultSet= dataBaseDriver.getAdminData(username, password);
        try {
            if(resultSet.isBeforeFirst()){
                this.admin.nameProperty().set(resultSet.getString("username"));
                this.adminLoginSuccessFlag=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

