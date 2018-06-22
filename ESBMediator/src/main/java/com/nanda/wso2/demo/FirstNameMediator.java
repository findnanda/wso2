package com.nanda.wso2.demo;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class FirstNameMediator extends AbstractMediator { 

	private static final String REGEX = "^[a-zA-Z]+$";
	public boolean mediate(MessageContext context) { 
		String username = (String) context.getProperty("query.param.username");
		return true;
	}
}
