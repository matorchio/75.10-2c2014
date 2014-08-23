package ar.fiuba;

/**
 * The Interface Queue.
 */
public interface QueueInterface
{
    
    /**
     * Checks if is empty.
     *
     * @return true, if is empty
     */
    boolean isEmpty();
    
    /**
     * Size.
     *
     * @return the number of elements in the queue
     */
    int size();
    
    /**
     * Adds one element to the queue.
     *
     * @param element the element to add to the queue.
     */
    void add(Object element);
    
    /**
     * Returns first element in the queue.
     * 
     * @throws AssertionError
     *
     * @return first element in the queue.
     */
    Object top() throws AssertionError;
    
    /**
     * Removes the first element in the queue.
     */
    void remove()  throws AssertionError;
}
