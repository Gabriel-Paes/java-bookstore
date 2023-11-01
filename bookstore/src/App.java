public class App {
    public static void main(String[] args) throws Exception {

        LinkedList bookshelf = new LinkedList();

        System.out.println("Biblioteca\n");

        bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));
        bookshelf.push(new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true));

        bookshelf.print();

        System.out.println(bookshelf.length());

        Book bookSearched = bookshelf.getBookByAuthor("Robert C. Martin");
        bookSearched.printBook();

        bookshelf.remove("978-85-508-0460-6");

        /*
         * Book bookSearched2 = bookshelf.getBookByAuthor("Robert C. Martin");
         * bookSearched2.printBook();
         */

        bookshelf.print();
        System.out.println(bookshelf.length());

    }
}
