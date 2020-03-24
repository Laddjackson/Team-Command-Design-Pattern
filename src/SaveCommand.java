/**
* Author: Team ME
* The purpose of this class is to have the user be able to save the doc
*
*/
public class SaveCommand implements Command {
	private Document doc;

	/**
	* This constucts the save command for the doc
	* @param doc
	*/
	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	/**
	* This returns to the user that the document has or is being saved
	* @returns the doc has been saved
	*/
	public void execute() {
		doc.save();
	}
}
