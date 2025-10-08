import java.util.*;
//26

public class ReverseNodeInKGroup {
    public class Listnode {
        int val;
        ListNode next;

        void ListNode() {

        };

        void ListNode(int val) {
            this.val = val;
        }

        void ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            Stack<ListNode> st = new Stack<>();
            ListNode groupStart = head;
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            int count = 0;
            while (head != null) {

                st.push(head);
                count++;
                head = head.next;

                if (count == k) {
                    while (!st.isEmpty()) {
                        dummy.next = st.pop();
                        dummy = dummy.next;
                    }
                    groupStart = head;
                    count = 0;
                }

            }
            if (!st.isEmpty()) {
                dummy.next = groupStart;
            } else {
                dummy.next = null;
            }
            return temp.next;

        }
    }
}
