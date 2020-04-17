package eg.edu.alexu.csd.datastructure.queue.cs10_cs01_cs30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueLinkedTest {

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Lqueue instance = new Lqueue();
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
        Lqueue instance = new Lqueue();
        instance.enqueue(5);
        instance.enqueue(6);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        Lqueue instance = new Lqueue();
        instance.enqueue(5);
        instance.enqueue(6);
        assertEquals(5, instance.dequeue());
    }

    @Test
    public void testDequeue2() {
        System.out.println("dequeue");
        Lqueue instance = new Lqueue();
        Throwable exception = assertThrows(RuntimeException.class, () -> instance.dequeue());
        assertEquals("The queue is empty!", exception.getMessage());
    } 
}
