
package org.ricston.adapter;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public interface HttpCallbackAdapter {

      Integer getLocalPort();

    Integer getRemotePort();

    String getDomain();

    org.mule.api.transport.Connector getConnector();

    Boolean getAsync();

    String getPath();
}
