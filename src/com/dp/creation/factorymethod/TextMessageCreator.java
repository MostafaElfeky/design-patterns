package com.dp.creation.factorymethod;

import com.dp.creation.factorymethod.message.Message;
import com.dp.creation.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
