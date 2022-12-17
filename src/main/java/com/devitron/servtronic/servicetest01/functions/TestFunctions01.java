package com.devitron.servtronic.servicetest01.functions;

import com.devitron.servtronic.servicebase.annotations.ServiceMethod;
import com.devitron.servtronic.servicetest01.config.Config;
import com.devitron.servtronic.servicetest01.config.ServiceTest01Config;
import com.devitron.servtronic.servicetest01.messages.MessageSet01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestFunctions01 {

    @ServiceMethod(name = "PrintHello")
    public static MessageSet01.PrintHelloReply printHello(MessageSet01.PrintHelloRequest request) {


        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ServiceTest01Config config = (ServiceTest01Config) context.getBean("getConfig", ServiceTest01Config.class);

        MessageSet01.PrintHelloReply reply = new MessageSet01.PrintHelloReply(request);

        //reply.setFinalMessage(request.getFieldString() + " " + request.getFieldInteger() + " " + config.getMessage01());
        reply.setFinalMessage(request.getFieldString() + " " + request.getFieldInteger());

        System.out.println("Hello. " + reply.getFinalMessage());

        return reply;
    }


}
