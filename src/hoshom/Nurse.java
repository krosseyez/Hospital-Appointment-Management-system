package hoshom;

import java.util.*;

public class Nurse extends person  {

   
    private Department department;
    private String username;
    private String password;

    public Nurse(String fName, String lName, String password, String username, Department department) {
       super(fName, lName);
        this.department = department;
        this.password = password;
        this.username = username;
        
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }

}