
package org.ricston.adapters;

import javax.annotation.Generated;
import org.ricston.KafkaConnector;
import org.ricston.basic.MetadataAware;


/**
 * A <code>KafkaConnectorMetadataAdapater</code> is a wrapper around {@link KafkaConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class KafkaConnectorMetadataAdapater
    extends KafkaConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "kafka";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.0";
    private final static String DEVKIT_BUILD = "3.4.0.1555.8df15c1";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
