package dataMgmt;

public class Gp {

    public static int g(int rNo, int i) {
        	int marks, gp=22;
        	marks=GetInfo.Marks(rNo,i);	
   	
        if (marks<=100)	{
            if(marks>90)
                gp=10;
            else if(marks>80)
                gp=9;
            else if(marks>70)
	       	gp=8;
    	    else if(marks>60)
        	gp=7;
            else if(marks>50)
        	gp=6;
	    else if(marks>40)
    	    	gp=5;
            else if(marks>=33)
        	gp=4;
            else
        	gp=0;
        	}	
        else
            System.out.print("Invalid Data");
 	
       	return gp;
    }
    
    public static String gr(int rNo, int i) {
        	int marks;
        	String G="";
        	marks=GetInfo.Marks(rNo,i);	
   	
        if (marks<=100)	{
            if(marks>90)
                G="A1";
            else if(marks>80)
                G="A2";
            else if(marks>70)
                G="B1";
    	    else if(marks>60)
        	G="B2";
            else if(marks>50)
        	G="C1";
	    else if(marks>40)
    	    	G="C2";
            else if(marks>=33)
        	G="D";
            else
        	G="FAIL";
        	}	
        else
            System.out.print("Invalid Data");
        		
        return G;
    }
    
}