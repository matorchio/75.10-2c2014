package ar.fiuba;

/**
 * The Class Queue.
 * 
 * This class implements a queue.
 */
public class Queue implements QueueInterface
{

    /** The first element. */
    private QueueNodeInterface firstElement;

    /**
     * Instantiates a new queue.
     */
    public Queue()
    {
        firstElement = new TerminalQueueNode();
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueInterface#add(java.lang.Object)
     */
    public void add( Object element )
    {
        firstElement = new GenericQueueNode( element, firstElement );
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals( Object obj )
    {
        if( this == obj )
            return true;
        if( obj == null )
            return false;
        if( getClass() != obj.getClass() )
            return false;
        Queue other = (Queue) obj;
        if( firstElement == null )
        {
            if( other.firstElement != null )
                return false;
        } else
            if( !firstElement.equals( other.firstElement ) )
                return false;
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( firstElement == null ) ? 0 : firstElement.hashCode() );
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueInterface#isEmpty()
     */
    public boolean isEmpty()
    {
        return firstElement.countElements() == 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueInterface#remove()
     */
    public void remove() throws AssertionError
    {
        firstElement = firstElement.getNextNode();
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueInterface#size()
     */
    public int size()
    {
        return firstElement.countElements();
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueInterface#top()
     */
    public Object top() throws AssertionError
    {
        return firstElement.getElement();
    }
}
