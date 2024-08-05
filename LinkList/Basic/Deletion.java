package LinkList.Basic;

public class Deletion {
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
        // head = removeHead(head);
        // head = removeTail(head);
        head = removek(head, 3);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    // delete head of the linked list
    static Node removeHead(Node head) {

        if (head == null)
            return head;
        head = head.next;

        return head;
    }

    // delete tail of the linked list
    static Node removeTail(Node head) {

        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    // delete kth element from linked list

    static Node removek(Node head, int k) {

        if (head.next == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    // delete the node without having access to the head
    public void deleteNode(Node node) {

        node.data = node.next.data;
        node.next = node.next.next;

    }

}
