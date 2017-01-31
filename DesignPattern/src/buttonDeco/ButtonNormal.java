package buttonDeco;

import javax.swing.JButton;

public class ButtonNormal implements ButtonModel 
{
	JButton button;
	
	public ButtonNormal()
	{
		button=new JButton("Bouton très\n normal");
		button.setBounds(x,y,width,height);
	}

	@Override
	public JButton getButton()
	{
		return button;
	}


}

