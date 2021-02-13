public class Books {
    String title;
    String author;
    int pages;
    String language;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public String getLanguage() {
        return this.language;
    }

    public Books(String title, String author, int pages, String language){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.language = language;
    }

}
