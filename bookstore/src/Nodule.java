public class Nodule<T> {
    private T data;
    private Nodule<T> next;

    public Nodule(T data) {
        this.data = data;
        this.next = null;
    }

    public Nodule(T data, Nodule<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodule<T> getNext() {
        return next;
    }

    public void setNext(Nodule<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodule [data=" + data + ", next=" + next + "]";
    }
}
