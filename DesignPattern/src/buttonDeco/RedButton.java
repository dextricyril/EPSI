package buttonDeco;

import javax.swing.JButton;
import java.awt.Color;

public class RedButton implements ButtonModel
{
	private final ButtonModel lameButton;
	
	public RedButton(ButtonModel lameButton)
	{
		this.lameButton=lameButton;
		lameButton.getButton().setBackground(new Color(200,0,0));
	}
	
	@Override
	
	public JButton getButton()
	{
		return lameButton.getButton();
	}

}
