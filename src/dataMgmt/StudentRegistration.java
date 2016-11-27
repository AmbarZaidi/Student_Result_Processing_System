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


public class StudentRegistration extends Stage {

    static Stage primaryStage;
    
		static  TextField rNo;      private Label label1;
		static  TextField name;     private Label label2;
		static  TextField Class;    private Label label3;
		static  TextField dob;      private Label label4;
		static  TextField email;    private Label label5;
		static  TextField contact1; private Label label6;
		static  TextArea  add;      private Label label7;
		static  TextField gName;    private Label label8;
                
               // private Label label9;
                static int q1=0,flag=1;;
                
    public StudentRegistration() {

        primaryStage=this;
        primaryStage.setTitle("Result Processing System ");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("STUDENT REGISTRATION");
        scenetitle.setFont(Font.font("Garamond", FontWeight.NORMAL , 20));
        grid.add(scenetitle, 0, 0, 2, 1);

     //   Label pw = new Label("Password:");
       // grid.add(pw, 0, 9);
        
        label1=new Label("Enrolment No.                  :   ");
	rNo = new TextField();
            rNo.setMaxWidth(250);
            grid.add(label1, 0, 1);
            grid.add( rNo, 1, 1 );

          
        label2=new Label("Student's Name                :   ");
        name= new TextField();
            name.setMaxWidth(250);
            grid.add(label2, 0 ,2);
            grid.add( name, 1, 2);
		
        label3=new Label("Class                                 :   ");
        Class = new TextField();
            Class.setMaxWidth(250);
            grid.add(label3, 0 ,3);
            grid.add( Class, 1, 3 );

        label4=new Label("Date of Birth                     :   ");
        dob = new TextField(); 
            dob.setMaxWidth(250);
            grid.add(label4, 0 ,4);
            grid.add( dob, 1, 4 );

        label5=new Label("Email                                 :   ");
        email = new TextField();
            email.setMaxWidth(250);
            grid.add(label5, 0 ,5);	
            grid.add( email, 1, 5 );

        label6=new Label("Phone No.                         :   ");
        contact1 = new TextField();
            contact1.setMaxWidth(250);
            grid.add(label6, 0 ,6);
            grid.add( contact1, 1, 6 );

        label7=new Label("Address                             :   ");
        add = new TextArea();
            add.setMaxWidth(250);
            grid.add(label7, 0 ,7);	
            grid.add( add, 1, 7 );

        label8=new Label("Father's/Guardian's name :");
        gName = new TextField();
            gName.setMaxWidth(250);
            grid.add(label8, 0 ,8);
            grid.add( gName, 1, 8 );

        
        Button btn = new Button("Register");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 0, 10);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 10);
        
        
            
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
                   else if (ClDetails.count()<(Integer.parseInt(rNo.getText())-1))
                    {
                        String r=""+(ClDetails.count()+1);
                        System.out.println(r);
                        if((ClDetails.count()+1)<10)
                        {
                            r="0"+r;
                        }
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Kindly register Roll No. "+r+" First");
                        throw new Except("OutOfBound Registry"); 
                    }
                    else if(name.getText()==null)
                    {
                       // System.out.println("here"+name.getText());
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Student Name required");
                        throw new Except("No Name"); 
                    }
                    else
                    {
                        flag=2;
                        SaveDetails.Save();
                        actiontarget.setFill(Color.FIREBRICK);
                        actiontarget.setText("Data saved");
                    }
                       
                   
                }catch(Except O)
                {
                    System.out.println(O);
                }
        
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
                
                AdHome.primaryStage.show();

                ((Node)(e3.getSource())).getScene().getWindow().hide();

            }
            
        }});
           
        Scene scene = new Scene(grid, 500, 475);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
}