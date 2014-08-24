package ar.fiuba;

/**
 * The Class TerminalQueueNode.
 * 
 * This class implements terminal queue node, which is used as the last node of a queue.
 */
public class TerminalQueueNode implements QueueNodeInterface
{
    
    /**
     * Instantiates a new terminal queue node.
     */
    public TerminalQueueNode()
    {
    }

    /* (non-Javadoc)
     * @see ar.fiuba.QueueNodeInterface#countElements()
     */
    public int countElements()
    {
        return 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals( Object obj )
    {
        if( this == obj )
            return true;
        if( obj == null )
            return false;
        return obj instanceof TerminalQueueNode;
    }

    /* (non-Javadoc)
     * @see ar.fiuba.QueueNodeInterface#getElement()
     */
    public Object getElement()
    {
        throw new EmptyQueueError();
    }

    /* (non-Javadoc)
     * @see ar.fiuba.QueueNodeInterface#getNextNode()
     */
    public QueueNodeInterface getNextNode()
    {
        throw new EmptyQueueError();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return 0;
    }
}
