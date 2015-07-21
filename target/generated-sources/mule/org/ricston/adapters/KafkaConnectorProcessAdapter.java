
package org.ricston.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.ricston.KafkaConnector;
import org.ricston.process.ProcessAdapter;
import org.ricston.process.ProcessCallback;
import org.ricston.process.ProcessTemplate;
import org.ricston.process.ProcessTemplate;


/**
 * A <code>KafkaConnectorProcessAdapter</code> is a wrapper around {@link KafkaConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class KafkaConnectorProcessAdapter
    extends KafkaConnectorLifecycleAdapter
    implements ProcessAdapter<KafkaConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, KafkaConnectorCapabilitiesAdapter> getProcessTemplate() {
        final KafkaConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,KafkaConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, KafkaConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, KafkaConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
