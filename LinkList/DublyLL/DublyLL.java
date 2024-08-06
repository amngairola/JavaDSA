package LinkList.DublyLL;

public class DublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        // for last node
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 6 };
        Node head = convertArr(arr);
        head = deleteByValue(head, 5);
        print(head);
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // convert to a linked list

    static Node convertArr(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // ----------------Deletion----------

    // 1- delete the head

    static Node removeHead(Node head) {

        if (head == null || head.next == null)
            return null;

        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;

        return head;
    }
    // 1- delete the Tail

    static Node removeTail(Node head) {

        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;

        return head;
    }

    // delete the kth element

    static Node deleteK(Node head, int k) {

        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt += 1;
            if (cnt == k)
                break;
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;

        if (back == null && front == null) {
            return null;

        }
        if (back == null) {
            return removeHead(head);
        }

        if (front == null) {
            return removeTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;

        return head;
    }

    // delete by value

    static Node deleteByValue(Node head, int val) {

        Node temp = head;

        while (temp.next != null) {
            if (temp.data == val) {
                break;
            }
            temp = temp.next;
        }

        Node back = temp.prev;
        Node front = temp.next;

        if (back == null && front == null) {
            return null;

        }
        if (back == null) {
            return removeHead(head);
        }

        if (front == null) {
            return removeTail(head);
        }

        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;

        return head;
    }

}
