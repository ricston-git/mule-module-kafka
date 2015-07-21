package org.ricston;
import java.util.Map;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.callback.SourceCallback;


public class TestCallback implements SourceCallback{

	@Override
	public Object process() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object process(Object payload) throws Exception {
		System.err.println("received payload + " + payload );
		return this;
	}

	@Override
	public Object process(Object payload, Map<String, Object> properties) throws Exception {
		System.err.println("received payload + " + payload );
		return this;
	}

	public MuleEvent processEvent(MuleEvent event) throws MuleException {
		// TODO Auto-generated method stub
		return null;
	}	

}
