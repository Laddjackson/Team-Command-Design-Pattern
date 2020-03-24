
public class PrintCommand {
	/**
	* Author: Team ME
	* Purpose of this class is to print the command that is being called
	*/
	private Document doc;

	/**
	* This method is meant to assign the variable doc to itself
	* @param
	*
	*/
	public PrintCommand(Document doc) {
		this.doc = doc;
	}

  /**
	* This method is executing the print command, which is telling the program to print the doc
	* @param 
	* @return	the printed doc
	*/
	public void execute() {
		doc.print();
	}
}
