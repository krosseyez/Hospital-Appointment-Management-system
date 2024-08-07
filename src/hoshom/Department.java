package hoshom;

import java.util.*;
public class Department {
    private String name;
    private List <Doctor> doctors;
    private List <Nurse> nurses;
    
    public Department (String name){
    this.name= name;
    doctors= new ArrayList<>();
    nurses = new ArrayList<>();
    }
     
    public String getName() {
        return name;
    }
    
     public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    
     public Doctor getDoctor(String username) {
        for (Doctor doctor : doctors) {
            if (doctor.getUsername().equals(username)) {
                return doctor;
            }
        }
        return null;
    }
}