package com.stephenWS.models;

public class User {

    private String userName;
    private String userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserType(String userType){
        this.userType = userType;
    }

    public String getUserType(){
        return userType;
    }
}
