package eg.edu.alexu.csd.datastructure.queue.cs10_cs01_cs30;

public class Aqueue implements IQueue, IArrayBased {
    int capacity;
    Object[] queue;
    public Aqueue(int n) {
        capacity = n;
        queue= new Object[capacity];
    }
        int front = -1;
        int rear = -1;
        int size = 0;

        public boolean isFull () {
            return (rear + 1) % capacity == front;
        }
        @Override
        public void enqueue (Object item){
            if (isFull()) {
                throw new RuntimeException("Queue is full!!");
            } else if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            queue[rear] = item;
            size++;

        }

        @Override
        public Object dequeue () {
            Object temp;
            if (isEmpty()) {
                throw new RuntimeException("Queue is already empty!!");
            } else {
                temp = queue[front];
                if (rear == front) {
                    front = rear = -1;
                } else {
                    front = (front + 1) % capacity;
                }
                size--;
            }
            return temp;
        }

        @Override
        public boolean isEmpty () {
            return size == 0;
        }

        @Override
        public int size () {
            return size;
        }
    }
