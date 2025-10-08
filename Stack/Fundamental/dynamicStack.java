package Stack.Fundamental;

public class dynamicStack extends stackImplementation {
    @Override
    public void push(int item) throws Exception {
        if (isFull()) {
            int[] new_arr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        super.push(item);
    }

    public static void main(String[] args) throws Exception {
        dynamicStack ds = new dynamicStack();
        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);
        ds.push(6);
        ds.push(7);
        ds.push(8);
        ds.push(9);
        ds.push(10);
        System.out.println(ds.peek());
        System.out.println(ds.pop());
        ds.display();
    }
}
