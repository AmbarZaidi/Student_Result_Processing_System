package dataMgmt;
//student result display
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

public class NewClass extends Stage {
    
        static Stage primaryStage;
        public static int f;
					
		private Label header1,header2,header3;		
		private Label label4,label5,label6,label7,label8,label9,label10,label11;                
                private Label s1,s2,s3,s4,s5,s6;
                private Label m1,m2,m3,m4,m5,m6;
                private Label gp1,gp2,gp3,gp4,gp5,gp6;
               
                
                
    public NewClass() 
    {
        primaryStage=this;
        primaryStage.setTitle("Result Processing System ");
        int rn=01;
        try{ rn=Integer.parseInt(RsLogin.rN());}catch(Exception e1){}
        try{ rn=Integer.parseInt(StLogin.rN());}catch(Exception e2){}
        
     
      
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
        
        Text scenetitle2 = new Text("Name : "+GetInfo.Name(rn, 1));
        scenetitle2.setFont(Font.font("", FontWeight.MEDIUM , 12));
        grid.add(scenetitle2, 0, 2, 2, 1);

      
               
                String r=""+rn;
                        if(rn<10)
                            r="0"+r;
                        
                header2=new Label("Enrollment No.: "+r);
                    grid.add(header2, 0 ,4);
                header3=new Label("Class : 12th");
                    grid.add(header3, 0,5);


        
        label4=new Label("S.No."); 
            grid.add(label4, 0 ,7);
            
                Label[] a=new Label[6];
                for (int j=8;j<=13;j++)
                {
                    a[j-8]= new Label(""+(j-7));
                    grid.add(a[j-8],0,j);
                }   


        label5=new Label("Subject");
            grid.add(label5, 1 ,7);	
                  
                s1=new Label("Physics");
                grid.add(s1, 1 ,8);	
                
                s2=new Label("Chemistry");
                grid.add(s2, 1 ,9);	
                
                s3=new Label("Computer Science");
                grid.add(s3, 1 ,10);	
                
                s4=new Label("Mathematics");
                grid.add(s4, 1 ,11);	
                
                s5=new Label("English");
                grid.add(s5, 1 ,12);	
                
                s6=new Label("Hindi");
                grid.add(s6, 1 ,13);	
            
        
                
        label6=new Label("Marks Obtained");
            grid.add(label6, 2,7);
            
                m1=new Label("            "+GetInfo.Marks(rn, 1));
                grid.add(m1, 2 ,8);

                m2=new Label("            "+GetInfo.Marks(rn, 2));
                grid.add(m2, 2 ,9);

                m3=new Label("            "+GetInfo.Marks(rn, 3));
                grid.add(m3, 2 ,10);	

                m4=new Label("            "+GetInfo.Marks(rn, 4));
                grid.add(m4, 2 ,11);	

                m5=new Label("            "+GetInfo.Marks(rn, 5));
                grid.add(m5, 2 ,12);	

                m6=new Label("            "+GetInfo.Marks(rn, 6));
                grid.add(m6, 2 ,13);
        
        label7=new Label("Grade");
            grid.add(label7, 3 ,7);
                
            Label[] G=new Label[6];
            for(int i=0;i<6;i++)
            {
                G[i]=new Label("   "+Gp.gr(rn, i+1));
                grid.add(G[i], 3, (i+8));
            }
            
            Label rmk;
                int count=0;
                for(int i=0;i<=5;i++){
                    if(Gp.gr(rn, (i+1)).equals("FAIL")){
                        rmk=new Label("Remark : Fail");
                        grid.add(rmk,0 ,17);
                        count++;
                        break;
                    }
                }
                if(count==0){
                    rmk=new Label("Remark :Pass");
                    grid.add(rmk, 0, 17);
                }
            	
           
        label8=new Label("G.P.");
            grid.add(label8, 4,7);
            
            	gp1=new Label("  "+Gp.g(rn,1));
            	grid.add(gp1, 4 ,8);
            	
            	gp2=new Label("  "+Gp.g(rn,2));
            	grid.add(gp2, 4 ,9);
            	
            	gp3=new Label("  "+Gp.g(rn,3));
            	grid.add(gp3, 4 ,10);
            	
            	gp4=new Label("  "+Gp.g(rn,4));
            	grid.add(gp4, 4 ,11);
            	
            	gp5=new Label("  "+Gp.g(rn,5));
            	grid.add(gp5, 4 ,12);
            	
            	gp6=new Label("  "+Gp.g(rn,6));
            	grid.add(gp6, 4 ,13);
            	
                
                     	
        int total=GetInfo.Marks(rn, 1)+GetInfo.Marks(rn, 2)+GetInfo.Marks(rn, 3)+GetInfo.Marks(rn, 4)+GetInfo.Marks(rn, 5)+GetInfo.Marks(rn, 6);     	
        label9 =new Label("Total= "+total+"/600");
        grid.add(label9, 4 ,16);   

        label11=new Label("Percentage="+total/6+"%");
        grid.add(label11, 4,17);
                
        float CGPA=(Gp.g(rn,1)+Gp.g(rn,2)+Gp.g(rn,3)+Gp.g(rn,4)+Gp.g(rn,5)+Gp.g(rn,6))/6;
        label10= new Label("CGPA= "+CGPA);
        	grid.add(label10, 4, 15);
        
        float clAvg=000000, stAvg=total/6;
        
        Button bk = new Button("  Back  ");
        bk.minWidth(250);
            HBox bkBtn = new HBox(10);
            bkBtn.setAlignment(Pos.BOTTOM_LEFT);
            bkBtn.getChildren().add(bk);
            grid.add(bkBtn, 5, 19);
        
        bk.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e3) {
            
            if(e3.getSource()==bk) 
            {
                if(f==0)
                {
                new AdHome();
                AdHome.primaryStage.show();
                }
                if(f==1)
                {
                new StHome();
                StHome.primaryStage.show();
                }
                
                ((Node)(e3.getSource())).getScene().getWindow().hide();
            }
            
        }});
        
        
        Scene scene = new Scene(grid, 550, 500);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

}