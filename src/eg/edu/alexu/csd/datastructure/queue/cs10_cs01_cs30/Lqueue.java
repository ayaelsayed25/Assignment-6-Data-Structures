package eg.edu.alexu.csd.datastructure.queue.cs10_cs01_cs30;

public class Lqueue implements IQueue, ILinkedBased {
    private class Node{
        Object data;
        Node next;
    }
    Node front , rear;
    int size;
    public Lqueue(){
        front = null;
        rear = null;
        size = 0;
    }
    @Override
    public void enqueue(Object item) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = item;
        rear.next = null;
        if (isEmpty())
        {
            front = rear;
        }
        else
        {
            oldRear.next = rear;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        try {
            Object temp = front.data;
            front = front.next;
            if (isEmpty())
            {
                rear = null;
            }
            size--;
            return temp;
        }
        catch (Exception e){
            throw new RuntimeException("The queue is empty!");
        }
    }
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Lqueue test = new Lqueue();
        test.enqueue("hgajg");
        test.enqueue(54);
        test.enqueue(55);
        test.enqueue(54);
        test.enqueue(55);
        test.enqueue(54);
        test.dequeue();
        System.out.println(test.dequeue());
        System.out.println(test.size());

    }
}
