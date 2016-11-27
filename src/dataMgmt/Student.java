package dataMgmt;

//no use as of now

import java.io.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Student extends Application {
		
		static  TextField rNo;			
		private Label label1;
		
		static  TextField name;		 
		private Label label2;
		
		static  TextField Class;		
		private Label label3;
		
		static  TextField dob;
		private Label label4;
		
		static  TextField email;
		private Label label5;
		
		static  TextField contact1;
		private Label label6;
		
		static  TextArea add;
		private Label label7;
		
		static  TextField gName;
		private Label label8;
                
               // private Label label9;
                
    
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("ABC Public School");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);

		Text scenetitle1 = new Text("SESSION 2014-15 Semester 1");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);

		

                    label1=new Label("Name :");
                    name= new TextField("");
                        name.setMaxWidth(300);
                        grid.add(label1, 0 ,2);
                        grid.add( name, 1, 2);

                    label2=new Label("Enrolment No. :");
                    rNo = new TextField();  
                        rNo.setMaxWidth(50);
                        grid.add(label2, 2, 2);
                        grid.add( rNo,3, 2);

                    label3=new Label("Class :");
                    Class = new TextField();
                            Class.setMaxWidth(300);
                        grid.add(label3, 0 ,3);
                        grid.add( Class, 1, 3 );

                    label4=new Label("Date of Birth :");
                    dob = new TextField(); 
                            dob.setMaxWidth(300);
                        grid.add(label4, 0 ,4);
                        grid.add( dob, 1, 4 );

                    label5=new Label("Email :");
                    email = new TextField();
                            email.setMaxWidth(300);
                        grid.add(label5, 0 ,5);	
                        grid.add( email, 1, 5 );

                    label6=new Label("Phone No. :");
                    contact1 = new TextField();
                        grid.add(label6, 0 ,6);
                        grid.add( contact1, 1, 6 );

                    label7=new Label("Address :");
                    add = new TextArea();
                            add.setMaxWidth(200);
                        grid.add(label7, 0 ,7);	
                        grid.add( add, 1, 7 );

                    label8=new Label("Father's/Guardian's name :");
                    gName = new TextField();
                        gName.setMaxWidth(200);
                        grid.add(label8, 0 ,8);
                        grid.add( gName, 1, 8 );


        
        
        
        
        
        
        
        
        //label9=new Label("Password");
      //  PasswordField pwBox = new PasswordField();
        //grid.add(pwBox, 1, 9);
        
        Button btn = new Button("Register");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 10);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 12);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Data saved");       
        }
        });
        
        
        
        Scene scene = new Scene(grid, 900, 475);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
