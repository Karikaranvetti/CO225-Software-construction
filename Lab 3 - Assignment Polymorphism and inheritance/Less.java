import java.io.*; //import all classes of the package
import java.io.File; //import file class

class Less extends GenericCommand{

	public void handleCommand(String [] args){
		if (!args[0].equals("less")) {
			someThingWrong();
		}

		if(args.length != 2) { 
	    System.out.println("Usage: less <file name>");
	    return;
		}

		try{
			File inputfile = new File(args[1]); //create file object using given file name
			BufferedReader br = new BufferedReader(new FileReader(inputfile));
			String text;
			while ((text = br.readLine()) != null){ //read the file line by line untill end
				System.out.println(text);
			}
			super.commandCount++; //increment no of code excuted using super class variable
  
		}catch(Exception e){
			System.out.println("There is an Error in Reading File ,path or file name is incorrect "); // if there is an error occured  it will catch
		}


	}

}