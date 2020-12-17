import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

// main class 
public class Fractal extends JPanel{
    public static void main(String[] args) {
		
	//	if (args.length < 1) {System.exit(0);}   
	
        
		      // get the inputs from the user and call the Mandelbrot and Julia set
	         if(args[0].equalsIgnoreCase("Julia")){
				   Julia julia=null;
                   if (args.length==3){ 
				     julia = new Julia(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
					 }
				  else if(args.length==1){
					  julia = new Julia();
					  }
					  else if(args.length==4){
						julia = new Julia(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
					  }

				  else {
					  System.out.println("Please , Enter valid arguments");   // if the wrong argument the exit
					  System.exit(0);
					  }
					  
					  julia.picture();
				
			     }
				 // check the Mandelbrot set
		    else if(args[0].equalsIgnoreCase("Mandelbrot")){
				    Mandelbrot mandel=null;
                if (args.length==6){
				   
		          mandel = new Mandelbrot(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
		  }
		        else if (args.length==5){
				   
		          mandel = new Mandelbrot(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4]));
		  }
		        else if (args.length==1){
				   
		          mandel = new Mandelbrot();
		  }
		        else {
					System.out.println("Please , Enter valid arguments");   //  if not in argument range then exit
					System.exit(0);}
				
				mandel.picture();
		  	 
		        }
				else {
					System.out.println("Enter the valid set");  
				}
		}
}


