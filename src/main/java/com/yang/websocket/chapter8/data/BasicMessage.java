package com.yang.websocket.chapter8.data;

abstract class BasicMessage extends ChatMessage {
    protected String dataString;

    BasicMessage(String type, String dataString) {
        super(type);
        this.dataString = dataString;
    }

    String getData() {
        return this.dataString;
    }
    
}
