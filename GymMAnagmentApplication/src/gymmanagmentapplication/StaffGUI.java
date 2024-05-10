

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

public class StaffGUI extends Application{
    
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
        
    
    Label StaffL = new Label("**** Staff Managment **** ");
    
    Label StaffPositionL = new Label("Staff Position : ");
    TextField StaffPositionTF = new TextField();
    
    Label StaffDepartmentL = new Label("Staff department : ");
    TextField StaffDepartmentTF =  new TextField();
    
      
    Label StaffNumberL = new Label("Staff Number : ");
    TextField StaffTF = new TextField();
    
    Label StaffFNameL = new Label("Staff FName : ");
    TextField StaffFNameTF = new TextField();
    
    Label StaffSurNameL = new Label("Staff SurName : ");
    TextField StaffSurNameTF = new TextField();
    
    Label StaffMembershipL = new Label("Staff membership : ");
    TextField StaffMembershipTF = new TextField();
    
    Label StaffAdressL = new Label("Staff Adress : ");
    TextField StaffAdressTF = new TextField();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
     Label StaffDateBirthL = new Label("Staff Date of Birth : ");
    TextField StaffDateBirthTF = new TextField();
    
    Label StaffPhoneL = new Label("Staff age : ");     
    TextField StaffPhoneTF = new TextField();
    
    Label StaffGenderL = new Label("Staff Gender : ");
    TextField StaffGenderTF = new TextField();
    
    
    Button btAddStaff = new Button("Add Staff ");
    Button btLoad = new Button("Load Data From Text File ");
    Button btDisplay = new Button("Displaying Hole Data ");
    Button btClear = new Button("Clear Data ");
                                                                                                                                                                                                             
   
    pane.add(StaffL, 0, 0);
    pane.add(StaffPositionL, 0, 3);
    pane.add(StaffPositionTF, 1, 3);
    pane.add(StaffDepartmentL, 0, 4 );
    pane.add(StaffDepartmentTF, 1 , 4);
    pane.add(StaffNumberL, 0, 5);
    pane.add(StaffTF, 1, 5);
    pane.add(StaffFNameL, 0, 6);
    pane.add(StaffFNameTF, 1 , 6);
    pane.add(StaffSurNameL, 0, 7);
    pane.add(StaffSurNameTF, 1, 7);
    pane.add(StaffMembershipL, 0, 8);
    pane.add(StaffMembershipTF, 1, 8);
    pane.add(StaffAdressL, 0, 9);
    pane.add(StaffAdressTF, 1, 9);
    pane.add(StaffDateBirthL, 0, 10);
    pane.add(StaffDateBirthTF, 1, 10);
    pane.add(StaffPhoneL, 0, 11);
    pane.add(StaffPhoneTF, 1, 11);
    pane.add(StaffGenderL, 0, 12);
    pane.add(StaffGenderTF, 1, 12);
    
    pane.add(btAddStaff, 0, 13);
    pane.add(btLoad, 1, 13);
    pane.add(btDisplay, 0, 14);
    pane.add(btClear, 1, 14);
    
     
    btAddStaff.setOnAction(e -> {
        
        if (StaffTF.getText().equals("")||StaffFNameTF.getText().equals("")||StaffSurNameTF.getText().equals("")|| StaffMembershipTF.getText().equals("")|| StaffAdressTF.getText().equals("")|| StaffDateBirthTF.getText().equals("") || StaffPhoneTF.getText().equals("") || StaffGenderTF.getText().equals(pane))
        {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Staff");
        alert.setContentText("Empty field ! ");
        alert.showAndWait();
        }
            else
        {
            
         gym.add_Staff(new Staff(Integer.parseInt(StaffTF.getText()), StaffFNameTF.getText(), StaffSurNameTF.getText(), StaffMembershipTF.getText(), StaffAdressTF.getText(), StaffDateBirthTF.getText(), Integer.parseInt(StaffPhoneTF.getText()), StaffGenderTF.getText(), StaffPositionTF.getText(), StaffDepartmentTF.getText()));
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Staff");
        alert.setContentText("Staff is added");
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
       data += gym.display_Staff();
        gymList.setText(data); 
        gym.saveGym();
           
      });
    btClear.setOnAction(e -> {
        
    StaffTF.setText("");
    StaffFNameTF.setText("");
    StaffSurNameTF.setText("");
    StaffMembershipTF.setText("");
    StaffAdressTF.setText("");
    StaffDateBirthTF.setText("");
    StaffPhoneTF.setText("");
    StaffGenderTF.setText("");
                                               
        
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Clear DATA");
        alert.setContentText("ALL DATA CLEARED ");
        alert.showAndWait();
        
    });
 
   Scene scene = new Scene(root, 400, 600);
   primaryStage.setTitle(" Staff Managment ");        
   primaryStage.setScene(scene); 
   primaryStage.show(); 

    }
    public static void main(String[] args) {
        launch(args);
    }

}
    

