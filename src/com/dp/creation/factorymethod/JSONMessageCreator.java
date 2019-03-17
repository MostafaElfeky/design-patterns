package com.dp.creation.factorymethod;

import com.dp.creation.factorymethod.message.JSONMessage;
import com.dp.creation.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
