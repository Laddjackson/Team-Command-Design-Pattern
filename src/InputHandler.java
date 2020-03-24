import java.util.HashMap;
/**
* Author: Team ME
* The purpose of this class is supposed to handle all of the user input
*
*/
public class InputHandler {
	// Utilizing a HashMap to use the commands
	private HashMap<String, Command> commands;

	/**
	* The purpose of the InputHandler is to map which command goes with what inputed
	* @param document
	*/
	public InputHandler(Document document) {
		commands = new HashMap<>();
		commands.put("load", LoadCommand);
		commands.put("save", SaveCommand);
		commands.put("spell", SpellCommands);
		commands.put("print", PrintCommand);
	}

	/**
	* This method is supposed to return the specific command that the user inputed
	* @return data
	*/
	public void inputEntered(String data) {

	}

}
