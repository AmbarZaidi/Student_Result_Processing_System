package dataMgmt;

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

public class ClHome extends Stage {
    
    static Stage primaryStage;
    
    public ClHome()
    {
        primaryStage = this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("SESSION 2014-15      ");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 16));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Text scenetitle2 = new Text("Semester 1");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 18));
        grid.add(scenetitle2, 0, 1, 2, 1);

        Text scenetitle1 = new Text("Subject-wise results");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 3, 2, 1);
 
        Button dtl = new Button("            View Class Details            ");
            HBox dtBtn = new HBox(10);
            dtBtn.setAlignment(Pos.BOTTOM_CENTER);
            dtBtn.getChildren().add(dtl);
            grid.add(dtBtn, 0, 2);
        
        dtl.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent eE) {

                try{
                        if(eE.getSource()==dtl) 
                        {
                            new ClDetails();
                            ClDetails.primaryStage.show();
                        }

                        ((Node)(eE.getSource())).getScene().getWindow().hide();

                    }catch(Exception erE){
                        erE.printStackTrace();
                    }
                }});  
        
        Button sb1 = new Button("                      Physics                     ");
            HBox re1Btn = new HBox(10);
            re1Btn.setAlignment(Pos.BOTTOM_LEFT);
            re1Btn.getChildren().add(sb1);
            grid.add(re1Btn, 0, 4);
        
        sb1.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{
                        if(e1.getSource()==sb1) 
                        {
                            new Sb(01);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e1.getSource())).getScene().getWindow().hide();

                    }catch(Exception er1){
                        er1.printStackTrace();
                    }
                }});  
        
        Button sb2 = new Button("                   Chemistry                   ");
            HBox re2Btn = new HBox(10);
            re2Btn.setAlignment(Pos.BOTTOM_LEFT);
            re2Btn.getChildren().add(sb2);
            grid.add(re2Btn, 0, 5);
            
        sb2.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e2) {

                try{
                        if(e2.getSource()==sb2) 
                        {
                            new Sb(02);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e2.getSource())).getScene().getWindow().hide();

                    }catch(Exception er2){
                        er2.printStackTrace();
                    }
                }});  
            
            
        Button sb3 = new Button("            Computer Science             ");
            HBox re3Btn = new HBox(10);
            re3Btn.setAlignment(Pos.BOTTOM_LEFT);
            re3Btn.getChildren().add(sb3);
            grid.add(re3Btn, 0, 6);
            
        sb3.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e3) {

                try{
                        if(e3.getSource()==sb3) 
                        {
                            new Sb(03);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e3.getSource())).getScene().getWindow().hide();

                    }catch(Exception er3){
                        er3.printStackTrace();
                    }
                }});  
            
        Button sb4 = new Button("                 Mathematics                 ");
            HBox re4Btn = new HBox(10);
            re4Btn.setAlignment(Pos.BOTTOM_LEFT);
            re4Btn.getChildren().add(sb4);
            grid.add(re4Btn, 0, 7);
                sb4.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e4) {

                try{
                        if(e4.getSource()==sb4) 
                        {
                            new Sb(04);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e4.getSource())).getScene().getWindow().hide();

                    }catch(Exception er4){
                        er4.printStackTrace();
                    }
                }});  
            
        Button sb5 = new Button("                      English                     ");
            HBox re5Btn = new HBox(10);
            re5Btn.setAlignment(Pos.BOTTOM_LEFT);
            re5Btn.getChildren().add(sb5);
            grid.add(re5Btn, 0, 8);
                sb5.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e5) {

                try{
                        if(e5.getSource()==sb5) 
                        {
                            new Sb(05);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e5.getSource())).getScene().getWindow().hide();

                    }catch(Exception er5){
                        er5.printStackTrace();
                    }
                }});  
            
            
            
        Button sb6 = new Button("                       Hindi                       ");
            HBox re6Btn = new HBox(10);
            re6Btn.setAlignment(Pos.BOTTOM_LEFT);
            re6Btn.getChildren().add(sb6);
            grid.add(re6Btn, 0, 9);
                sb6.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e6) {

                try{
                        if(e6.getSource()==sb6) 
                        {
                            new Sb(06);
                            Sb.primaryStage.show();
                        }

                        ((Node)(e6.getSource())).getScene().getWindow().hide();

                    }catch(Exception er6){
                        er6.printStackTrace();
                    }
                }});  
        
            
        
        Button btn = new Button("  Cancel  ");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 0, 11);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) 
        {
             Home.primaryStage.show();
             ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        });
       
        Scene scene = new Scene(grid, 500, 475);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}