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
        head = insertK(head, 5, 8);

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
    // 2- delete the Tail

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

    // 3- delete the kth element

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

    // 4- delete by value

    static void deleteByValue(Node temp) {

        Node back = temp.prev;
        Node front = temp.next;

        if (front == null) {
            back.next = null;
            temp.prev = null;
            return;
        }

        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;

    }

    // -----Insertion------

    // 1--- at the beginning

    static Node BeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.prev = newHead;

        return newHead;
    }

    // 2- before the tail

    static Node BeforeTail(Node head, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }

        Node tmp = new Node(val, temp, temp.prev);

        temp.prev.next = tmp;
        temp.prev = tmp;

        return head;
    }

    // 3---insert before k---
    static Node insertK(Node head, int k, int val) {

        if (k == 1) {
            return BeforeHead(head, val);
        }

        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt += 1;
            if (cnt == k)
                break;
            temp = temp.next;
        }
        Node back = temp.prev;

        Node tmp = new Node(val, temp, back);
        back.next = tmp;
        temp.prev = tmp;

        return head;
    }

}
