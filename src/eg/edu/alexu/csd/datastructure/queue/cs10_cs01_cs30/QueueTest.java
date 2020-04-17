package eg.edu.alexu.csd.datastructure.queue.cs10_cs01_cs30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        int capacity = 5;
        Aqueue instance = new Aqueue(capacity);
        instance.enqueue(5);
        instance.enqueue(6);
        instance.enqueue(7);
        instance.dequeue();
        assertEquals(2, instance.size());
    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        int capacity = 5;
        Aqueue instance = new Aqueue(capacity);
        instance.enqueue(5);
        instance.enqueue(6);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        int capacity = 1;
        Aqueue instance = new Aqueue(capacity);
        instance.enqueue(5);
        Throwable exception = assertThrows(RuntimeException.class, () -> instance.enqueue(6));
        assertEquals("Queue is full!!", exception.getMessage());
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        int capacity = 5;
        Aqueue instance = new Aqueue(capacity);
        instance.enqueue(5);
        instance.enqueue(6);
        assertEquals(5, instance.dequeue());
    }

    @Test
    public void testDequeue2() {
        System.out.println("dequeue");
        int capacity = 5;
        Aqueue instance = new Aqueue(capacity);
        Throwable exception = assertThrows(RuntimeException.class, () -> instance.dequeue());
        assertEquals("Queue is already empty!!", exception.getMessage());
    }

}
