package dataMgmt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StLogin extends Stage
{
    static Stage primaryStage;
    static TextField unBox;
    static int q1=0;
    
    public StLogin()
    {
        primaryStage = this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Enter as Student");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 16));
        grid.add(scenetitle, 0, 0, 2, 3);
        
        Label un=new Label("Enrolment No.");
        unBox = new TextField();
        grid.add(un, 0, 4);
        grid.add(unBox, 1, 4);
        
        
       /* Label pw=new Label("DOB");
        TextField pwBox = new TextField();
        grid.add(pw, 0, 5);
        grid.add(pwBox, 1, 5);*/
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 7);
        
        
        Button login = new Button("    OK    ");
            HBox logBtn = new HBox(15);
            logBtn.setAlignment(Pos.BOTTOM_LEFT);
            logBtn.getChildren().add(login);
            grid.add(logBtn, 0, 7);
            
            login.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{
                         if(e1.getSource()==login) 
                        {
                            int x=99;
                            try{
                                x=Integer.parseInt(unBox.getText());
                                }catch(Exception q){q1=1;}

                            if ((x>100 || x<1)||q1==1)
                            {
                                actiontarget.setFill(Color.FIREBRICK);
                                actiontarget.setText("Invalid Roll no.");
                                throw new Except("Invalid Roll no."); 
                            }  
                            else if (ClDetails.count()<Integer.parseInt(unBox.getText()))
                            {
                                actiontarget.setFill(Color.FIREBRICK);
                                actiontarget.setText("No such student exists");
                                throw new Except("No Student"); 
                            }
                            else
                            {
                                new StHome();
                                StHome.primaryStage.show();
                                 ((Node)(e1.getSource())).getScene().getWindow().hide();
                            }
                        }

                    }
                    catch(Except O)
                    {
                      System.out.println(O);
                    }
                    catch(Exception er1){
                        er1.printStackTrace();
                    }
                }
                });
            
         Button btn = new Button("  Cancel  ");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 7);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) 
        {
             Home.primaryStage.show();
             ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        });
            
        
        Scene scene = new Scene(grid, 400, 175);
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
        
    }
     public static String rN()
    {
        return unBox.getText();
    }
}
