package buttonDeco;

import javax.swing.JButton;

public class SmallerButton implements ButtonModel
{
private final ButtonModel lameButton;
	
	public SmallerButton(ButtonModel lameButton)
	{
		this.lameButton=lameButton;
		lameButton.getButton().setBounds(lameButton.x, lameButton.y, lameButton.width/2, lameButton.height/2);
	}
	
	@Override
	public JButton getButton()
	{
		return lameButton.getButton();
	}
}
