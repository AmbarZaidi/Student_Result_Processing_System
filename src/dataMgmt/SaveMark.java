package dataMgmt;

import java.io.*;

public class SaveMark extends SaveMarks{
    
    public static void Save()
    {
            
             try{
                 
                        FileWriter writer = new FileWriter("m"+rNo.getText()+".txt");
			BufferedWriter b= new BufferedWriter(writer);
			PrintWriter p=new PrintWriter(b);
			
				p.println(rNo.getText());
				p.println(name.getText());
				p.println(Sub1.getText());
				p.println(Sub2.getText());
				p.println(Sub3.getText());
				p.println(Sub4.getText());
				p.println(Sub5.getText());
				p.println(Sub6.getText());
		
		
			p.close();
                    }catch (Exception w){}
    }
    
}
