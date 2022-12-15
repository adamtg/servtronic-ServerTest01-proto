package com.devitron.servtronic.servicetest01.functions;

import com.devitron.servtronic.servicebase.annotations.ServiceMethod;
import com.devitron.servtronic.servicetest01.config.ServiceTest01Config;
import com.devitron.servtronic.servicetest01.messages.MessageSet01;
import org.springframework.beans.factory.annotation.Autowired;

public class TestFunctions01 {

    @Autowired
    private static ServiceTest01Config config;

    @ServiceMethod(name = "printhello")
    public static MessageSet01.PrintHelloReply printHello(MessageSet01.PrintHelloRequest request) {
        MessageSet01.PrintHelloReply reply = new MessageSet01.PrintHelloReply(request);

        reply.setFinalMessage(request.getFieldString() + " " + request.getFieldInteger() + " " + config.getMessage01());

        System.out.println("Hello. " + reply.getFinalMessage());

        return reply;
    }


}
