import LinkList.LL_medium.Middle.ListNode;

public class LLloop {
    public static void main(String[] args) {

    }

    // 2- Return true if there is a cycle in the linked list. Otherwise, return
    // false.

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    // 2 -return the node where the cycle begins. If there is no cycle, return null.

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;

                }
                return slow;
            }
            ;
        }

        return null;
    }

    // 3- Find length of Loop

    static int countNodesinLoop(Node head) {
        // Add your code here.

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return findLength(slow, fast);
        }

        return 0;

    }

    static int findLength(Node s, Node f) {
        int c = 1;
        f = f.next;
        while (s != f) {
            f = f.next;
            c++;
        }
        return c;
    }

}