public class LinkedList<T> {
    private Nodule<T> start;
    private Nodule<T> end;
    private int length = 0;

    public void push(T data) {
        Nodule<T> cell = new Nodule<T>(data);
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

    public void clear() {
        for (Nodule<T> current = this.start; current != null;) {
            Nodule<T> next = current.getNext();
            current.setData(null);
            current.setNext(null);
            current = next;
        }

        this.start = null;
        this.end = null;
        this.length = 0;
    }

    public T getStart() {
        return this.start.getData();
    }

    @Override
    public String toString() {
        if (this.length == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[ ");

        Nodule<T> current = this.start;

        for (int i = 0; i < this.length - 1; i++) {
            builder.append(current.getData()).append(", ");
            current = current.getNext();
        }

        builder.append(current.getData()).append(" ]");

        return builder.toString();
    }
}