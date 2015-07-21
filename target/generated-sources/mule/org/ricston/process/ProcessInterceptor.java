
package org.ricston.process;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public interface ProcessInterceptor<T,O >{

       T execute(ProcessCallback<T, O> callback, O under, org.mule.api.processor.MessageProcessor messageProcessor, org.mule.api.MuleEvent event) throws Exception;
    T execute(ProcessCallback<T, O> callback, O under, org.mule.api.routing.filter.Filter filter, org.mule.api.MuleMessage message) throws Exception;
}
