package LinkList.Basic;

public class Insrt {
    static class Node {

        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // array to linkList
    static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]); // cerate a head node
        Node mover = head; // moving pointer *tail
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]); // new node
            mover.next = temp; // store the address of the new node
            mover = temp; // move tail to the new node
        }
        return head;

    }

    public static void main(String[] args) {
        Node n = new Node(4);
        int[] arr = { 1, 2, 3, 4, 6 };
        Node head = convertArr2LL(arr);
        head = insertAtVal(head, 10, 4);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    // insert a new node at the start of the list

    static Node InssertNode(Node head, int val) {
        return new Node(val, head);
    }

    // insert at last

    static Node insertAtLast(Node head, int val) {

        if (head == null)
            return new Node(val);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);

        return head;
    }

    // insert at kth position

    static Node insertAtK(Node head, int val, int k) {

        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return null;
            }

        }

        if (k == 1) {
            return new Node(val, head);
        }

        int count = 1;
        Node temp = head;

        while (temp.next != null) {
            count++;

            if (count == k) {
                Node n = new Node(val, temp.next);
                temp.next = n;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
    // insert at kth position without k

    static Node insertAtVal(Node head, int val, int k) {

        if (head == null) {
            return new Node(val);

        }

        if (head.data == k) {
            return new Node(val, head);
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == k) {
                Node n = new Node(val, temp.next);
                temp.next = n;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

}
