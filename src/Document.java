/**
* This class creates a document with a name that the user can load, save, spell, and print
* @author Team ME
*
*/

public class Document {
	private String name;
	/**
	* This constructs a document with a specific name
	* @param name of the document
	*/
	public Document(String name) {
		this.name = name;
		System.out.println("document "+name+" is created");
	}

	/**
	* This returns to the user that the document is being loaded
	* @returns that the document is loading
	*/
	public void load() {
		System.out.println("document "+name+" is loaded into view");
	}

	/**
	* This returns that the name is being spell checked for any errors
	* @returns to the user that the document is being spell checked
	*/
	public void spell() {
		System.out.println("document "+name+" is being checked for spelling errors");
	}

	/**
	* This returns that the document is being saved
	* @returns to the user that the document is currently being saved
	*/
	public void save() {
		System.out.println("document "+name+" is being saved...");
	}

	/**
	* This returns that the document is being printed out
	* @returns to the user that their document is being printed
	*/
	public void print() {
		System.out.println("document "+name+" is printing...");
	}
}
