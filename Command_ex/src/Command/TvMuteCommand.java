package Command;

import Object.*;

public class TvMuteCommand implements Command{
	private TV tv;
	
	public TvMuteCommand(TV tv){
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.mute();
	}
	
}
