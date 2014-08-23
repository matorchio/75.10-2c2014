package ar.fiuba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest
{
    private static QueueInterface queue;

    @Before
    public void before()
    {
        queue = new Queue();
    }
    
    @Test
    public void EmptyQueueIsEmptyTest()
    {
        assertTrue( queue.isEmpty() );
    }

    @Test
    public void NonEmptyQueueIsEmptyTest()
    {
        this.addGenericElementToQueue();
        
        assertFalse( queue.isEmpty() );
    }
    
    @Test
    public void EmptyQueueSizeTest()
    {
        assertEquals( 0, queue.size() );
    }
    
    @Test
    public void NonEmptyQueueSizeTest()
    {
        assertNotEquals( 0, queue.size() );
    }
    
    @Test
    public void NonEmptyQueueSpecificSizeTest()
    {
        // TODO OJO! estos tests estan acoplados! independizarlos
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        this.addGenericElementToQueue();
        
        assertEquals( 5, queue.size() );
    }
    
    @Test
    public void EmptyQueueAddElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    @Test
    public void NonEmptyQueueAddElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    @Test
    public void EmptyQueueGetTopElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    @Test
    public void NonEmptyQueueGetTopElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    @Test
    public void EmptyQueueRemoveElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    @Test
    public void NonEmptyQueueRemoveElementTest()
    {
        fail( "Not yet implemented" );
    }
    
    private void addGenericElementToQueue()
    {
        queue.add( new Object() );
    }
}