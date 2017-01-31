package buttonDeco;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	JButton selectButton1;
	JButton selectButton2;
	JButton selectButton3;
	ButtonModel myBeautifulButton;
	
	public Main ()
	{
		//setup windows and function button
		setSize(640,480);
		
		selectButton1=new JButton("Deco 1");
		selectButton1.setBounds(60,350,100,35);
		selectButton2=new JButton("Deco 2");
		selectButton2.setBounds(200,350,100,35);
		selectButton3=new JButton("Deco 3");
		selectButton3.setBounds(340,350,100,35);
		
		add(selectButton1);
		add(selectButton2);
		add(selectButton3);
		
		myBeautifulButton=new ButtonNormal();
		add(myBeautifulButton.getButton());
		//toast
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		selectButton1.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			myBeautifulButton=new WorkingButton(myBeautifulButton);
		   			getContentPane().repaint();
		       }
		 });
		selectButton2.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			myBeautifulButton=new RedButton(myBeautifulButton);
		   			getContentPane().repaint();
		       }
		 });
		selectButton3.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		   			myBeautifulButton=new SmallerButton(myBeautifulButton);
		   			getContentPane().repaint();
		       }
		 });

	}
	public static void main(String[] args) 
	{
		Main run = new Main();
	}

}
