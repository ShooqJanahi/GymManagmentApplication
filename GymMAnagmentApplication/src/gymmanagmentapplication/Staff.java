/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentapplication;

/**
 *aaa
 * @author sara
 */
public class Staff extends Member{
    
    private String position;
    private String department;

    public Staff(int id, String fName, String surName, String membership, String address, String dateBirth, int phone, String gender, String position, String department) {
        super(id, fName, surName, membership, address, dateBirth, phone, gender);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString()+ " position=" + position + ", department=" + department + '}'+"\n";
    }
     
}
