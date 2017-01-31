package Button;

import javax.swing.JButton;

class StarWarsTheme implements ButtonCreator
{
	public JButton createButton(String text)
	{
		JButton win = new JButton(text);
		win.setBounds(500,50,400, 50);
		
		return win;
	}

}