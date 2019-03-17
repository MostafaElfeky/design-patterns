package com.dp.creational.factorymethod;

import com.dp.creational.factorymethod.message.Message;
import com.dp.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
