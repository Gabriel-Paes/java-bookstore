public class LinkedList {
    private Nodule start;
    private Nodule end;
    private int length = 0;

    public void push(Book book) {
        Nodule cell = new Nodule(book);
        if (this.length == 0) {
            this.start = cell;
        } else {
            this.end.setNext(cell);
        }
        this.end = cell;
        this.length++;
    }

    public int length() {
        return this.length;
    }

    public void remove(String nameOrISBN) {
        if (this.length == 0) {
            return;
        }

        if (this.start.getBook().getTitle().equals(nameOrISBN) || this.start.getBook().getISBN().equals(nameOrISBN)) {
            this.start = this.start.getNext();
            if (this.length == 1) {
                this.end = null;
            }
            this.length--;
            return;
        }

        Nodule current = this.start;
        while (current.getNext() != null) {
            if (current.getNext().getBook().getTitle().equals(nameOrISBN)
                    || current.getNext().getBook().getISBN().equals(nameOrISBN)) {
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

    @Override
    public String toString() {
        if (this.length == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[ ");

        Nodule current = this.start;

        for (int i = 0; i < this.length - 1; i++) {
            builder.append(current.getBook()).append(", ");
            current = current.getNext();
        }

        builder.append(current.getBook()).append(" ]");

        return builder.toString();
    }
}