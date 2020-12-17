 /*
E/16/172
Lab6
SAVE    ----  TikGame.java
COMPILE ----  javac TikGame.java
RUN     ----  java TikGame        */

import java.awt.event.*;
import javax.swing.*;
public class TikGame extends JFrame // this methed inharite the JFrame class 
{
	int chance=1;   //chance  start with player 1 
	int count=0;              // for counting the events 
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;        // 9 buttons 
	public TikGame(String s){
		super(s);	          // its assing the window name 
		setComponent(); 
		setSize(310,350);       // gui size 
		setLocation(100,100);
		setLayout(null);
		setVisible(true);
		setResizable(false);       // can't resize the window 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setComponent()
	{
    /*...................assing button sizes ......................*/
     b1=new JButton("");
	 b1.setBounds(13,13,90,90);
	 b2=new JButton("");
	 b2.setBounds(110,13,90,90);
	 b3=new JButton("");
	 b3.setBounds(207,13,90,90); 
	 b4=new JButton("");
	 b4.setBounds(13,110,90,90); 
	 b5=new JButton("");
	 b5.setBounds(110,110,90,90);
	 b6=new JButton("");
	 b6.setBounds(207,110,90,90); 
	 b7=new JButton("");
	 b7.setBounds(13,207,90,90);
	 b8=new JButton("");
	 b8.setBounds(110,207,90,90);
	 b9=new JButton("");
	 b9.setBounds(207,207,90,90);
	 /*..................inputing actioListener constructor to buttons ................................*/ 
	 b1.addActionListener(new A1());
	 b2.addActionListener(new A2());
	 b3.addActionListener(new A3());
	 b4.addActionListener(new A4());
	 b5.addActionListener(new A5());
	 b6.addActionListener(new A6());
	 b7.addActionListener(new A7());
	 b8.addActionListener(new A8());
	 b9.addActionListener(new A9());
	
	 /*.........adding all butttons inside the fream ......................................... */
	 add(b1);
	 add(b2);
	 add(b3);
	 add(b4);
	 add(b5);
	 add(b6);
	 add(b7);
	 add(b8);
	 add(b9);
	 
	} 
	public void setEnable()     // this method for after win or draw , all buttons are making unabileble 
	{
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	public int check()       // this check if the win or draw happend or not 
	{
		count++;    // counting the event 
		
		/**......Player 1 winning ways ...................... */
		if(b1.getText()=="1"&&b2.getText()=="1"&&b3.getText()=="1")
			return 1;
		else if(b1.getText()=="1"&&b4.getText()=="1"&&b7.getText()=="1")
			return 1;
		else if(b1.getText()=="1"&&b5.getText()=="1"&&b9.getText()=="1")
			return 1;
		
		else if(b2.getText()=="1"&&b5.getText()=="1"&&b8.getText()=="1")
			return 1;
		
		else if(b3.getText()=="1"&&b6.getText()=="1"&&b9.getText()=="1")
			return 1;
		else if(b3.getText()=="1"&&b5.getText()=="1"&&b7.getText()=="1")
			return 1;
		
		else if(b4.getText()=="1"&&b5.getText()=="1"&&b6.getText()=="1")
			return 1;
		
		else if(b7.getText()=="1"&&b8.getText()=="1"&&b9.getText()=="1")
			return 1;
		
		/**......Player 2 winning ways ...................... */
		else if(b1.getText()=="2"&&b2.getText()=="2"&&b3.getText()=="2")
			return 2;
		else if(b1.getText()=="2"&&b4.getText()=="2"&&b7.getText()=="2")
			return 2;
		else if(b1.getText()=="2"&&b5.getText()=="2"&&b9.getText()=="2")
			return 2;
		
		else if(b2.getText()=="2"&&b5.getText()=="2"&&b8.getText()=="2")
			return 2;
		
		else if(b3.getText()=="2"&&b6.getText()=="2"&&b9.getText()=="2")
			return 2;
		else if(b3.getText()=="2"&&b5.getText()=="2"&&b7.getText()=="2")
			return 2;
		
		else if(b4.getText()=="2"&&b5.getText()=="2"&&b6.getText()=="2")
			return 2;
		
		else if(b7.getText()=="2"&&b8.getText()=="2"&&b9.getText()=="2")
			return 2;
		
		else{
		  if(count==9){
			/**......match draw happend ...................... */
			return 9;
		  }
			
		  return 3;
		}			
			
		
	}
	 
	class A1 implements ActionListener         //button 1 ActionListener implimetatin 
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){        // if its player1 action 
			    b1.setText("1"); // set that as 1
				chance=2;	 /// then giveing the chance to player 2
			}
			else{                           // if its player2 action
				b1.setText("2"); // set that as 1
				chance=1;	/// then giveing the chance to player 2 
			}
			b1.setEnabled(false);   //After the action make the button unavailable
			new Win1(check());     // checking is that winning action or not  and if its winning the show the result in  other window 
			
		 }
	}

	/** As we did  button 1 implimenting ,do the rest */
	class A2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b2.setText("1"); 
				chance=2;	 
			}
			else{
				b2.setText("2"); 
				chance=1;	 
			}
			b2.setEnabled(false);
			new Win1(check());	
		 }
	} 
	class A3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b3.setText("1"); 
				chance=2;	 
			}
			else{
				b3.setText("2"); 
				chance=1;	 
			}
			b3.setEnabled(false);
			new Win1(check());
		 }
	}
	class A4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b4.setText("1"); 
				chance=2;	 
			}
			else{
				b4.setText("2"); 
				chance=1;	 
			}
			b4.setEnabled(false);
			new Win1(check());	
		 }
	}
	class A5 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b5.setText("1"); 
				chance=2;	 
			}
			else{
				b5.setText("2"); 
				chance=1;	 
			}
			b5.setEnabled(false);
			new Win1(check());	
		 }
	}
	class A6 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b6.setText("1"); 
				chance=2;	 
			}
			else{
				b6.setText("2"); 
				chance=1;	 
			}
			b6.setEnabled(false);
			new Win1(check());	
		 }
	}
	class A7 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b7.setText("1"); 
				chance=2;	 
			}
			else{
				b7.setText("2"); 
				chance=1;	 
			}
			b7.setEnabled(false);
			new Win1(check());	
		 }
	}
	class A8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b8.setText("1"); 
				chance=2;	
			}
			else{
				b8.setText("2"); 
				chance=1;	 
			}
			b8.setEnabled(false);
			new Win1(check());
		 }
	}
	class A9 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		 {
			if(chance==1){
			    b9.setText("1"); 
				chance=2;	 
			}
			else{
				b9.setText("2"); 
				chance=1;	 
			}
			b9.setEnabled(false);
			new Win1(check());
		 }
	}  
	class Win1  extends JFrame {          // result showing frame 
		JTextField DisPlayText1;
		JButton StartAgin;     // restart button 
		public Win1(int val){
			super("Game Result");    // window name 
			setSize(310,350);
			setLocation(100,100);
			setLayout(null);
			StartAgin=new JButton("Start New Game");     // we can restart the game 
			StartAgin.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					new TikGame("Tic Tac Toe");
					dispose();     ////dispose the result window 
				}
			});
			StartAgin.setBounds(90,150,130,30);
			add(StartAgin);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 
			if(val==1){
			   setEnable();
				setVisible(true);    // only winning condition window appear
				DisPlayText1=new JTextField();   // for result displaying textfeild 
				add(DisPlayText1);
				DisPlayText1.setBounds(40,100,250,30);
				DisPlayText1.setEditable(false);
				DisPlayText1.setText("Player 1 Won");}
			else if (val==2){
			   setEnable();
				setVisible(true);
				DisPlayText1=new JTextField();
				add(DisPlayText1);
				DisPlayText1.setBounds(40,100,250,30);
				DisPlayText1.setEditable(false);
				DisPlayText1.setText("Player 2 Won");}
			else if(val==9) {			
			   setEnable();
				setVisible(true);
				DisPlayText1=new JTextField();
				add(DisPlayText1);
				DisPlayText1.setBounds(40,100,250,30);
				DisPlayText1.setEditable(false);
				DisPlayText1.setText("Game Draw");}
			
		} 
	}

	public static void main(String []args)
	{
		new TikGame("Tic Tac Toe");       // calling the TikGame constuctor 
	
	}
}