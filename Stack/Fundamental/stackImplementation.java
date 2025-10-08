package Stack.Fundamental;

public class stackImplementation {
    int[] arr;
    private int idx = -1;

    public stackImplementation() {
        this(5);
    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public stackImplementation(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("full hai");
        }
        arr[++idx] = item;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty stack");
        }
        int x = arr[idx];
        idx--;
        return x;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty stack");
        }
        return arr[idx];
    }

    public int size() {
        return idx + 1;
    }

    public void display() {
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
