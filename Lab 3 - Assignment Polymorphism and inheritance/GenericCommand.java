/*******************************************************************
                 Skeleton code 
********************************************************************/

public class GenericCommand { 
    /* this is the generic command 
     * your commands should reimplement this
     */
    public static int commandCount=0; //super class variable to get no of commands exacuted

    public void handleCommand(String [] args) { 
	System.out.println("Command not implemented!");
    }

    public void someThingWrong() { 
	System.out.println("Something Wrong in code!!!");
	System.exit(-1);
    }
}

