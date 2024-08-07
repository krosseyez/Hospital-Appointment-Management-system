package hoshom;

import enums.GenderType;
import java.util.*;

public class Patient extends person  {
   
    private GenderType gender;
    private String email;

    public Patient(String fName, String lName) {
        super(fName, lName);
    }

    public Patient() {
    }

    public Patient( String fName, String lName,GenderType gender, String email) {
        super(fName, lName);
        this.gender = gender;
        this.email = email;
    }

    public Patient(GenderType gender, String email) {
        this.gender = gender;
        this.email = email;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean authenticate(String enteredUsername, String enteredPassword) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}