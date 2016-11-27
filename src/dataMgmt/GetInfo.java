package dataMgmt;

import java.io.*;

public class GetInfo {
    
    public static int Marks(int rNo,int sub)
    {
        String abc="";
        String r=""+rNo;
        if(rNo<10)
        {
            r="0"+r;
        }
     try{
            FileReader fR=new FileReader("m"+r+".txt");
            BufferedReader b=new BufferedReader(fR);
            
            int count=0;
            while ((abc=b.readLine())!= null && count!=(sub+1))
            {
                count++;
            }
            
        }
        catch(Exception e){}
     
        //System.out.println("tesla"+abc);
     return Integer.parseInt(abc);
    }
    public static void showMarks(int rNo,int i){
        System.out.println(Marks(rNo,i));
    }
     public static String Name(int rNo,int i)
    {
        String abc="";
        String r=""+rNo;
        if(rNo<10)
        {
            r="0"+r;
        }
     try{
            FileReader fR=new FileReader(r+".txt");
            BufferedReader b=new BufferedReader(fR);
        
            
            int count=0;
            while ((abc=b.readLine())!= null && count!=(i))
            {
                count++;
            }
            
        }
        catch(Exception e){}
     
     return abc;
}}