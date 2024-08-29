//Concrete command
public class CopyCommand implements Command {
    private Document document;

    public CopyCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.copy();
    }

   
}
