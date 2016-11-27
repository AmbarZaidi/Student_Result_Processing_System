package dataMgmt;

import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClDetails extends Stage {
		
    static Stage primaryStage;
    			
		private Label header1,header2,header3;
		public static int count=0;
                
    
    public ClDetails(){
        
        primaryStage=this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

            Text scenetitle = new Text("ABC Public School");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Text scenetitle1 = new Text("SESSION 2014-15 Sem 1");
        scenetitle1.setFont(Font.font("Garamond", FontWeight.NORMAL , 16));
        grid.add(scenetitle1, 0, 1, 2, 1);
      
       
        
        int counter=0;
          for(int i=1;i<=count();i++){
                    for(int j=0;j<=5;j++){
              if(Gp.gr(i, (j+1)).equals("FAIL")){
                        counter++;
                        break;
                }
        }
        }
                header1=new Label("Total no. of Students : "+(count()));
                    grid.add(header1, 0,3 );
                header2=new Label("No. of Students Passed : "+(count()-counter));
                    grid.add(header2, 0 ,4);
                header3=new Label("No.of Students Failed : "+(counter));
                    grid.add(header3, 0,5);
                    
         Button btn = new Button("  Back  ");
        btn.minWidth(250);
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 5, 24);
        
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
    
    public static int count()
    {
      int n=0;
      try{
        for(int i=0;i<=100;i++)
        {
        
            if((i+1)==Integer.parseInt(GetInfo.Name((i+1), 0)))
            count++;
           
        }}
        catch(Exception e){n=count;count=0;}
      System.out.println(n);
        return n;
    }
}