public class Note {
    private String content;
    
    public Note(String content) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty.");
        }
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return content;
    }
}
