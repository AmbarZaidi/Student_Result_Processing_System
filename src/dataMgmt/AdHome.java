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

public class AdHome extends Stage {
    
    static Stage primaryStage;
    
    public AdHome()
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

        Text scenetitle1 = new Text("Welcome Admin");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 2, 2, 1);
 
        Button nSt = new Button("       Register New Student       ");
        
            HBox nStBtn = new HBox(15);
            nStBtn.setAlignment(Pos.BOTTOM_LEFT);
            nStBtn.getChildren().add(nSt);
            grid.add(nStBtn, 0, 4);
            
            nSt.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{

                        if(e1.getSource()==nSt) 
                        {
                            new StudentRegistration();
                            StudentRegistration.primaryStage.show();
                        }

                        ((Node)(e1.getSource())).getScene().getWindow().hide();

                    }catch(Exception er1){
                        er1.printStackTrace();
                    }
                }
                });
            
        Button std = new Button("    View/Edit Student Details    ");
            HBox stBtn = new HBox(10);
            stBtn.setAlignment(Pos.BOTTOM_LEFT);
            stBtn.getChildren().add(std);
            grid.add(stBtn, 0, 5);
            
            std.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e2) {

                try{
                        if(e2.getSource()==std) 
                        {
                            NewClass.primaryStage.show();
                        }

                        ((Node)(e2.getSource())).getScene().getWindow().hide();

                    }catch(Exception er2){
                        
                    }
                }});
        
     /*   Button cls = new Button("         Update Attendance         ");
            HBox clBtn = new HBox(10);
            clBtn.setAlignment(Pos.BOTTOM_LEFT);
            clBtn.getChildren().add(cls);
            grid.add(clBtn, 0, 6);
            
        cls.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e3) {

                try{
                        if(e3.getSource()==cls) 
                        {
                            new RsLogin();
                            RsLogin.f1(1);
                            RsLogin.primaryStage.show();
                        }

                        ((Node)(e3.getSource())).getScene().getWindow().hide();

                    }catch(Exception er3){
                        er3.printStackTrace();
                    }
                }});  */
            
        Button mrk = new Button("             Update Marks             ");
            HBox mkBtn = new HBox(10);
            mkBtn.setAlignment(Pos.BOTTOM_LEFT);
            mkBtn.getChildren().add(mrk);
            grid.add(mkBtn, 0, 6);
        
        mrk.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e4) {

                try{
                        if(e4.getSource()==mrk) 
                        {
                            new SaveMarks();
                            SaveMarks.primaryStage.show();
                        }

                        ((Node)(e4.getSource())).getScene().getWindow().hide();

                    }catch(Exception err){
                        err.printStackTrace();
                    }
                }});  
        
        Button rst = new Button("               View Result               ");
            HBox reBtn = new HBox(10);
            reBtn.setAlignment(Pos.BOTTOM_LEFT);
            reBtn.getChildren().add(rst);
            grid.add(reBtn, 0, 7);
        
        rst.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e5) {

                try{
                        if(e5.getSource()==rst) 
                        {
                            new RsLogin();
                            NewClass.f=0;
                            RsLogin.primaryStage.show();
                        }

                        ((Node)(e5.getSource())).getScene().getWindow().hide();

                    }catch(Exception er5){
                        er5.printStackTrace();
                    }
                }});  
            
            
            
            
        Button btn = new Button("  Cancel  ");
        btn.minWidth(250);
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 0, 11);
        
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e3) {
           
            try{    
                    Home.primaryStage.show();
                    ((Node)(e3.getSource())).getScene().getWindow().hide();
        
                }catch(Exception er3){
                        er3.printStackTrace();
                    }
        }});
       
        Scene scene = new Scene(grid, 500, 475);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}