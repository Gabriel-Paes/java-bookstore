public class Nodule {
    private Book book;
    private Nodule next;

    public Nodule(Book book) {
        this.book = book;
        this.next = null;
    }

    public Nodule(Book book, Nodule next) {
        this.book = book;
        this.next = next;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Nodule getNext() {
        return next;
    }

    public void setNext(Nodule next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodule [book=" + book + ", next=" + next + "]";
    }
}
