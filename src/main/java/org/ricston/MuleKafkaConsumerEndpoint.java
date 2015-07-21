package org.ricston;
import java.util.Properties;

import kafka.consumer.ConsumerConfig;
import kafka.javaapi.consumer.ConsumerConnector;
//@Source
//@Connector(name = "kafkaConsumer")
public class MuleKafkaConsumerEndpoint {
	String topic;
	
	 public MuleKafkaConsumerEndpoint(String topic){
		ConsumerConnector consumer = kafka.consumer.Consumer.createJavaConsumerConnector(createConsumerConfig());
	    this.topic = topic;
	  }

	  private static ConsumerConfig createConsumerConfig()
	  {
	    Properties props = new Properties();
	    props.put("zookeeper.connect", MuleKafkaProperties.zkConnect);
	    props.put("group.id", MuleKafkaProperties.groupId);
	    props.put("zookeeper.session.timeout.ms", "400");
	    props.put("zookeeper.sync.time.ms", "200");
	    props.put("auto.commit.interval.ms", "1000");

	    return new ConsumerConfig(props);

	  }
	 
	  
//	  public void run() {
//	    Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
//	    topicCountMap.put(topic, new Integer(1));
//	    Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer.createMessageStreams(topicCountMap);
//	    KafkaStream<byte[], byte[]> stream =  consumerMap.get(topic).get(0);
//	    ConsumerIterator<byte[], byte[]> it = stream.iterator();
//	    while(it.hasNext())
//	      System.out.println(new String(it.next().message()));
//	  }

}
