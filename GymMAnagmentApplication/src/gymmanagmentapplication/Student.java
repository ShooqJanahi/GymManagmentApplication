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
public class Student extends Member{
    
    private String course;
    private String team;

    public Student(int id, String fName, String surName, String membership, String address, String dateBirth, int phone, String gender, String course, String team) {
        super(id, fName, surName, membership, address, dateBirth, phone, gender);
        this.course = course;
        this.team = team;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" + super.toString()+ ", course=" + course + ", team=" + team + '}' + "\n";
    }
     
}
