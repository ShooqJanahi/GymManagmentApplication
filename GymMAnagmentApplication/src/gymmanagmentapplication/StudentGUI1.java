                                                                                                                            
package gymmanagmentapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;


/**
 *
 * @author sara
 */

public class StudentGUI1 extends Application{
    
    Gym gym = new Gym("MY GYM");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

       public void start(Stage primaryStage) throws Exception {
           
        BorderPane root = new BorderPane();        
        GridPane pane = new GridPane();
        
        TextArea gymList = new TextArea();
        root.setTop(pane);
        root.setBottom(gymList);
        
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(10);
        pane.setHgap(10);

        gymList.setPrefRowCount(20);
        gymList.setPrefColumnCount(30);
        
    
    Label StudentL = new Label("**** Student Managment **** ");
    
     
    Label StudentNumberL = new Label("Student Number : ");
    TextField StudentNumberTF = new TextField();
    
    Label StudentFNameL = new Label("Student FName : ");
    TextField StudentFNameTF = new TextField();
    
    Label StudentSurNameL = new Label("Student SurName : ");
    TextField StudentSurNameTF = new TextField();
    
    Label StudentMembershipL = new Label("Student membership : ");
    TextField StudentMembershipTF = new TextField();
    
    Label StudentAdressL = new Label("Student Adress : ");
    TextField StudentAdressTF = new TextField();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
     Label StudentDateBirthL = new Label("Student Date of Birth : ");
    TextField StudentDateBirthTF = new TextField();
    
    Label StudentPhoneL = new Label("Student age : ");     
    TextField StudentPhoneTF = new TextField();
    
    Label StudentGenderL = new Label("Student Gender : ");
    TextField StudentGenderTF = new TextField();
    
    Label StudentCourseL = new Label("Student course : ");     
    TextField StudentCourseTF = new TextField();
    
    Label StudentTeamL = new Label("Student Team : ");
    TextField StudentTeamTF = new TextField();
    
    
   
    
    Button btAddStudent = new Button("Add Student ");
    Button btLoad = new Button("Load Data From Text File ");
    Button btDisplay = new Button("Displaying Hole Data ");
    Button btClear = new Button("Clear Data ");

   
    pane.add(StudentL, 0, 0);
   
    
    
    pane.add(StudentNumberL, 0, 3);
    pane.add(StudentNumberTF, 1, 3);
    pane.add(StudentFNameL, 0, 4);
    pane.add(StudentFNameTF, 1, 4);
    pane.add(StudentSurNameL, 0, 5);
    pane.add(StudentSurNameTF, 1, 5);
    pane.add(StudentMembershipL, 0, 6);
    pane.add(StudentMembershipTF, 1, 6);
    pane.add(StudentAdressL, 0, 7);
    pane.add(StudentAdressTF, 1, 7);
    pane.add(StudentDateBirthL, 0, 8);
    pane.add(StudentDateBirthTF, 1, 8);
    pane.add(StudentPhoneL, 0, 9);
    pane.add(StudentPhoneTF, 1, 9);
    pane.add(StudentGenderL, 0, 10);
    pane.add(StudentGenderTF, 1, 10);
    
    pane.add(btAddStudent, 0, 13);

    pane.add(btLoad, 0, 14);
    pane.add(btDisplay, 0, 15);
    pane.add(btClear, 0, 16);
    
     
    btAddStudent.setOnAction(e -> {
        
        if (StudentNumberTF.getText().equals("")||StudentFNameTF.getText().equals("")||StudentSurNameTF.getText().equals("")|| StudentMembershipTF.getText().equals("")|| StudentAdressTF.getText().equals("")|| StudentDateBirthTF.getText().equals("") || StudentPhoneTF.getText().equals("") || StudentGenderTF.getText().equals(pane))
        {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Student");
        alert.setContentText("Empty field ! ");
        alert.showAndWait();
        }
            else
        {
            //Student std = new Student
        gym.add_Student(new Student(Integer.parseInt(StudentNumberTF.getText()), StudentFNameTF.getText(), StudentSurNameTF.getText(), StudentMembershipTF.getText(), StudentAdressTF.getText(), StudentDateBirthTF.getText(), Integer.parseInt(StudentPhoneTF.getText()), StudentGenderTF.getText(), StudentCourseTF.getText(), StudentTeamTF.getText()));
       
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Student");
        alert.setContentText("Student is added");
        alert.showAndWait();
        }
      });
    
    btLoad.setOnAction(e -> {
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
   gymList.setText(data);
                     
    });
    
    btDisplay.setOnAction(e -> {
      
        String data = "";
       data += gym.display_Student();
        gymList.setText(data); 
        gym.saveGym();
           
      });
    btClear.setOnAction(e -> {
        
    StudentNumberTF.setText("");
    StudentFNameTF.setText("");
    StudentSurNameTF.setText("");
    StudentMembershipTF.setText("");
    StudentAdressTF.setText("");
    StudentDateBirthTF.setText("");
    StudentPhoneTF.setText("");
    StudentGenderTF.setText("");
        
        
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Clear DATA");
        alert.setContentText("ALL DATA CLEARED ");
        alert.showAndWait();
        
    });
 
   Scene scene = new Scene(root, 400, 600);
   primaryStage.setTitle(" Student Managment ");        
   primaryStage.setScene(scene); 
   primaryStage.show(); 

    }
    public static void main(String[] args) {
        launch(args);
    }

}
    

