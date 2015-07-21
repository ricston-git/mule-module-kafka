package org.ricston;
//import kafka.javaapi.producer.Producer;
import java.util.Properties;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class Producer {
//  private final kafka.javaapi.producer.Producer<Integer, String> producer;
  
  private final Properties props = new Properties();

	
	@SuppressWarnings("unchecked")
	public void send(String topic, String message)
	  {
	    props.put("serializer.class", "kafka.serializer.StringEncoder");
	    props.put("metadata.broker.list", "localhost:9092");
	    // Use random partitioner. Don't need the key type. Just set it to Integer.
	    // The message is of type String.
	    kafka.javaapi.producer.Producer producer = new kafka.javaapi.producer.Producer<Integer, String>(new ProducerConfig(props));
	    producer.send(new KeyedMessage<Integer, String>(topic, message));
	    
	  }
}
