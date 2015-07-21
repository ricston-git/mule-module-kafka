package org.ricston;

import org.junit.Test;
import org.mule.api.callback.SourceCallback;
import org.mule.tck.junit4.FunctionalTestCase;

public class ProducerConsumerTest extends FunctionalTestCase {

	@Override
	protected String getConfigResources() {
		return "mule-config.xml";
	}

	@Test
	public void producerConsumerTest() {
		String topic = "mule_test_topic";
		SourceCallback scb = new TestCallback();
		KafkaConnector kc = new KafkaConnector();

		for (int i = 0; i < 1000; i++) {
			kc.send(topic, "mule message " + i);			
		}

		// consume the messages on the test
		for (int i = 0; i < 1000; i++) {
			kc.consumer(scb, topic);
		}

	}
}
