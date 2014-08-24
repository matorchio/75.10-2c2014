package ar.fiuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QueueTest
{
    private static QueueInterface queue;
    private static Object         comparableElement = new Object();

    @Rule
    public ExpectedException      exception         = ExpectedException.none();

    @Before
    public void before()
    {
        queue = new Queue();
    }

    @Test
    public void testIsEmptyInEmptyQueueTest()
    {
        assertTrue( queue.isEmpty() );
    }

    @Test
    public void testIsEmptyInNonEmptyQueueTest()
    {
        this.addGenericElementToQueue();

        assertFalse( queue.isEmpty() );
    }

    @Test
    public void getSizeOfEmptyQueueTest()
    {
        assertEquals( 0, queue.size() );
    }

    @Test
    public void getSizeOfNonEmptyQueueTest()
    {
        this.addGenericElementToQueue();

        assertNotEquals( 0, queue.size() );
    }

    @Test
    public void addElementToEmptyQueueTest()
    {
        this.addGenericElementToQueue();

        assertEquals( 1, queue.size() );
    }

    @Test
    public void addElementToNonEmptyQueueTest()
    {
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();

        assertEquals( 5, queue.size() );
    }

    @Test
    public void getTopElementFromEmptyQueueTest()
    {
        exception.handleAssertionErrors();
        exception.expect( AssertionError.class );

        queue.top();
    }

    @Test
    public void getTopElementFromNonEmptyQueueWithOnlyOneElementTest()
    {
        queue.add( comparableElement );

        assertEquals( comparableElement, queue.top() );
    }

    @Test
    public void getTopElementFromNonEmptyQueueWithMoreThanOneElementTest()
    {
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();

        queue.add( comparableElement );

        assertEquals( comparableElement, queue.top() );
    }

    @Test
    public void removeElementFromEmptyQueueTest()
    {
        exception.handleAssertionErrors();
        exception.expect( AssertionError.class );

        queue.remove();
    }

    @Test
    public void removeElementFromNonEmptyQueueWithOnlyOneElementTest()
    {
        this.addGenericElementToQueue();

        queue.remove();

        assertTrue( queue.isEmpty() );
    }

    @Test
    public void removeElementFromNonEmptyQueueWithMoreThanOneElementTest()
    {
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();

        queue.remove();

        assertEquals( 2, queue.size() );
    }

    @Test
    public void removeAllElementsFromQueueTest()
    {
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();

        queue.remove();
        queue.remove();
        queue.remove();

        assertTrue( queue.isEmpty() );
    }

    private void addGenericElementToQueue()
    {
        queue.add( new Object() );
    }
}