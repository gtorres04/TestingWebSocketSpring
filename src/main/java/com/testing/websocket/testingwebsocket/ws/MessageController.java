/**
 * 
 */
package com.testing.websocket.testingwebsocket.ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.testing.websocket.testingwebsocket.dto.Message;

/**
 * @author gtorress
 *
 */
@Controller
public class MessageController {

	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public Message receive(Message message) throws Exception {
		Thread.sleep(3000); // simulated delay
		return message;
	}
}
