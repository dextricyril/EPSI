package Button;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Main extends JFrame 
{ 
	
	JButton mySelectButton;
	ButtonCreator raz;
	JButton myBeautifulButton;
	public Main()
	{ 		
		setSize(1000, 600);// set the size of the frame
		
		raz = new MarioTheme();// default enabled button is of type mario
		myBeautifulButton=raz.createButton("default");
		
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
		  			remove(myBeautifulButton);
		    		getContentPane().validate();//repaint the scene with the previous button erased
		    		getContentPane().repaint();
		       
		    	if(raz instanceof MarioTheme)
		          {			    		
		        	  raz = new StarWarsTheme();
		        	  myBeautifulButton=raz.createButton("LASERS");
		      		

		          }
		          else
		          {
		        	  raz = new MarioTheme();
		        	  myBeautifulButton=raz.createButton("ITALIAN");
		      		 

		          }
		    	add(myBeautifulButton);
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