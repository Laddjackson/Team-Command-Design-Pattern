/**
* Author: Team ME
* This class creates the laod command so the user can load the doc
*
*/
public class LoadCommand implements Command{
	private Document doc;

	/**
	* This constructs the load command
	* @param doc
	*/
	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	/**
	* This returns that the doc is loading when called
	* @returns doc.load
	*/
	public void execute() {
		doc.load();
	}

}
