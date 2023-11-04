import java.util.ArrayList;
import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                try (Scanner scanner = new Scanner(System.in)) {
                        int opc;
                        boolean app = true;

                        LinkedList bookshelf = new LinkedList();

                        bookshelf.push(new Book("A Sociedade do Anel", "J.R.R. Tolkien", "978-85-01-04965-1", true));
                        bookshelf.push(new Book("As Duas Torres", "J.R.R. Tolkien", "978-85-01-05035-0", true));
                        bookshelf.push(new Book("O Retorno do Rei", "J.R.R. Tolkien", "978-85-01-05869-3", true));
                        bookshelf.push(new Book("O Hobbit", "J.R.R. Tolkien", "978-85-359-0277-9", true));
                        bookshelf.push(new Book("Arquitetura Limpa", "Robert C. Martin", "978-85-508-0460-6", true));
                        bookshelf.push(new Book("Ahsoka", "E. K. Johnston", "978-65-5609-027-6", true));
                        bookshelf.push(new Book("Guerra e Paz", "Leon Tolstói", "978-85-359-0272-1", true));
                        bookshelf.push(new Book("A Arte da Guerra", "Sun Tzu", "978-85-7153-223-9", true));
                        bookshelf.push(new Book("O Velho e o Mar", "Ernest Hemingway", "978-85-325-2846-4", true));
                        bookshelf.push(new Book("Star Wars: Herdeiro do Império", "Timothy Zahn", "978-85-7852-176-3",
                                        true));
                        bookshelf.push(new Book("Star Wars: A Trilogia Thrawn", "Timothy Zahn", "978-85-7852-142-8",
                                        true));
                        bookshelf.push(new Book("Star Wars: O Caminho Jedi", "Daniel Wallace", "978-85-250-3580-1",
                                        true));
                        bookshelf.push(new Book("Clean Code: A Handbook of Agile Software Craftsmanship",
                                        "Robert C. Martin", "978-85-62650-44-2", true));
                        bookshelf.push(new Book("Design Patterns: Elements of Reusable Object-Oriented Software",
                                        "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, Grady Booch",
                                        "978-85-7883-351-0", true));
                        bookshelf.push(new Book("Introdução à Teoria da Computação", "Michael Sipser",
                                        "978-85-221-1779-0", true));

                        System.out.println("BIBLIOTECA");

                        while (app) {
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
                                scanner.nextLine();

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
                                                isNullOrBook(bookshelf.getBookByTitle(title(scanner)));
                                                break;
                                        case 6:
                                                isNullOrBook(bookshelf.getBookByISBN(isbn(scanner)));
                                                break;
                                        case 7:
                                                ArrayList<String> booksByAuthor = bookshelf
                                                                .getBooksByAuthor(autor(scanner));
                                                System.out.println(booksByAuthor);
                                                break;
                                        case 8:
                                                bookshelf.sort(0);
                                                bookshelf.print();
                                                break;
                                        case 9:
                                                bookshelf.sort(1);
                                                bookshelf.print();
                                                break;
                                        case 0:
                                                bookshelf.print();
                                                break;
                                        default:
                                                app = false;
                                                break;
                                }
                        }
                }
        }

        public static Book createBook(Scanner sc) {
                System.out.print("Titulo: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();

                Book book = new Book(titulo, autor, isbn, true);

                return book;
        }

        public static String titleOrISBN(Scanner sc) {
                System.out.print("Titulo ou ISBN: ");
                String titleOrISBN = sc.nextLine();

                return titleOrISBN;
        }

        public static String title(Scanner sc) {
                System.out.print("Titulo: ");
                String title = sc.nextLine();

                return title;
        }

        public static String isbn(Scanner sc) {
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();

                return isbn;
        }

        public static String autor(Scanner sc) {
                System.out.print("Autor: ");
                String autor = sc.nextLine();

                return autor;
        }

        public static void isNullOrBook(Book book) {
                if (book != null) {
                        book.printBook();
                } else {
                        System.out.println("Livro não encontrado");
                }
        }
}
