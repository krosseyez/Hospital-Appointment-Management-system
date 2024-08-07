/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoshom;

import java.util.*;

public abstract class person {

    private String fName;
    private String lName;

    public person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public person() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    


  

    public abstract boolean authenticate(String enteredUsername, String enteredPassword);
}
