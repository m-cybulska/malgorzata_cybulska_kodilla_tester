public class Book {
    private String author;
    private String title;
    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }
//    public String getAuthor() {
//        return author;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public static void main(String[] args) {
//        Book book = Book.of( "Agatha Christie", "And then there were none");
//        System.out.println(book.getAuthor() + " " + "\"" + book.getTitle() + "\"");
//    }
}