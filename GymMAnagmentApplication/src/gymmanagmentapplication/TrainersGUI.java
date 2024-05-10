
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

public class TrainersGUI extends Application{
    
    Gym gym = new Gym("MY GYM");
    //ArrayList<Trainer> trainers1 = new ArrayList<Trainer>();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

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
        
    
    Label TrainerL = new Label("**** Trainers Managment **** ");
    
      
    Label TrainerNumberL = new Label("Trainer Number : ");
    TextField TrainerNumberTF = new TextField();
    
    Label TrainerFNameL = new Label("Trainer FName : ");
    TextField TrainerFNameTF = new TextField();
    
    Label TrainerSurNameL = new Label("Trainer SurName : ");
    TextField TrainerSurNameTF = new TextField();
    
    Label TrainerMembershipL = new Label("Trainer membership : ");
    TextField TrainerMembershipTF = new TextField();
    
    Label TrainerAdressL = new Label("Trainer Adress : ");
    TextField TrainerAdressTF = new TextField();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
     Label TrainerDateBirthL = new Label("Trainer Date of Birth : ");
    TextField TrainerDateBirthTF = new TextField();
    
    Label TrainerPhoneL = new Label("Trainer age : ");     
    TextField TrainerPhoneTF = new TextField();
    
    Label TrainerGenderL = new Label("Trainer Gender : ");
    TextField TrainerGenderTF = new TextField();
    
    
    Button btAddTrainer = new Button("Add Trainer ");
    Button btLoad = new Button("Load Data From Text File ");
    Button btDisplay = new Button("Displaying Hole Data for workshop ");
    Button btClear = new Button("Clear Data ");

   
    pane.add(TrainerL, 0, 0);
   
    
    
    pane.add(TrainerNumberL, 0, 3);
    pane.add(TrainerNumberTF, 1, 3);
    pane.add(TrainerFNameL, 0, 4);
    pane.add(TrainerFNameTF, 1, 4);
    pane.add(TrainerSurNameL, 0, 5);
    pane.add(TrainerSurNameTF, 1, 5);
    pane.add(TrainerMembershipL, 0, 6);
    pane.add(TrainerMembershipTF, 1, 6);
    pane.add(TrainerAdressL, 0, 7);
    pane.add(TrainerAdressTF, 1, 7);
    pane.add(TrainerDateBirthL, 0, 8);
    pane.add(TrainerDateBirthTF, 1, 8);
    pane.add(TrainerPhoneL, 0, 9);
    pane.add(TrainerPhoneTF, 1, 9);
    pane.add(TrainerGenderL, 0, 10);
    pane.add(TrainerGenderTF, 1, 10);
     pane.add(btAddTrainer, 0, 11);

    pane.add(btLoad, 0, 12);
    pane.add(btDisplay, 0, 13);
    pane.add(btClear, 0, 14);
    
     
    btAddTrainer.setOnAction(e -> {
        
        if (TrainerNumberTF.getText().equals("")||TrainerFNameTF.getText().equals("")||TrainerSurNameTF.getText().equals("")|| TrainerMembershipTF.getText().equals("")|| TrainerAdressTF.getText().equals("")|| TrainerDateBirthTF.getText().equals("") || TrainerPhoneTF.getText().equals("") || TrainerGenderTF.getText().equals(pane))
        {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Trainer");
        alert.setContentText("Empty field ! ");
        alert.showAndWait();
        }
            else
        {
            
            gym.add_Trainer(new Trainer(Integer.parseInt(TrainerNumberTF.getText()), TrainerFNameTF.getText(), TrainerSurNameTF.getText(), TrainerMembershipTF.getText(), TrainerAdressTF.getText(), TrainerDateBirthTF.getText(), Integer.parseInt(TrainerPhoneTF.getText()), TrainerGenderTF.getText()));
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ADD Trainer");
        alert.setContentText("Trainer is added");
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
       data += gym.display_Trainer();
        gymList.setText(data); 
        gym.saveGym();
           
      });
    btClear.setOnAction(e -> {
        
    TrainerNumberTF.setText("");
    TrainerFNameTF.setText("");
    TrainerSurNameTF.setText("");
    TrainerMembershipTF.setText("");
    TrainerAdressTF.setText("");
    TrainerDateBirthTF.setText("");
    TrainerPhoneTF.setText("");
    TrainerGenderTF.setText("");
        
        
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Clear DATA");
        alert.setContentText("ALL DATA CLEARED ");
        alert.showAndWait();
        
    });
 
   Scene scene = new Scene(root, 400, 600);
   primaryStage.setTitle(" Trainer Managment ");        
   primaryStage.setScene(scene); 
   primaryStage.show(); 

    }
    public static void main(String[] args) {
        launch(args);
    }

}
    

