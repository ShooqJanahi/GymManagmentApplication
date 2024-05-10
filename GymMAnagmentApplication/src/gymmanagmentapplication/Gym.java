
package gymmanagmentapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author sara
 */
public class Gym {
    private String name;
    private ArrayList<Staff> staff;
    private ArrayList<Student> students;
    private ArrayList<Employee> employees;
    private ArrayList<Trainer> trainers;

    public Gym(String name) {
        this.name = name;
        staff = new ArrayList<Staff>();
        students = new ArrayList<Student>();
        employees = new ArrayList<Employee>();
        trainers = new ArrayList<Trainer>();
     }
    
   public boolean duplication_Trainer(int id)
	
	{      
            boolean unique = true;
            for (Trainer k: trainers)
            {
                if(k.getId() == id)
                    unique = false;
            }
	    return unique;
	}
     // Method for adding a new Trainer 
    public void add_Trainer(Trainer k)
	{
            
		if(duplication_Trainer(k.getId()))
		{
                    trainers.add(k);
		    System.out.println("Operation of adding Trainer was successful ");
		}
		else
			System.out.println(" ERROR ! , Cannot add a duplicated Trainer ! ");	
		}
			
    public void remove_Trainer(Trainer k)
        {
            if(trainers.isEmpty())
                System.out.println("ERROR, Empty group of Trainer");
            else if(trainers.contains(k))
            {
                trainers.remove(k);
                System.out.println("Operation of removing Trainer was successful");
            }
            else
                System.out.println("ERROR, Trainer to remove does not found in this group");	
	
	}    
	
    public String display_Trainer()	
	{ 
            String display = "List of Trainer : " + "\n";
            if(trainers.isEmpty())
                display =  display + "Empty group of Trainers ";
            else
            {
                for (Employee k : trainers) {
                 display =  display + "\t"+ k.getId() + "\t"+ k.getfName() + "\t"+ k.getSurName() + "\n";
                }             
            } 
            return display;
        }    
    
    public boolean duplication_Staff(int id)
	
	{      
            boolean unique = true;
            for (Staff k: staff)
            {
                if(k.getId() == id)
                    unique = false;
            }
	    return unique;
	}
    // Method for adding a new Staff
    public void add_Staff(Staff k)
	{
            
		if(duplication_Staff(k.getId()))
		{
                    staff.add(k);
		    System.out.println("Operation of adding Staff was successful ");
		}
		else
			System.out.println(" ERROR ! , Cannot add a duplicated Staff ! ");	
		}
			
    public void remove_Staff(Staff k)
        {
            if(staff.isEmpty())
                System.out.println("ERROR, Empty group of staff");
            else if(trainers.contains(k))
            {
                trainers.remove(k);
                System.out.println("Operation of removing Trainer was successful");
            }
            else
                System.out.println("ERROR, Trainer to remove does not found in this group");	
	
	}    
	
    public String display_Staff()	
	{ 
            String display = "List of Staff : " + "\n";
            if(trainers.isEmpty())
                display =  display + "Empty group of Staff ";
            else
            {
                for (Staff k : staff) {
                 display =  display + "\t"+ k.getId() + "\t"+ k.getfName() + "\t"+ k.getSurName() + "\n";
                }             
            } 
            return display;
        }   
        public boolean duplication_Student(int id)
	
	{      
            boolean unique = true;
            for (Student s: students)
            {
                if(s.getId() == id)
                    unique = false;
            }
	    return unique;
	}
    // Method for adding a new Staff
    public void add_Student(Student s)
	{
            
		if(duplication_Student(s.getId()))
		{
                    students.add(s);
		    System.out.println("Operation of adding Student was successful ");
		}
		else
			System.out.println(" ERROR ! , Cannot add a duplicated Student ! ");	
		}
			
    public void remove_Student(Student s)
        {
            if(students.isEmpty())
                System.out.println("ERROR, Empty group of Students");
            else if(students.contains(s))
            {
                students.remove(s);
                System.out.println("Operation of removing Student was successful");
            }
            else
                System.out.println("ERROR, Student to remove does not found in this group");	
	
	}    
	
    public String display_Student()	
	{ 
            String display = "List of Students : " + "\n";
            if(students.isEmpty())
                display =  display + "Empty group of Student ";
            else
            {
                for (Student s : students) {
                 display =  display + "\t"+ s.getId() + "\t"+ s.getfName() + "\t"+ s.getSurName() + "\n";
                }             
            } 
            return display;
        } 
    
    public boolean duplication_Employee(int id)
	
	{      
            boolean unique = true;
            for (Employee e: employees)
            {
                if(e.getId() == id)
                    unique = false;
            }
	    return unique;
	}
    // Method for adding a new Employee
    public void add_Employee(Employee e)
	{
            
		if(duplication_Employee(e.getId()))
		{
                    employees.add(e);
		    System.out.println("Operation of adding Employee was successful ");
		}
		else
		    System.out.println(" ERROR ! , Cannot add a duplicated Employee ! ");	
		}
			
    public void remove_Employee(Employee e)
        {
            if(employees.isEmpty())
                System.out.println("ERROR, Empty group of Employees");
            else if(employees.contains(e))
            {
                employees.remove(e);
                System.out.println("Operation of removing Employee was successful");
            }
            else
                System.out.println("ERROR, Employee to remove does not found in this group");	
	
	}    
	
    public String display_Employee()	
	{ 
            String display = "List of Employees : " + "\n";
            if(employees.isEmpty())
                display =  display + "Empty group of Employee ";
            else
            {
                for (Employee e : employees) {
                 display =  display + "\t"+ e.getId() + "\t"+ e.getfName() + "\t"+ e.getSurName() + "\n";
                }             
            } 
            return display;
        }
    
    public void saveGym(){
            try {
               PrintWriter pw = new PrintWriter(new File(".//gym.txt") );
               pw.write(getName() + "\n");
               pw.write("\n\n\n");
               pw.write(display_Trainer() + "\n");
               pw.write("\n\n\n");
               pw.write(display_Staff() + "\n");
               pw.write("\n\n\n");
               pw.write(display_Student() + "\n");
               pw.close();
              }catch (FileNotFoundException e)
                {
                    System.out.println("ERROR in File !!");
                }
        }
    public void setName(String name) {
        this.name = name;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Trainer> getTrainers() {
        return trainers;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    }
    
        
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              