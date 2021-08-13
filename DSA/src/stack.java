import java.util.EmptyStackException;

public class stack {
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        System.out.println("isEmpty: "+stack.isEmpty());
        stack.push(2);
        stack.push(6);
        stack.push(4);
        System.out.println("Peak: "+stack.peak());
        System.out.println("isEmpty: "+stack.isEmpty());

        System.out.println("Length: "+stack.lenth());
        stack.pop();
        System.out.println("Length: "+stack.lenth());
        System.out.println("Peak: "+stack.peak());

    }
}

class Stack
{
    private ListNode top;
    private int length;


    private class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data =data;

        }
    }
    public Stack()
    {
        top = null;
        length = 0;
    }
    public int lenth()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length == 0;
    }
    public void push(int data)
    {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length ++;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peak()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.data;
    }


}
