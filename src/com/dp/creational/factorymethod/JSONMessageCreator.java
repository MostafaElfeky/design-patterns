package com.dp.creational.factorymethod;

import com.dp.creational.factorymethod.message.JSONMessage;
import com.dp.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
