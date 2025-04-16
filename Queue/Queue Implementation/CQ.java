public class CQ<T> {
    private int front = 0;
    private int end = 0;
    private int size = 0;
    private Object[] arr;

    CQ() {
        arr = new Object[10];
    }

    CQ(int size) {
        arr = new Object[size];
    }

    public void add(T data) {
        if (isFull()) {
            resize();
        }
        arr[end] = data;
        end++;
        end = end % arr.length;
        size++;
    }

    public Object remove() {
        if (isEmpty()) {
            return "No Elements in the CircularQueue";
        }
        T val = (T) arr[front];
        front++;
        front = front % arr.length;
        size--;
        return val;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        Object[] temp = new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[(front + i) % arr.length];
        }
        arr = temp;
        front = 0;
        end = size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i < end; i++) {
            sb.append(arr[i % arr.length]).append(",");
        }
        if (size > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
