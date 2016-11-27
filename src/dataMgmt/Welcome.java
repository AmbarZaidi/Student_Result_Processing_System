package dataMgmt;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcome extends Application{
    static Button btn;
    
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome to Student Result Management System");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Text scenetitle1 = new Text("SESSION 2014-15 Semester 1");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);
 
        Button btn = new Button("Enter");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 3);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) {
            
        try{
            
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("OK Button Pressed ");
            
                if(e.getSource()==btn) 
                {
                    new Home();
                    Home.primaryStage.show();
                }
                
                ((Node)(e.getSource())).getScene().getWindow().hide();
            
            }catch(Exception err){
                err.printStackTrace();
            }
        }
        });
       
        Scene scene = new Scene(grid, 400, 150);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

     public static void main(String[] args) {
        launch(args);
    }
}

   
