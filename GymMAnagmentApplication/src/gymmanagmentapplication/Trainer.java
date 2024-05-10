/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentapplication;

import java.util.ArrayList;

/**
 *
 * @author sara
 */
public class Trainer extends Employee{
    
    private ArrayList<Member> members;

    public Trainer(int id, String fName, String surName, String membership, String address, String dateBirth, int phone, String gender) {
        super(id, fName, surName, membership, address, dateBirth, phone, gender);
        members = new ArrayList<Member>();
    }
    
              // Method for testing equality or not
    public boolean equality_Member(int id)
	{      
            boolean unique = true;
            for (Member m: members)
            {
                if(m.getId()== id)
                    unique = false;
            }
	    return unique;
	}
    
     // Method for adding a new member to a trainer
    public void add_Member(Member m)
	{
            if(equality_Member(m.getId()))
		{
                    members.add(m);
		    System.out.println("Operation of adding Member "+m.getId()+ " was successful");
		}
		else
			System.out.println(" ERROR, Cannot add a duplicated Member !");	
		}
			
		
	// Method for removing a Member from a trainer
    public void remove_Member(Member m)
        {
            if(members.isEmpty())
                System.out.println("ERROR, Empty group of member");
            else if(members.contains(m))
            {
                members.remove(m);
                System.out.println("Operation of removing Member "+m.getId()+ " was successful ");
            }
            else
                System.out.println("ERROR, Member to remove does not found !");	
	
	}  
    
    // method to display Members of trainer description
        @Override
      public String toString()
	{
            return this.getfName() + ": \n "+display_Member();
            
		
	} 
      
      // Method for displaying the descriptions of Members for a trainer
    public String display_Member()	
	{ 
            String display = "List of membbers : \n";
            if(members.isEmpty())
                display = "ERROR, Empty group of Members";
            else
            {
                for (Member m : members) { 	    	
                    display += "\n"+m.toString()+ "\n";
                }
            }
	     return display;
	    
	} 
    
}
