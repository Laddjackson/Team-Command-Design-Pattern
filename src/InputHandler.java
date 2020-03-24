import java.util.HashMap;

public class InputHandler {
	private HashMap<String, Command> commands;
	
	public InputHandler(Document document) {
		commands = new HashMap<>();
		commands.put("load", LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell", SpellCommands);
		commands.put("print", PrintCommand);
	}
	
	public void inputEntered(String data) {
		
	}
	
}
