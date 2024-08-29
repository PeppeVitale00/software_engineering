public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        Command copyCommand = new CopyCommand(doc);

        Editor editor = new Editor();
        editor.setCommand(copyCommand);
        editor.executeCommand();  // Output: Copying text...
    }
}
