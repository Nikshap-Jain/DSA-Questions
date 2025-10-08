package Stack.Fundamental;

public class stackImplementationClient {

    public static void main(String[] args) throws Exception {
        stackImplementation st = new stackImplementation();
        st.push(3);
        st.push(34);
        System.out.println(st.peek());
        st.display();
    }
}
