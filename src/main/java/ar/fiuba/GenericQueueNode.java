package ar.fiuba;

/**
 * The Class GenericQueueNode.
 * 
 * This class implements a generic queue node, which is any node in a queue that is not the last one.
 */
public class GenericQueueNode implements QueueNodeInterface
{

    /** The element. */
    private Object             element;

    /** The next node. */
    private QueueNodeInterface nextNode;

    /**
     * Instantiates a new generic queue node.
     * 
     * @param element
     *            the element
     * @param nextNode
     *            the next node
     */
    public GenericQueueNode( Object element, QueueNodeInterface nextNode )
    {
        init( element, nextNode );
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueNodeInterface#countElements()
     */
    public int countElements()
    {
        return 1 + nextNode.countElements();
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
        GenericQueueNode other = (GenericQueueNode) obj;
        if( element == null )
        {
            if( other.element != null )
                return false;
        } else
            if( !element.equals( other.element ) )
                return false;
        if( nextNode == null )
        {
            if( other.nextNode != null )
                return false;
        } else
            if( !nextNode.equals( other.nextNode ) )
                return false;
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueNodeInterface#getElement()
     */
    public Object getElement()
    {
        return element;
    }

    /*
     * (non-Javadoc)
     * 
     * @see ar.fiuba.QueueNodeInterface#getNextNode()
     */
    public QueueNodeInterface getNextNode()
    {
        return nextNode;
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
        result = prime * result + ( ( element == null ) ? 0 : element.hashCode() );
        result = prime * result + ( ( nextNode == null ) ? 0 : nextNode.hashCode() );
        return result;
    }

    /**
     * Inits the Generic Queue Node.
     * 
     * @param element
     *            the element
     * @param nextNode
     *            the next node
     */
    private void init( Object element, QueueNodeInterface nextNode )
    {
        this.element = element;
        this.nextNode = nextNode;
    }
}
