package buttonDeco;

import javax.swing.JButton;

public class WorkingButton implements ButtonModel
{
private final ButtonModel lameButton;
	
	public WorkingButton(ButtonModel lameButton)
	{
		this.lameButton=lameButton;
		lameButton.getButton().setText("Dead");
		lameButton.getButton().setEnabled(false);
	}
	
	@Override
	public JButton getButton()
	{
		return lameButton.getButton();
	}
}