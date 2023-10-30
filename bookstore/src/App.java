import java.util.ArrayList;
import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                try (Scanner scanner = new Scanner(System.in)) {
                        int opc;
                        boolean app = true;

                        LinkedList bookshelf = new LinkedList();

                        bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));
                        bookshelf.push(new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true));
                        bookshelf.push(new Book("Guerra e Paz", "Leon Tolstói", "978-85-359-0272-1", true));
                        bookshelf.push(new Book("A Arte da Guerra", "Sun Tzu", "978-85-7153-223-9", true));
                        bookshelf.push(new Book("O Velho e o Mar", "Ernest Hemingway", "978-85-325-2846-4", true));
                        bookshelf.push(new Book("Star Wars: Herdeiro do Império", "Timothy Zahn", "978-85-7852-176-3", true));
                        bookshelf.push(new Book("Star Wars: A Trilogia Thrawn", "Timothy Zahn", "978-85-7852-142-8", true));
                        bookshelf.push(new Book("Star Wars: O Caminho Jedi", "Daniel Wallace", "978-85-250-3580-1", true));
                        bookshelf.push(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "978-85-62650-44-2", true));
                        bookshelf.push(new Book("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, Grady Booch", "978-85-7883-351-0", true));
                        bookshelf.push(new Book("Introdução à Teoria da Computação", "Michael Sipser", "978-85-221-1779-0", true));

                        System.out.println("BIBLIOTECA");

                        while(app){
                                System.out.println("---------------------------");
                                System.out.println("1 - Adicionar Livro");
                                System.out.println("2 - Remover Livro");
                                System.out.println("3 - Emprestar Livro");
                                System.out.println("4 - Devolver Livro Emprestado");
                                System.out.println("5 - Buscar Livro por Titulo");
                                System.out.println("6 - Buscar Livro por ISBN");
                                System.out.println("7 - Buscar Livros de um Autor");
                                System.out.println("8 - Ordenar por Livros");
                                System.out.println("9 - Ordenar por Autor");
                                System.out.println("0 - Listar Livros");
                                System.out.println("! - Sair");
                                System.out.print("Informe a opcao desejada: ");
                                opc = scanner.nextInt();
                                System.out.println("---------------------------");
                                switch (opc) {
                                        case 1:
                                                bookshelf.push(createBook(scanner));
                                                break;
                                        case 2:
                                                bookshelf.remove(titleOrISBN(scanner));
                                                break;
                                        case 3:
                                                bookshelf.loanBook(titleOrISBN(scanner));
                                                break;
                                        case 4:
                                                bookshelf.returnBook(titleOrISBN(scanner));
                                                break;
                                        case 5:
                                                bookshelf.getBookByTitle(title(scanner));
                                                break;
                                        case 6:
                                                bookshelf.getBookByISBN(title(scanner));
                                                break;
                                        case 7:
                                                bookshelf.getBookByAuthor(title(scanner));
                                                break;
                                        case 8:
                                                bookshelf.sort(0);
                                                break;
                                        case 9:
                                                bookshelf.sort(1);
                                                break;
                                        case 0:
                                                bookshelf.print();
                                                break;
                                        default:
                                                app = false;
                                                break;
                                }

                        }
                        
                        /*
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

                        System.out.println(books);

                        bookshelf.loanBook("Arquitetura Limpa");
                        bookshelf.returnBook("Arquitetura Limpa");

                        // System.out.println(bookshelf.length());

                        // System.out.println("Todos os livros de Robert C. Martin: ");

                        // ArrayList<String> books = bookshelf.getBooksByAuthor("Robert C. Martin");

                        // System.out.println(books);

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

        public static Book createBook(Scanner sc){
                System.out.print("Titulo: ");
                String titulo = sc.next();
                System.out.print("Autor: ");
                String autor = sc.next();
                System.out.print("ISBN: ");
                String isbn = sc.next();

                Book book = new Book(titulo, autor, isbn, true);

                return book;
        }

        public static String titleOrISBN(Scanner sc){
                System.out.print("Titulo ou ISBN: ");
                String titleOrISBN = sc.next();

                return titleOrISBN;
        }

        public static String title(Scanner sc){
                System.out.print("Titulo: ");
                String title = sc.next();

                return title;
        }

        public static String isbn(Scanner sc){
                System.out.print("ISBN: ");
                String isbn = sc.next();

                return isbn;
        }

        public static String autor(Scanner sc){
                System.out.print("ISBN: ");
                String autor = sc.next();

                return autor;
        }
}
