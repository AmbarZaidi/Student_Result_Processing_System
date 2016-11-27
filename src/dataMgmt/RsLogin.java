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

public class RsLogin extends Stage
{
    static Stage primaryStage;
    static TextField rnBox;
   // static int f1;
    
    /*public static void f1(int a)
    {
        f1=a;
    }*/
    static int q1=0;
    public RsLogin()
    {
        primaryStage = this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Enter Details");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 16));
        grid.add(scenetitle, 0, 0, 2, 3);
        
        Label rn=new Label("Enrolment No.");
        rnBox = new TextField();
        grid.add(rn, 0, 4);
        grid.add(rnBox, 1, 4);
        
        Button login = new Button("    OK    ");
            HBox logBtn = new HBox(15);
            logBtn.setAlignment(Pos.BOTTOM_LEFT);
            logBtn.getChildren().add(login);
            grid.add(logBtn, 0, 7);
            
            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 10);
        
            login.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{
                    
                        if(e1.getSource()==login) 
                        {
                            int x=99;
                            try{
                                x=Integer.parseInt(rn.getText());
                                }catch(Exception q){q1=1;}

                            if ((x>100 || x<1)||q1==1)
                            {
                                actiontarget.setFill(Color.FIREBRICK);
                                actiontarget.setText("Invalid Roll no.");
                                throw new Except("Invalid Roll no."); 
                            }  
                            else if (ClDetails.count()<Integer.parseInt(rn.getText()))
                            {
                                actiontarget.setFill(Color.FIREBRICK);
                                actiontarget.setText("No such student exists");
                                throw new Except("No Student"); 
                            }
                            
                            new NewClass();
                            NewClass.primaryStage.show(); 
                            ((Node)(e1.getSource())).getScene().getWindow().hide();
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
            
        Button bk = new Button("  Back  ");
        bk.minWidth(250);
            HBox bkBtn = new HBox(10);
            bkBtn.setAlignment(Pos.BOTTOM_RIGHT);
            bkBtn.getChildren().add(bk);
            grid.add(bkBtn, 1, 7);
        
        bk.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e3) {
            
            if(e3.getSource()==bk) 
            {
                
                AdHome.primaryStage.show();

                ((Node)(e3.getSource())).getScene().getWindow().hide();

            }
            
        }});
            
        Scene scene = new Scene(grid, 400, 175);
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
    }
    
    public static String rN()
    {
        return rnBox.getText();
    }
}
