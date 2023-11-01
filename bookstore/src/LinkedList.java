import java.util.ArrayList;

public class LinkedList {
    private Nodule start;
    private Nodule end;
    private int length = 0;
    private int isSortedBy = 0; // 0 = title; 1 = author;

    public void push(Book book) {
        if (this.isSortedBy == 0) {
            insertionSortByTitle(book);
        } else {
            insertionSortByAuthor(book);
        }
        this.length++;
    }

    public int length() {
        return this.length;
    }

    public void remove(String titleOrISBN) {
        if (this.length == 0) {
            return;
        }

        if (this.start.getBook().getTitle().equals(titleOrISBN) || this.start.getBook().getISBN().equals(titleOrISBN)) {
            this.start = this.start.getNext();
            if (this.length == 1) {
                this.end = null;
            }
            this.length--;
            return;
        }

        Nodule current = this.start;
        while (current.getNext() != null) {
            if (current.getNext().getBook().getTitle().equals(titleOrISBN)
                    || current.getNext().getBook().getISBN().equals(titleOrISBN)) {
                current.setNext(current.getNext().getNext());

                if (current.getNext() == null) {
                    this.end = current;
                }
                this.length--;
                return;
            }
            current = current.getNext();
        }
    }

    public void clear() {
        for (Nodule current = this.start; current != null;) {
            Nodule next = current.getNext();
            current.setBook(null);
            current.setNext(null);
            current = next;
        }

        this.start = null;
        this.end = null;
        this.length = 0;
    }

    public Book getBookByTitle(String title) {
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getTitle().equals(title)) {
                return current.getBook();
            }
        }
        return null;
    }

    public Book getBookByAuthor(String author) {
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getAuthor().equals(author)) {
                return current.getBook();
            }
        }
        return null;
    }

    public Book getBookByISBN(String ISBN) {
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getISBN().equals(ISBN)) {
                return current.getBook();
            }
        }
        return null;
    }

    public ArrayList<String> getBooksByAuthor(String author) {
        ArrayList<String> booksByAuthor = new ArrayList<String>();
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getAuthor().equals(author)) {
                booksByAuthor.add(current.getBook().getTitle());
            }
        }
        return booksByAuthor;
    }

    public void loanBook(String titleOrISBN) {
        boolean isFindBook = false;
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getTitle().equals(titleOrISBN) || current.getBook().getISBN().equals(titleOrISBN)) {
                if (current.getBook().getIsAvailable()) {
                    current.getBook().setIsAvailable(false);
                    System.out.println("O livro será emprestado para você!");
                } else {
                    System.out.println("Livro já está emprestado!");
                }
                isFindBook = true;
                break;
            }
        }

        if (!isFindBook) {
            System.out.println("Livro não encontrado");
        }
    }

    public void returnBook(String titleOrISBN) {
        boolean isFindBook = false;
        for (Nodule current = this.start; current != null; current = current.getNext()) {
            if (current.getBook().getTitle().equals(titleOrISBN) || current.getBook().getISBN().equals(titleOrISBN)) {
                if (!current.getBook().getIsAvailable()) {
                    current.getBook().setIsAvailable(true);
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("O livro já foi devolvido!");
                }
                isFindBook = true;
                break;
            }
        }

        if (!isFindBook) {
            System.out.println("Livro não encontrado");
        }
    }

    private void insertionSortByTitle(Book book) {
        Nodule cell = new Nodule(book);
        if (this.length == 0) {
            this.start = cell;
            this.end = cell;
        } else if (book.getTitle().compareTo(this.start.getBook().getTitle()) <= 0) {
            cell.setNext(this.start);
            this.start = cell;
        } else if (book.getTitle().compareTo(this.end.getBook().getTitle()) >= 0) {
            this.end.setNext(cell);
            this.end = cell;
        } else {
            Nodule current = this.start;
            while (current.getNext() != null && book.getTitle().compareTo(current.getNext().getBook().getTitle()) > 0) {
                current = current.getNext();
            }
            cell.setNext(current.getNext());
            current.setNext(cell);
        }
    }

    private void insertionSortByAuthor(Book book) {
        Nodule cell = new Nodule(book);
        if (this.length == 0) {
            this.start = cell;
            this.end = cell;
        } else if (book.getAuthor().compareTo(this.start.getBook().getAuthor()) <= 0) {
            cell.setNext(this.start);
            this.start = cell;
        } else if (book.getAuthor().compareTo(this.end.getBook().getAuthor()) >= 0) {
            this.end.setNext(cell);
            this.end = cell;
        } else {
            Nodule current = this.start;
            while (current.getNext() != null
                    && book.getAuthor().compareTo(current.getNext().getBook().getAuthor()) > 0) {
                current = current.getNext();
            }
            cell.setNext(current.getNext());
            current.setNext(cell);
        }
    }

    public void print() {
        if (this.length == 0) {
            System.out.println("[]");
        }

        for (Nodule current = this.start; current != null; current = current.getNext()) {
            current.getBook().printBook();
        }
    }
}