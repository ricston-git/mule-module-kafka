
package org.ricston.connection;

import javax.annotation.Generated;


/**
 * Exception thrown when the connection needed for executing an
 *  operation is null.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class UnableToAcquireConnectionException
    extends Exception
{

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException() {
    }

    /**
     * Create a new exception
     */
    public UnableToAcquireConnectionException(String message) {
        super(message);
    }

    /**
     * Create a new exception
     *
     * @param throwable Inner exception
     */
    public UnableToAcquireConnectionException(Throwable throwable) {
        super(throwable);
    }
}
