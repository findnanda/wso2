package com.nanda.wso2.demo;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class FirstNameMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		String name = (String) context.getProperty("username") ;
		return name.matches("[Aa-Zz]");
	}
}
