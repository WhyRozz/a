/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bkpms2.s2gnjl;

/**
 *
 * @author User
 */
public class person_3a {

    String fName;
    String lName;
    String stuId;
    String stuStatus;
    
    public person_3a(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    
    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
    
    public static void main(String[] args) {
        person_3a student = new person_3a("Lisa", "Palombo", "123456789", "Active");

        student.displayInfo();
    }
    
}
