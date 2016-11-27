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

public class Home extends Stage{
   
    static Stage primaryStage;
    
    public Home()
    {
        primaryStage = this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("SESSION 2014-15 Semester 1");
        scenetitle.setFont(Font.font("", FontWeight.NORMAL , 16));
        grid.add(scenetitle, 0, 0, 2, 1);

        Text scenetitle1 = new Text("Select any module");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);
 
        Button admin = new Button("Administrator");
            HBox adBtn = new HBox(15);
            adBtn.setAlignment(Pos.BOTTOM_LEFT);
            adBtn.getChildren().add(admin);
            grid.add(adBtn, 0, 3);
            
            admin.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{
                        ((Node)(e1.getSource())).getScene().getWindow().hide();
            
                        if(e1.getSource()==admin) 
                        {
                            new Login();
                            Login.primaryStage.show();
                        }

                    }catch(Exception er1){
                        er1.printStackTrace();
                    }
                }
                });
        
        Button std = new Button("     Student     ");
            HBox stBtn = new HBox(10);
            stBtn.setAlignment(Pos.BOTTOM_CENTER);
            stBtn.getChildren().add(std);
            grid.add(stBtn, 1, 3);
            
            std.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e2) {

                try{

                        if(e2.getSource()==std) 
                        {
                            new StLogin();
                            StLogin.primaryStage.show();
                            
                             ((Node)(e2.getSource())).getScene().getWindow().hide();
            
                        }

                    }catch(Exception er2){
                        er2.printStackTrace();
                    }
                }
                });

        Button cls = new Button("       Class       ");
            HBox clBtn = new HBox(10);
            clBtn.setAlignment(Pos.BOTTOM_RIGHT);
            clBtn.getChildren().add(cls);
            grid.add(clBtn, 2, 3);
            
            cls.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e3) {

                try{

                        if(e3.getSource()==cls) 
                        {
                            new ClHome();
                            ClHome.primaryStage.show();
                            
                             ((Node)(e3.getSource())).getScene().getWindow().hide();
            
                        }

                    }catch(Exception er3){
                        er3.printStackTrace();
                    }
                }
                });
        
        Button btn = new Button("  Cancel  ");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_CENTER);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 5);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) 
        {
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        });
       
        Scene scene = new Scene(grid, 400, 175);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}
