import java.io.*; //import all classes of the package
import java.io.File; //import file class
import java.util.Scanner;  // Import the Scanner class

class Copy extends GenericCommand{


	public void handleCommand(String [] args){
		if (!args[0].equals("copy")) {
			someThingWrong();
		}

		if(args.length != 3) { 
	    System.out.println("Usage: copy <Source file name> <Distination file name>");
	    return;
		}
		
		String errorcode;

		try {
			File sourcefile=new File(args[1]);
			BufferedReader br = new BufferedReader(new FileReader(sourcefile));
			String line;
      		File file = new File(args[2]);
      		if (file.createNewFile()) {
      			FileWriter filewrite = new FileWriter(file, false);
      			BufferedWriter bw = new BufferedWriter(filewrite); //wrapping file writer in buffer writer

      				for(int num=1;num<args.length ;num++){
      					if(args.length <1){
      						errorcode="sourcefile";
      					}else if(args.length <2){
      						errorcode="distinationfile";
      					}
      				}
      			
    			while ((line = br.readLine()) != null){ //read the file line by line untill end
					bw.write(line);
					bw.newLine();
				}
				bw.close();
				filewrite.close();
				System.out.println("Sucessfully copied");
				super.commandCount++;//increment no of code excuted using super class variable
        		
      		} 
      		else { //When there is already have a file in given name
      			Scanner objct = new Scanner(System.in);// Create a Scanner object
        		System.out.println("The distination file allready exist.What do you want overwrite or exit enter y/n to confirm(y) or exit(n)");
        		String option = objct.nextLine();  // Read user input for overwrite or not
        		option =option.toLowerCase();
        		if (option.equals("y")){ // overwrite on file
        			file.delete();
        			File distinationfile = new File(args[2]);
        			distinationfile.createNewFile();
        			FileWriter filewrite = new FileWriter(distinationfile, false);
        			BufferedWriter bw = new BufferedWriter(filewrite); //wrapping file writer in buffer writer

        			while ((line = br.readLine()) != null){ //read the file line by line untill end
						bw.write(line);
						bw.newLine();
					}
					bw.close();
					filewrite.close();

					super.commandCount++;//increment no of code excuted using super class variable
        			System.out.println("Sucessfully copied");
        		}else{ //no overwrite
        			System.out.println("Not copied");
        		}
        		br.close();

      		}
    	} catch (Exception e) {

      		System.out.println("An error occurred in copying,path or source file name is incorrect ");//catching errors and hamdle
      	}	
    }


}