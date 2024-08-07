package hoshom;

import enums.GenderType;
import java.util.*;

public class Doctor extends person  {
   
    private GenderType gender;
     private String username;
    private String password;

    public Doctor( String fName, String lName,GenderType gender, String username, String password) {
        super(fName, lName);
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

   
    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

 

    public Doctor(String fName, String lName) {
        super(fName, lName);
    }


  

  
     
       
             
 public String getUsername() {
    return username;
}


 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
          

    public String getfirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUserName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean authenticate(String enteredUsername, String enteredPassword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}