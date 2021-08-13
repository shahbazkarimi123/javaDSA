public class queue_array {

    public  static class Queue
    {
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enQueue(int data)
        {
            queue[rear] = data;
            rear = (rear + 1)%5;
            size = size + 1;

        }

        public int deQueue()
        {
            int data = queue[front];
            front = (front+1)%5;
            size = size - 1;

            return data;
        }
        public void show()
        {
            System.out.print("Elements: ");
            for(int i=0;i<size;i++)
            {
                System.out.print(queue[(front+i)%5] +" ");
            }
        }
    }


    public static void main(String[] agrs)
    {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(8);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(12);
        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(12);
        q.deQueue();
        q.show();


    }

}
