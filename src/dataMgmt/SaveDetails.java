package dataMgmt;

import java.io.*;

public class SaveDetails extends StudentRegistration{
    
    public static void Save()
    {
         try{
                FileWriter writer = new FileWriter(rNo.getText()+".txt");
                BufferedWriter b= new BufferedWriter(writer);
                PrintWriter p=new PrintWriter(b);

                        p.println(rNo.getText());
                        p.println(name.getText());
                        p.println(Class.getText());
                        p.println(dob.getText());
                        p.println(email.getText());
                        p.println(contact1.getText());
                        p.println(add.getText());
                        p.println(gName.getText());


                p.close();
            }catch (Exception w){}
    }
    
}
