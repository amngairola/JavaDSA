package LinkList.Basic;

public class What {
    public static void main(String[] args) {
        Node n = new Node(4);
        int[] arr = { 1, 2, 3, 4, 6 };
        Node head = convertArr2LL(arr);
        // System.out.println(head.data);

        // traverse the linklist
        int length = 0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            length++;
        }

        System.out.println(" " + length);
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // for last node
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

    // search in LinkedList

    static boolean search(Node head, int val) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == val)
                return true;
            else
                temp = temp.next;
        }

        return false;
    }

    // delete from LinkedList

}