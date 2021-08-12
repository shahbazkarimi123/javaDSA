public class DoublyLinkedList {
    public static void main(String[] args)
    {
        DLinkList dll = new DLinkList();
        dll.append(10);
        dll.append(45);
        dll.append(6);
        dll.display();
        dll.append(7);
        dll.append(2);
        dll.append(0);
        dll.display();
        dll.insertAtBeggining(12);
        dll.display();
        dll.insertAtposition(7,11);
        dll.display();
    }
}

class DLinkList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int val)
        {
            data = val;
            next = null;
            prev = null;

        }
    }

    public void append(int val)
    {
        Node new_node = new Node(val);
        if(head == null)
        {
            head = new_node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next=new_node;
        new_node.prev = temp;
    }

    public void insertAtBeggining(int val)
    {
        Node temp=head;
        Node new_node = new Node(val);
        new_node.next = head;
        if(head != null)
        {
            head.prev=new_node;

        }
        head = new_node;
    }

    public void insertAtposition(int pos,int val)
    {
        Node temp = head;
        Node new_node = new Node(val);
        while(temp.data != pos)
        {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
        new_node.prev = temp;
    }

    public void display()
    {
        Node temp = head;
        System.out.println("*********All data**********");
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");

    }
}