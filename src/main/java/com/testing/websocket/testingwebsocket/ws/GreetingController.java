/**
 * 
 */
package com.testing.websocket.testingwebsocket.ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.testing.websocket.testingwebsocket.dto.Greeting;
import com.testing.websocket.testingwebsocket.dto.HelloMessage;

@Controller
public class GreetingController {
	public static String cadena = "123";

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {

		System.out.println(cadena);
		cadena = message.getName() + cadena;
		return new Greeting(cadena);
	}

}
