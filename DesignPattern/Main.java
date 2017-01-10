import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


interface ButtonCreator {

	public JButton createButton();
	
}


class Wintype implements ButtonCreator
{
	public JButton createButton()
	{
		JButton win = new JButton("Star wars ?");
		win.setBounds(500,50,400, 50);
		return win;
	}

}

class OtherType implements ButtonCreator
{
	JButton oth;
	public JButton createButton()
	{
		 oth = new JButton("razmario");
		 oth.setBounds(100,100,100,100);
		return oth;
	}

}

public class Main extends JFrame 
{ 
	
	JButton mySelectButton;
	ButtonCreator raz;
	JButton myBeautifulButton;
	public Main()
	{ 		
		setSize(1000, 600);// set the size of the frame
		
		raz = new OtherType();// default enabled button is of razmario
		myBeautifulButton=raz.createButton();
		
		mySelectButton=new JButton("Click me :)"); //add select button
		mySelectButton.setBounds(500,300,300,50);
		
		
		add(myBeautifulButton);
		add(mySelectButton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		
		//add action on click on the select button
		mySelectButton.addMouseListener(new java.awt.event.MouseAdapter()
		{
		       public void mouseClicked(java.awt.event.MouseEvent e) {
		          System.out.println("Ya clicked on me :)");
		  			remove(myBeautifulButton);
		    		getContentPane().validate();//repaint the scene with the previous button erased
		    		getContentPane().repaint();
		       
		    	if(raz instanceof OtherType)
		          {			    		
		        	  raz = new Wintype();
		        	  myBeautifulButton=raz.createButton();
		      		add(myBeautifulButton);

		          }
		          else
		          {
		        	  raz = new OtherType();
		        	  myBeautifulButton=raz.createButton();
		      		 add(myBeautifulButton);

		          }
	    		getContentPane().validate();//repaint the scene with the new button
	    		getContentPane().repaint();
		       }          
		});
	
	}
	
	public static void main(String[] args) 
	{
		Main droite = new Main();
	}

}
