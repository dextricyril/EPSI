package Button;

import java.awt.Color;

import javax.swing.JButton;

class MarioTheme implements ButtonCreator
{
	JButton oth;
	public JButton createButton(String text)
	{
		 oth = new JButton(text);
		 oth.setBounds(100,100,100,100);
		 oth.setBackground(new Color(100,0,0));
		return oth;
	}

}