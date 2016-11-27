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

public class StHome extends Stage {
    
    static Stage primaryStage;
    
    public StHome()
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

       /* Text scenetitle1 = new Text("sss");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);*/
 
        /* Button dtl = new Button("               View Details               ");
            HBox dtBtn = new HBox(10);
            dtBtn.setAlignment(Pos.BOTTOM_LEFT);
            dtBtn.getChildren().add(dtl);
            grid.add(dtBtn, 0, 3);
        
        dtl.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e1) {

                try{
                        if(e1.getSource()==dtl) 
                        {
                            new NewClass();
                            NewClass.primaryStage.show();
                        }

                        ((Node)(e1.getSource())).getScene().getWindow().hide();

                    }catch(Exception er1){
                        er1.printStackTrace();
                    }
                }});  */
        
        Button rst = new Button("               View Result               ");
            HBox reBtn = new HBox(10);
            reBtn.setAlignment(Pos.BOTTOM_LEFT);
            reBtn.getChildren().add(rst);
            grid.add(reBtn, 1, 3);
        
        rst.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e5) {

                try{
                        if(e5.getSource()==rst) 
                        {
                            new NewClass();
                            NewClass.f=1;
                            NewClass.primaryStage.show();
                        }

                        ((Node)(e5.getSource())).getScene().getWindow().hide();

                    }catch(Exception er5){
                        er5.printStackTrace();
                    }
                }});  
            
        
        Button btn = new Button("  Cancel  ");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_CENTER);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 5);
        
       
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) {
           
            Home.primaryStage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        });
       
        Scene scene = new Scene(grid, 400, 175);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}