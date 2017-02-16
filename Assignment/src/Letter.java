/**
 * Created by sakif on 2/6/2017.
 */
public class Letter {
    private String sender;
    private String recipient;
    private StringBuilder content;
    private String header;
    private String footer;

    public Letter(String from, String to) {
        this.sender = from;
        this.recipient = to;
        this.header = String.format("Dear %s:\n", sender);
        this.footer = String.format("Sincerely,\n%s", recipient);
        this.content = new StringBuilder();
    }

    public void addLine(String line) {
        this.content.append(String.format("%s\n", line));
    }

    public String getText() {
        String output = this.header + this.content.toString() + this.footer;
        return output;
    }
    public static void main(String[] args) {
        Letter a = new Letter("Jane Doe","John Doe");
        a.addLine("How are you doing?.");
        a.addLine("Hope you are doing good this semester.");
        System.out.print(a.getText());

    }

}
