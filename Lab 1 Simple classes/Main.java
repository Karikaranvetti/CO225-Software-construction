import java.math.*; 
import java.util.Random; // for random 
import java.io.*; // for file IO
import java.util.*;

 
      
class Main{
    public static void main(String[] args) {                //Here Reading process
        BufferedReader descriptor = null; 
        double All_atten=0;

	String [] names = new String[62]; // 61 names 
	try { 
	    descriptor = new BufferedReader(
			    new FileReader("co225-classlist.txt"));

	    for(int j=0; j< names.length; j++) // assume file has 61 lines 
		names[j] = descriptor.readLine(); 

	    descriptor.close(); 

	} catch(IOException e) { 
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
	}
        Student[] studentArray = new Student[61];          // here we creating 61 object of array 

        for ( int i=0; i<studentArray.length; i++) {
            studentArray[i]=new Student();             // allocating space for object
           studentArray[i].cal();       //
           studentArray[i].percentage();
           All_atten=studentArray[i].attendance_per+All_atten;       //calculating sum of all student attendance
             
            }
            System.out.println("average attendance percentage of all the students is "+All_atten/studentArray.length); 
            System.out.println("Low attendens students are:");
           

            for(int t=0;t<studentArray.length; t++){
                if(studentArray[t].attendance_per<80){
                    System.out.println(names[t]+" attendance percentage is "+studentArray[t].attendance_per);

                }
                
            }
            
}
}
