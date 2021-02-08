package data;

public class RuleData {
    private String title;
    private String content;
    public RuleData( String title,  String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    @Override
    public String toString() {
        return "NoteData{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
