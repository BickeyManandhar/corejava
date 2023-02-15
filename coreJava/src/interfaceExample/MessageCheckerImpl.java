package interfaceExample;

public class MessageCheckerImpl implements MessageChecker{

	@Override
	public boolean check(String msg) {
		
		if(msg.equals("walk") || msg.equals("run") || msg.equals("fly")) {
			return true;
		}
		return false;
	}

}
