package ar.fiuba;

/**
 * The Class EmptyQueueError.
 * 
 * This class implements the Empty Queue Error as an Exception.
 */
public class EmptyQueueError extends AssertionError
{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 808360365014863618L;

    /**
     * Instantiates a new empty queue error.
     */
    public EmptyQueueError()
    {
    }

    /**
     * Instantiates a new empty queue error.
     * 
     * @param message
     *            the message
     */
    public EmptyQueueError( String message )
    {
        super( message );
    }

    /**
     * Instantiates a new empty queue error.
     * 
     * @param message
     *            the message
     * @param throwable
     *            the throwable
     */
    public EmptyQueueError( String message, Throwable throwable )
    {
        super( message, throwable );
    }
}
