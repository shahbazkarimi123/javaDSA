public class circular_linked_list {
    public static void main(String[] args)
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(5);
        cll.append(9);
        cll.append(4);
        cll.display();
    }
}


class CircularLinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    public void append(int val)
    {
        Node new_node = new Node(val);
        if(head==null)
        {
            head = new_node;
            return;
        }
        Node temp=head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next = new_node;


    }
    public void display()
    {
        System.out.println("***********All data********");
        Node temp = head;
        while(temp!=null)
        {

            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

}