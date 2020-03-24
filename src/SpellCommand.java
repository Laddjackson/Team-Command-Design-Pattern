
public class SpellCommand {
	private Document doc;

	public SpellCommand(Document doc) {
		this.doc = doc;
	}

	public void execute() {
		doc.spell();
	}
}