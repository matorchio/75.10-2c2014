package ar.fiuba;

/**
 * The Interface QueueNodeInterface.
 */
public interface QueueNodeInterface
{

    /**
     * Gets the element.
     * 
     * @return the element
     */
    public Object getElement();

    /**
     * Gets the next node.
     * 
     * @return the next node
     */
    public QueueNodeInterface getNextNode();

    /**
     * Count elements.
     * 
     * @return the elements count
     */
    public int countElements();
}
