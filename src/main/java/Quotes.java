import java.io.Serializable;

public class Quotes implements Serializable {
    protected String content;
    protected String author;

    public Quotes(){}

    public Quotes(String quote, Author author) {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
