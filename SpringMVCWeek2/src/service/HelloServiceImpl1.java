package service;

import org.springframework.stereotype.Service;

import model.Message;

@Service
public class HelloServiceImpl1 implements HelloService1 {

	@Override
	public String getNamee() {
		
		Message message=new Message();
        String greetingMessage = message.getMessageString();
        return greetingMessage;
	}


}
