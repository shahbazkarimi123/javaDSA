public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList llst = new LinkedList();
        llst.append(9);
        llst.append(5);
        llst.append(90);
        llst.printList();
        System.out.println("\npushing ahead: ");
        llst.push(4);
        llst.printList();
        llst.insertBetween(9,10);
        llst.insertBetween(90,0);
        llst.printList();
        llst.pop(5);
        llst.pop(9);
        llst.printList();
    }
}

class LinkedList
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
        if(head== null)
        {
            head = new Node(val);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void printList()
    {
        System.out.print("\nTotal list: ");
        Node tnode = head;
        while(tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    //insert at the front of list
    public void push(int val)
    {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }
    public void insertBetween(int position, int val)
    {
        Node pre_node = head;
        Node new_node = new Node(val);

        while(pre_node != null)
        {
            if(pre_node.data == position)
            {
                new_node.next = pre_node.next;
                pre_node.next = new_node;
            }
            pre_node = pre_node.next;
        }
    }
    public void pop(int val)
    {
        Node curr = head;
        Node prev = null;
        while(curr !=null && curr.data !=val)
        {
            prev = curr;
            curr = curr.next;
        }
        if(curr!=null)
        {

            prev.next=curr.next;
        }
    }
}
