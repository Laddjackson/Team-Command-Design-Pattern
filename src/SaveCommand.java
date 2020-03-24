
public class SaveCommand implements Command{
	private Document doc;
	SaveCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		System.out.println("document " + doc + " is being saved...");
	}
}
