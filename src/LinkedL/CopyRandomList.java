package LinkedL;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        Node itr = head;

        while (itr != null) {
            Node temp = new Node(itr.data);
            Node next = itr.next;
            itr.next = temp;
            temp.next = next;

            itr = next;
        }

        itr = head;

        while (itr != null) {
            if (itr.random != null) {
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }

        itr = head;
        Node copyHead = head.next;
        while (itr != null) {
            Node next = itr.next.next;
            Node copy = itr.next;
            itr.next = next;
            if (next != null)
                copy.next = next.next;
            itr = next;
        }
        return copyHead;
    }
}

class Node {
    int data;
    Node next;
    Node random;

    public Node(int val) {
        data = val;
        this.next = null;
        this.random = null;
    }
}
