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

public class Login extends Stage
{
    static Stage primaryStage;
    
    public Login()
    {
        primaryStage = this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Admin Login");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 16));
        grid.add(scenetitle, 0, 0, 2, 3);
        
        Label un=new Label("Username");
        TextField unBox = new TextField();
        grid.add(un, 0, 4);
        grid.add(unBox, 1, 4);
        
        
        Label pw=new Label("Password");
        PasswordField pwBox = new PasswordField();
        grid.add(pw, 0, 5);
        grid.add(pwBox, 1, 5);
        
        Button login = new Button("Login");
            HBox logBtn = new HBox(15);
            logBtn.setAlignment(Pos.BOTTOM_LEFT);
            logBtn.getChildren().add(login);
            grid.add(logBtn, 0, 7);
            
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 3);
        
        
            login.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                    try{

                   
                        if(e1.getSource()==login) 
                        {
                            if(pwBox.getText().equals("123") && unBox.getText().equals("admin") )
                            {
                            new AdHome();
                            AdHome.primaryStage.show();
                            
                            ((Node)(e1.getSource())).getScene().getWindow().hide();

                            }
                            else
                            { 
                                actiontarget.setFill(Color.FIREBRICK);
                                actiontarget.setText("Invalid Username or Password ");
                                throw new eInvalidPassword();
                            }
                                
                        }
                         
                    }catch(eInvalidPassword e){
                        System.out.println(e);
                    }catch(Exception er1){
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
}
