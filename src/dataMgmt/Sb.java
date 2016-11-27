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

public class Sb extends Stage {
	
    static Stage primaryStage;
		private Label label1,label2,label3,label4,label5,label6;
                         
    public Sb(int Sub) {

        primaryStage=this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("ABC Public School ");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Text scenetitle1 = new Text("SESSION 2014-15 Sem 1");
        scenetitle1.setFont(Font.font("Garamond", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);

      
        label1=new Label("S.No.");
            grid.add(label1, 0,3 );
            
		
        label2=new Label("Enrollment No.");
            grid.add(label2, 1 ,3);
		
        label3=new Label("Student");
            grid.add(label3, 2,3);

        label4=new Label("Section");
            grid.add(label4, 3 ,3);

        label5=new Label("Marks");
            grid.add(label5, 4 ,3);	

        label6=new Label("Grade   ");
            grid.add(label6, 5,3);
       
        Label[] m=new Label[6];
        Label[] G=new Label[6];
        Label[] g=new Label[6];
        Label[] a=new Label[10];
        Label[] b=new Label[10];
            for(int i=0;i<ClDetails.count();i++)
            {
                m[i]=new Label(" "+GetInfo.Marks((i+1), Sub));
                grid.add(m[i], 4,(i+4));
            
                G[i]=new Label(" "+GetInfo.Name((i+1), 1));
                grid.add(G[i], 2,(i+4));
                
                g[i]=new Label(" "+Gp.gr((i+1), Sub));
                grid.add(g[i], 5,(i+4));
                
                a[i]=new Label(" "+(i+1));
                grid.add(a[i], 0,(i+4));
                
                b[i]=new Label(" 0"+(i+1));
                grid.add(b[i], 1,(i+4));
            } 
            
            
            
        Button btn = new Button("  Back  ");
        btn.minWidth(250);
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 5, 24);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 3);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e3) {
            
            if(e3.getSource()==btn) 
            {
                
                ClHome.primaryStage.show();

                ((Node)(e3.getSource())).getScene().getWindow().hide();

            }
            
        }});
        
       
            
        Scene scene = new Scene(grid, 500, 475);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

}