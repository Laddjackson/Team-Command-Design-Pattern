/**
* Author: Team ME
* This constucts the spell command which allows users to spell check the doc
*
*/
public class SpellCommand {
	private Document doc;

	/**
	* This constructs the spell command
	* @param doc
	*/
	public SpellCommand(Document doc) {
		this.doc = doc;
	}

  /**
	* This will return to the user that the spell check is being performed on the doc
	* @returns that the spell check on the doc has been completed
	*/
	public void execute() {
		doc.spell();
	}
}
