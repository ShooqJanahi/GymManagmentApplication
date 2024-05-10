
package gymmanagmentapplication;

/**
 *
 * @author sara
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


public class ManagmentGUI extends JFrame{
    
 // MEMBER (STAFF OR STUDENT )
   
   JLabel makeLabel = new JLabel ("ID Member: ");
   JTextField idTextField = new JTextField (5);
   
   JLabel makeLabe2 = new JLabel ("First Name: ");
   JTextField fNameTextField = new JTextField (5);

   JLabel makeLabe3 = new JLabel ("SurName: ");
   JTextField surNameTextField = new JTextField (5);
   
   JLabel makeLabe4 = new JLabel ("Membership: ");
   JTextField membershipTextField = new JTextField (5);
   
   JLabel makeLabe5 = new JLabel ("Address: ");
   JTextField addressTextField = new JTextField (5);
   
   JLabel makeLabe6 = new JLabel ("Date Of Birth: ");
   JTextField dateBirthTextField = new JTextField (5);
   
   JLabel makeLabe7 = new JLabel (" Phone: ");
   JTextField phoneTextField = new JTextField (5);
   
   JLabel makeLabe8 = new JLabel (" Gender: ");
   JTextField genderTextField = new JTextField (5);
   
   JLabel makeLabe9 = new JLabel (" Position: ");
   JTextField positionTextField = new JTextField (5);
   
   JLabel makeLabe10 = new JLabel (" Department: ");
   JTextField departmentTextField = new JTextField (5);
   
   JLabel makeLabe11 = new JLabel (" Course: ");
   JTextField courseTextField = new JTextField (5);
   
   JLabel makeLabe12 = new JLabel (" Team: ");
   JTextField teamTextField = new JTextField (5);

   JLabel memberLabel = new JLabel ("Select Member type: ");

   JRadioButton staffRadioButton     = new JRadioButton ("Staff");
   JRadioButton studentRadioButton   = new JRadioButton ("Student");
   ButtonGroup  MemberGroup      = new ButtonGroup ();


   JTextArea reportTextArea = new JTextArea ();
   JScrollPane scrollPane   = new JScrollPane (reportTextArea);
   JButton addButton        = new JButton ("Add");
   JButton displayButton    = new JButton ("Display");
   JButton exitButton       = new JButton ("Exit");
   JButton searchButton     = new JButton ("Search");
   JButton fileReadButton   = new JButton ("File Read");
   JButton fileWriteButton  = new JButton ("File Write");

   // EMployee // Trainer
   
     JLabel makeLabel01 = new JLabel ("ID Member: ");
   JTextField idEmpTextField = new JTextField (5);
   
   JLabel makeLabel02 = new JLabel ("First Name: ");
   JTextField fNameEmpTextField = new JTextField (5);

   JLabel makeLabel03 = new JLabel ("SurName: ");
   JTextField surNameEmpTextField = new JTextField (5);
   
   JLabel makeLabel04 = new JLabel ("Membership: ");
   JTextField membershipEmpTextField = new JTextField (5);
   
   JLabel makeLabel05 = new JLabel ("Address: ");
   JTextField addressEmpTextField = new JTextField (5);
   
   JLabel makeLabel06 = new JLabel ("Date Of Birth: ");
   JTextField dateBirthEmpTextField = new JTextField (5);
   
   JLabel makeLabel07 = new JLabel (" Phone: ");
   JTextField phoneEmpTextField = new JTextField (5);
   
   JLabel makeLabel08 = new JLabel (" Gender: ");
   JTextField genderEmpTextField = new JTextField (5);
   
   
   JLabel employeeLabel = new JLabel ("Select Employee type: ");

   JRadioButton employeeRadioButton     = new JRadioButton ("Employee");
   JRadioButton trainerRadioButton   = new JRadioButton ("Trainer");
   ButtonGroup  EmployeeGroup     = new ButtonGroup ();
   
   	
	
    Gym gym = new Gym("MY GYM");

    private ArrayList<Staff> staff = new ArrayList<Staff > ();;
    private ArrayList<Student> students = new ArrayList<Student> ();;
    private ArrayList<Employee> employees = new ArrayList<Employee> ();;
    private ArrayList<Trainer> trainers = new ArrayList<Trainer> ();;



   public ManagmentGUI()
   {
      setVisible (true);
      setTitle ("My Gym App");
      setLocation (100, 100);
      setSize (600, 500);
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


      JTabbedPane pane = new JTabbedPane ();
      pane.addTab ("Member managment", null, createMemberPanel (),      "Tab 1 tool tip");
      //pane.addTab ("Employee manament", null, createEMployeePanel (),      "Tab 1 tool tip");

      add (pane, BorderLayout.CENTER);


      // Setup my own "Window Closing" method that runs when
      // the user clicks the "X" icon.
      addWindowListener (new WindowAdapter()
      {
         public void windowClosing (WindowEvent e)
         {
           // exitApplication ();
         }
      });

      
	}

   private JPanel createMemberPanel ()
   {
	  JPanel memberPanel = new JPanel(new BorderLayout() );
          JPanel gridPanel    = new JPanel (new GridLayout (7, 2) );//R,C
	  JPanel buttonsPanel = new JPanel (new FlowLayout (FlowLayout.CENTER) );

      reportTextArea.setFont (new Font ("Courier New", Font.BOLD, 16) );
      reportTextArea.setEditable (true);


      JPanel memberTypePanel = new JPanel (new
                                FlowLayout(FlowLayout.CENTER) );

      memberTypePanel.add (staffRadioButton);
      memberTypePanel.add (studentRadioButton);

      MemberGroup.add (staffRadioButton);
      MemberGroup.add (studentRadioButton);

      gridPanel.add (memberLabel);
      gridPanel.add (memberTypePanel);

      gridPanel.add (makeLabel);
      gridPanel.add (idTextField);
      gridPanel.add (makeLabe2);
      gridPanel.add (fNameTextField);
      gridPanel.add (makeLabe3);
      gridPanel.add (surNameTextField);
      gridPanel.add (makeLabe4);
      gridPanel.add (membershipTextField);
      gridPanel.add (makeLabe5);
      gridPanel.add (addressTextField);
      gridPanel.add (makeLabe6);
      gridPanel.add (dateBirthTextField);
      gridPanel.add (makeLabe7);
      gridPanel.add (phoneTextField);
      gridPanel.add (makeLabe8);
      gridPanel.add (genderTextField);
      gridPanel.add (makeLabe9);
      gridPanel.add (positionTextField);
      gridPanel.add (makeLabe10);
      gridPanel.add (departmentTextField);
      gridPanel.add (makeLabe11);
      gridPanel.add (courseTextField);
      gridPanel.add (makeLabe12);
      gridPanel.add (teamTextField);
     
          


      //JPanel buttonsPanel = new JPanel ();
      buttonsPanel.add (new JLabel ("    ") );
      buttonsPanel.add (addButton);
      buttonsPanel.add (displayButton);
      buttonsPanel.add (searchButton);
      buttonsPanel.add (fileReadButton);
      buttonsPanel.add (fileWriteButton);
      buttonsPanel.add (exitButton);

      memberPanel.add (gridPanel,    BorderLayout.NORTH);
      memberPanel.add (scrollPane,   BorderLayout.CENTER);
      memberPanel.add (buttonsPanel, BorderLayout.SOUTH);


      addButton.addActionListener       (event -> addMember());
       displayButton.addActionListener   (event -> display() );
      
      fileReadButton.addActionListener  (event -> fileRead() );
     /* fileWriteButton.addActionListener (event -> fileWrite() );  
      
      exitButton.addActionListener      (event -> exitApplication() );
      searchButton.addActionListener    (event -> searchByManufacturer() );*/

      staffRadioButton.addActionListener     (event -> MemberSelected() );
      studentRadioButton.addActionListener   (event -> MemberSelected() );

      return memberPanel;
   }

   
   


   private void MemberSelected()
   {
 
      makeLabe9.setEnabled            (false);
      positionTextField.setEnabled        (false);
      makeLabe10.setEnabled     (false);
      departmentTextField.setEnabled (false);
      makeLabe11.setEnabled       (false);
      courseTextField.setEnabled        (false);
      makeLabe12.setEnabled       (false);
      teamTextField.setEnabled (false);

      if (staffRadioButton.isSelected() == true)
      {
       makeLabe9.setEnabled            (true);
      positionTextField.setEnabled        (true);
      makeLabe10.setEnabled     (true);
      departmentTextField.setEnabled (true);
      }
      else if (studentRadioButton.isSelected() == true)
      {
         makeLabe11.setEnabled     (true);
         courseTextField.setEnabled (true);
         makeLabe12.setEnabled     (true);
         teamTextField.setEnabled (true);
      }

   }
   
 private void addMember()         
 {
   if (staffRadioButton.isSelected() == true)
      {
          if (idTextField.getText().equals("")||fNameTextField.getText().equals("")||surNameTextField.getText().equals("")|| membershipTextField.getText().equals("")|| addressTextField.getText().equals("")|| dateBirthTextField.getText().equals("") || phoneTextField.getText().equals("") || genderTextField.getText().equals("")||positionTextField.getText().equals("")||departmentTextField.getText().equals(""))
        {  
        System.out.println("Empty field ! ");        
        }
            else
        {
           gym.add_Staff(new Staff(Integer.parseInt(idTextField.getText()), fNameTextField.getText(), surNameTextField.getText(), membershipTextField.getText(), addressTextField.getText(), dateBirthTextField.getText(), Integer.parseInt(phoneTextField.getText()), genderTextField.getText(), positionTextField.getText(), departmentTextField.getText()));
             
        }
      }
      else if (studentRadioButton.isSelected() == true)
      {
         if (idTextField.getText().equals("")||fNameTextField.getText().equals("")||surNameTextField.getText().equals("")|| membershipTextField.getText().equals("")|| addressTextField.getText().equals("")|| dateBirthTextField.getText().equals("") || phoneTextField.getText().equals("") || genderTextField.getText().equals("")||courseTextField.getText().equals("")||teamTextField.getText().equals(""))
        {
  
        System.out.println("Empty field ! ");
        
        }
            else
        {
           gym.add_Student(new Student(Integer.parseInt(idTextField.getText()), fNameTextField.getText(), surNameTextField.getText(), membershipTextField.getText(), addressTextField.getText(), dateBirthTextField.getText(), Integer.parseInt(phoneTextField.getText()), genderTextField.getText(), courseTextField.getText(), teamTextField.getText()));
             
        }         
      } 
      }
 
 private void  display()
         
 { 
        String data = "", data1="";
       data += gym.display_Staff();
        
       
       data += gym.display_Student();
      reportTextArea.setText(data);
        
     
 }
 
 private void  fileRead()
         
 { 
     String data = "";
try{
Scanner input = new Scanner(new File(".//startup.txt"));
while(input.hasNext()){
data = data + input.nextLine()+"\n";
}
input.close();
}catch(FileNotFoundException ex){
System.out.println("File not found");
}
   reportTextArea.setText(data);
        
     
 }
 
  
public static void main (String[] args)
   {
      ManagmentGUI app = new ManagmentGUI ();
   }
}
