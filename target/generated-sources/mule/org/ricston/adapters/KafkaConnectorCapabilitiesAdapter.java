
package org.ricston.adapters;

import javax.annotation.Generated;
import org.ricston.KafkaConnector;
import org.ricston.basic.Capabilities;
import org.ricston.basic.Capability;


/**
 * A <code>KafkaConnectorCapabilitiesAdapter</code> is a wrapper around {@link KafkaConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class KafkaConnectorCapabilitiesAdapter
    extends KafkaConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
