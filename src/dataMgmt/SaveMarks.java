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


public class SaveMarks extends Stage {

    static Stage primaryStage;
		static  TextField rNo;			
		private Label label1;
		
		static  TextField name;		 
		private Label label2;
		
		static  TextField Sub1;		
		private Label label3;
		
		static  TextField Sub2;
		private Label label4;
		
		static  TextField Sub3;
		private Label label5;
		
		static  TextField Sub4;
		private Label label6;
		
		static  TextField Sub5;
		private Label label7;
		
		static  TextField Sub6;
		private Label label8;
                
               // private Label label9;
                static int q1=0;
                
   
    public SaveMarks() {

        primaryStage=this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Input Marks");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        
        label1=new Label("Enrolment No.                  :   ");
		rNo = new TextField();
            grid.add(label1, 0, 1);
            grid.add( rNo, 1, 1 );
		
        label3=new Label("Physics :   ");
        Sub1 = new TextField();
            grid.add(label3, 0 ,3);
            grid.add( Sub1, 1, 3 );

        label4=new Label("Chemistry :   ");
        Sub2 = new TextField(); 
            grid.add(label4, 0 ,4);
            grid.add( Sub2, 1, 4 );

        label5=new Label("Computer Science :   ");
        Sub3 = new TextField();
            grid.add(label5, 0 ,5);	
            grid.add( Sub3, 1, 5 );

        label6=new Label("Mathematics :   ");
        Sub4 = new TextField();
            grid.add(label6, 0 ,6);
            grid.add( Sub4, 1, 6 );

        label7=new Label("English :   ");
        Sub5 = new TextField();
            grid.add(label7, 0 ,7);	
            grid.add( Sub5, 1, 7 );

        label8=new Label("Hindi :");
        Sub6 = new TextField();
            grid.add(label8, 0 ,8);
            grid.add( Sub6, 1, 8 );

        Button btn = new Button("OK");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 0, 10);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 12);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) {
            
            try{
                
                   int x=99;
                   try{
                   x=Integer.parseInt(rNo.getText());
                   }catch(Exception q){q1=1;}
                   
                if ((x>100 || x<1)||q1==1)
                {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Invalid Roll no.");
                    throw new Except("Invalid Roll no."); 
                }  
                else if (ClDetails.count()<Integer.parseInt(rNo.getText()))
                {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("No such student exists");
                    throw new Except("No Student"); 
                }
                else
                {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Data saved");       
                    SaveMark.Save();
                }
            }
            catch(Except er){}
        }
        });
        
        Button bk = new Button("  Back  ");
        bk.minWidth(250);
            HBox bkBtn = new HBox(10);
            bkBtn.setAlignment(Pos.BOTTOM_RIGHT);
            bkBtn.getChildren().add(bk);
            grid.add(bkBtn, 1, 10);
        
        bk.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e3) {
            
            if(e3.getSource()==bk) 
            {
                   
                   {
                        AdHome.primaryStage.show();
                   }
                   ((Node)(e3.getSource())).getScene().getWindow().hide();
            }
            
        }});
        
        
        Scene scene = new Scene(grid, 500, 475);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }  
}
