import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

/// Julia set class
class Julia  {
	double coreal;   // constant real part 
	double coimag;   // constant imaginery part
	double itmax;
	
	public Julia (){
	  this.coreal=-0.4;        // assigning value to real part of resl constant and imaginery constant 
	  this.coimag= 0.6;
	  this.itmax=1000;

	}
	
	public Julia(double coreal,double coimag){
		  this.coreal=coreal;
		  this.coimag=coimag;
		  this.itmax=1000;
	}
	public Julia(double coreal,double coimag,Double itmax){
		this.coreal=coreal;
		this.coimag=coimag;
		this.itmax=itmax;
  }
	  
    // calculate the iteration and find the complex plane	  
	public int cal(int i,int j){
		// int  iterations;
		 double y_imag;
	     double x_real;
		 double temp;                               // temperary variable   
					x_real=((double)i-400)/400;
					y_imag=(400-(double)j)/400;
						int it=0;
						
						
						while (it<itmax){
							temp=(x_real*x_real)-(y_imag*y_imag);
							y_imag=(2*x_real*y_imag)+coimag;
							x_real=temp+coreal;
							it++;
							if((x_real*x_real+y_imag*y_imag)>4){break;}
							
						}
						 return it;
			          
    }
	// get the frame and and color  
	 public void picture(){
		 JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800, 800);
		 JPanel panel = new JPanel(){
		
		 @Override
         public  void paintComponent(Graphics g) {
				
                super.paintComponent(g);    
	              
				 for(int i=0;i<=800;i++){
					for(int j=0;j<=800;j++){
						Color myColour =new Color(cal(i,j)%255,0,cal(i,j)%182);
				    
						g.setColor(myColour);
						g.fillRect(i,j, 2,2);}	   						
				 }
		 }
	 };
	 frame.add(panel);

   }
}
