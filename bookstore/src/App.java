import java.util.ArrayList;

public class App {
        public static void main(String[] args) throws Exception {

                LinkedList bookshelf = new LinkedList();

                System.out.println("Biblioteca\n");

                bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));
                bookshelf.push(new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true));

                bookshelf.push(new Book("Guerra e Paz", "Leon Tolstói", "978-85-359-0272-1", true));
                bookshelf.push(new Book("A Arte da Guerra", "Sun Tzu", "978-85-7153-223-9", true));
                bookshelf.push(new Book("O Velho e o Mar", "Ernest Hemingway", "978-85-325-2846-4", true));

                bookshelf.push(new Book("Star Wars: Herdeiro do Império", "Timothy Zahn", "978-85-7852-176-3", true));
                bookshelf.push(new Book("Star Wars: A Trilogia Thrawn", "Timothy Zahn", "978-85-7852-142-8", true));
                bookshelf.push(new Book("Star Wars: O Caminho Jedi", "Daniel Wallace", "978-85-250-3580-1", true));

                bookshelf.push(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin",
                                "978-85-62650-44-2", true));
                bookshelf.push(new Book("Design Patterns: Elements of Reusable Object-Oriented Software",
                                "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, Grady Booch",
                                "978-85-7883-351-0", true));
                bookshelf.push(new Book("Introdução à Teoria da Computação", "Michael Sipser", "978-85-221-1779-0",
                                true));

                bookshelf.print();

                System.out.println(bookshelf.length());

                System.out.println("-------------------");

                bookshelf.sort(1);

                bookshelf.print();

                System.out.println("-------------------");

                bookshelf.sort(0);

                bookshelf.print();
          
                System.out.println("-------------------");
          
                System.out.println("Todos os livros de Robert C. Martin: ");

                ArrayList<String> books = bookshelf.getBooksByAuthor("Robert C. Martin");

                bookshelf.loanBook("Arquitetura Limpa");
                bookshelf.returnBook("Arquitetura Limpa");

                //System.out.println(bookshelf.length());

                //System.out.println("Todos os livros de Robert C. Martin: ");

                //ArrayList<String> books = bookshelf.getBooksByAuthor("Robert C. Martin");

                //System.out.println(books);

                /*
                 * Book bookSearched = bookshelf.getBookByAuthor("Robert C. Martin");
                 * bookSearched.printBook();
                 * 
                 * bookshelf.remove("978-85-508-0460-6");
                 * 
                 * 
                 * Book bookSearched2 = bookshelf.getBookByAuthor("Robert C. Martin");
                 * bookSearched2.printBook();
                 * 
                 * 
                 * bookshelf.print();
                 * System.out.println(bookshelf.length());
                 */

        }
}
