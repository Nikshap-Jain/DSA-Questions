package Queue.Fundamental;

public class DynamicQueue extends Queue {

    @Override
    public void enqueue(int item) throws Exception {
        if (isFull()) {
            int[] new_arr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                int idx = (front + i) % arr.length;
                new_arr[i] = arr[idx];
            }
            arr = new_arr;
            front = 0;
        }
        super.enqueue(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicQueue dq = new DynamicQueue();
        dq.enqueue(10);
        dq.enqueue(20);
        dq.enqueue(30);
        dq.enqueue(40);
        System.out.println(dq.dequeue());
        System.out.println(dq.dequeue());
        dq.enqueue(50);
        dq.enqueue(60);
        dq.enqueue(70);
        dq.enqueue(80);
        dq.display();
    }
}
