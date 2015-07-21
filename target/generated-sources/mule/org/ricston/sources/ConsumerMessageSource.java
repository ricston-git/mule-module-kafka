
package org.ricston.sources;

import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.callback.SourceCallback;
import org.mule.api.construct.FlowConstructAware;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.source.MessageSource;
import org.ricston.KafkaConnector;
import org.ricston.adapters.KafkaConnectorProcessAdapter;
import org.ricston.process.ProcessAdapter;
import org.ricston.process.ProcessCallback;
import org.ricston.process.ProcessTemplate;
import org.ricston.processors.AbstractListeningMessageProcessor;


/**
 * ConsumerMessageSource wraps {@link org.ricston.KafkaConnector#consumer(org.mule.api.callback.SourceCallback, java.lang.String)} method in {@link KafkaConnector } as a message source capable of generating Mule events.  The POJO's method is invoked in its own thread.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class ConsumerMessageSource
    extends AbstractListeningMessageProcessor<Object>
    implements Runnable, FlowConstructAware, MuleContextAware, Startable, Stoppable, MessageSource
{

    protected Object topic;
    protected String _topicType;
    /**
     * Thread under which this message source will execute
     * 
     */
    private Thread thread;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    /**
     * Sets topic
     * 
     * @param value Value to set
     */
    public void setTopic(Object value) {
        this.topic = value;
    }

    /**
     * Method to be called when Mule instance gets started.
     * 
     */
    public void start()
        throws MuleException
    {
        if (thread == null) {
            thread = new Thread(this, "Receiving Thread");
        }
        thread.start();
    }

    /**
     * Method to be called when Mule instance gets stopped.
     * 
     */
    public void stop()
        throws MuleException
    {
        thread.interrupt();
    }

    /**
     * Implementation {@link Runnable#run()} that will invoke the method on the pojo that this message source wraps.
     * 
     */
    public void run() {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(KafkaConnectorProcessAdapter.class, false, null);
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            final SourceCallback sourceCallback = this;
            final String transformedTopic = ((String) transform(getMuleContext(), ((MuleEvent) null), getClass().getDeclaredField("_topicType").getGenericType(), null, topic));
            processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    ((KafkaConnector) object).consumer(sourceCallback, transformedTopic);
                    return null;
                }

            }
            , null, ((MuleEvent) null));
        } catch (Exception e) {
            getMuleContext().getExceptionListener().handleException(e);
        }
    }

}
