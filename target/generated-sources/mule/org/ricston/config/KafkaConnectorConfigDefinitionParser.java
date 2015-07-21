
package org.ricston.config;

import javax.annotation.Generated;
import org.ricston.adapters.KafkaConnectorProcessAdapter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2014-01-06T08:50:04+00:00", comments = "Build 3.4.0.1555.8df15c1")
public class KafkaConnectorConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(KafkaConnectorProcessAdapter.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, KafkaConnectorProcessAdapter.class);
        setDestroyMethodIfNeeded(builder, KafkaConnectorProcessAdapter.class);
        parseProperty(builder, element, "kafkaServerURL", "kafkaServerURL");
        parseProperty(builder, element, "kafkaServerPort", "kafkaServerPort");
        parseProperty(builder, element, "connectionTimeOut", "connectionTimeOut");
        parseProperty(builder, element, "reconnectInterval", "reconnectInterval");
        parseProperty(builder, element, "kafkaProducerBufferSize", "kafkaProducerBufferSize");
        parseProperty(builder, element, "clientId", "clientId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
