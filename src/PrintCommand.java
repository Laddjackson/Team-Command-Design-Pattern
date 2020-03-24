
public class PrintCommand {
	private Document doc;

	public PrintCommand(Document doc) {
		this.doc = doc;
	}

	public void execute() {
		doc.print();
	}
}