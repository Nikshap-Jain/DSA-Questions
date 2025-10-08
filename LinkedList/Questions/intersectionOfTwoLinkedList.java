public class intersectionOfTwoLinkedList {
    public static void main(String[] args) {
        // 1st way if lens is allowed than find max length between two and jiski bdi hai
        // ek utne aage se chla do

        // 2nd way , relative - 2 khali dost
        // ListNode a = headA;
        // ListNode b = headB
        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b = null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}
