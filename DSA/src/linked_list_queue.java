public class linked_list_queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    public linked_list_queue()
    {
        this.front = null;
        this.rear = null;
        this.length = 0;

    }

    private class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data = data;
            this.next = null;

        }

    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length == 0;
    }
    public void enqueue(int data)
    {
        ListNode temp = new ListNode(data);
        if(isEmpty())
        {
            front = temp;
        }
        else
        {
            rear.next = temp;

        }
        rear = temp;
        length ++;
    }
    public void print()
    {
        if(isEmpty())
        {
            return;
        }
        ListNode current = front;
        while(current != null)
        {
            System.out.print(current.data+ " --> ");
            current = current.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args)
    {
        linked_list_queue qu = new linked_list_queue();
        System.out.println(qu.isEmpty());
        qu.enqueue(9);
        qu.enqueue(6);
        qu.enqueue(4);
        qu.print();
        System.out.println(qu.isEmpty());
        System.out.println(qu.length());


    }
}
