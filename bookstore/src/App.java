public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Book> bookshelf = new LinkedList<>();

        bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));

        System.out.println(bookshelf.length());

        Book currentBook = bookshelf.getStart();

        System.out.println(currentBook.getAuthor());

    }
}
