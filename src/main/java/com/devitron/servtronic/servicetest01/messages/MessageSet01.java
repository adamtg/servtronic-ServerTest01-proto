package com.devitron.servtronic.servicetest01.messages;

import com.devitron.servtronic.messages.MessageReply;
import com.devitron.servtronic.messages.MessageRequest;
import com.devitron.servtronic.servicetest01.config.ServiceTest01Config;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSet01 {

    public static class PrintHelloRequest extends MessageRequest {

        private String fieldString;
        private Integer fieldInteger;


        public PrintHelloRequest(String source) {
            super("servertest01","PrintHello");
        }

        public String getFieldString() {
            return fieldString;
        }

        public void setFieldString(String fieldString) {
            this.fieldString = fieldString;
        }

        public Integer getFieldInteger() {
            return fieldInteger;
        }

        public void setFieldInteger(Integer fieldInteger) {
            this.fieldInteger = fieldInteger;
        }
    }

    public static class PrintHelloReply extends MessageReply {

        private String finalMessage = "";

        public PrintHelloReply(PrintHelloRequest request) {
            super(request);
        }

        public String getFinalMessage() {
            return finalMessage;
        }

        public void setFinalMessage(String finalMessage) {
            this.finalMessage = finalMessage;
        }
    }

}

