/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentapplication;

/**
 *
 * @author sara
 */
public class Employee {
    
    
   protected int id;
    protected String fName;
    protected String surName;
    protected String membership;
    protected String address;
    protected String dateBirth;
    protected int phone;
    protected String gender;
    
      public Employee(int id, String fName, String surName, String membership, String address, String dateBirth, int phone, String gender) {
        this.id = id;
        this.fName = fName;
        this.surName = surName;
        this.membership = membership;
        this.address = address;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.gender = gender;
    }

                                                                                                                                   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fName=" + fName + ", surName=" + surName + ", membership=" + membership + ", address=" + address + ", dateBirth=" + dateBirth + ", phone=" + phone + ", gender=" + gender + '}'+"\n";
    }    
}
