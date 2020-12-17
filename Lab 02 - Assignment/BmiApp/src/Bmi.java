import java.io.*; // for file IO
  
public class Bmi{
    public static void main(String[] args) {

         
    
	String [] names = new String[5]; // geting the detils in this name array
	try { 
	  BufferedReader  descriptor = new BufferedReader(       //here file reading is starts
			    new FileReader("D:\\java_prog\\BmiApp\\src\\input.txt"));
        // while((names[i] = descriptor.readLine())!=null)
	   for(int i=0; i < names.length; i++) {// assume file has 61 lines 
		names[i] = descriptor.readLine();
       // i=i+1;
        //System.out.println(descriptor.readLine());
		 
		}
	    descriptor.close(); 

	} catch(IOException e) { 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
	}
	PersonDetails[] Person_array=new PersonDetails[5];        //Creating personDetils of Array
    
    for(int i=0; i < names.length; i++) {
              Person_array[i]=new PersonDetails(); //Allocating the space to objects
              
              String[] arrOfStr = names[i].split(","); // spliting the read detils 
              Person_array[i].setName(arrOfStr[0]);
              Person_array[i].setHight(Double.parseDouble(arrOfStr[1]));
              Person_array[i].setWight(Double.parseDouble(arrOfStr[2]));
              System.out.println("Name: "+Person_array[i].getName()+", Height(m): "+Person_array[i].getHight()+", Weight(Kg): "+Person_array[i].getWight()+", BMI: "+Person_array[i].bmi()+", Status: "+Person_array[i].healthyStaus(Person_array[i].bmi()));

         
              
    }
 

    }
    }
