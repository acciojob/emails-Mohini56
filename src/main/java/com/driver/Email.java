package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
      if(password.equals(oldPassword)) {
            if(isValidPass(newPassword)){
                this.password = newPassword;
            }
        }
    }
    private boolean isValidPass(String newPassword){
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;
        if(newPassword.length()<8) return false;
        for(int i =0;i<newPassword.length();i++){
            char val = newPassword.charAt(i);
            if(val>='A' && val<='Z'){
                containsUppercase = true;
            }
            else if(val>='0' && val<='9'){
                containsDigit = true;
            }
            else if(val>='a' && val<='z'){
                containsLowercase = true;
            }
            else{
                containsSpecialChar = true;
            }
        }
        if(containsSpecialChar && containsLowercase && containsUppercase && containsDigit){
            return true;
        }
        return false;
    }
}
