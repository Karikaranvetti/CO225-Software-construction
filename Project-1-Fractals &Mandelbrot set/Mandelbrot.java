import javax.swing.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
class Mandelbrot{
	
	double coreal;
	double coimag;
	double itmax;
	double real1;
    double real2;
    double imag1;
    double imag2;
	
	public Mandelbrot(){
		 this.real1=-1;
		 this.real2= 1;
		 this.imag1=-1;
		 this.imag2=1;
		 this.itmax=1000;
	  }
	  
	  public Mandelbrot(double real1,double real2,double imag1,double imag2){
		 
		 this.real1=real1;
		 this.real2=real2;
		 this.imag1=imag1;
		 this.imag2=imag2;
		 this.itmax=1000;
	  }
	  public Mandelbrot(double real1,double real2,double imag1,double imag2,double itmax){
		 
		 this.real1=real1;
		 this.real2=real2;
		 this.imag1=imag1;
		 this.imag2=imag2;
		 this.itmax=itmax;
	  }
	     
	 public int mathematic(int i,int j){
		// int  iterations;
		 double y;
	     double x;
					
					x = ((double) i / 800) * (real2 - real1) + (real1);       // maping cordinates 
                    y = -imag2 + ((double) j / 800) * (imag2 - imag1);
               

						coreal=x;        
					    coimag=y;
						
						int it=0;	
						
						while (it<itmax){
							double x1=x*x-y*y+coreal;
							double y1=2*x*y+coimag;
							x=x1;
							y=y1;
							it++;
							if(Math.abs(x*x+y*y)>4){
								break;
								}
							
						}
                      
						 return it;
			          
    }
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
						
				    Color myColour =new Color(mathematic(i,j)%15,0,mathematic(i,j)%150);       //geting color to fill
				    
						g.setColor(myColour);
						g.fillRect(i,j, 2,2);         // puting dot in i,j cordinate	
				   }							
				 }
		 }		
		};
		frame.add(panel);

	 }
}