package com.yang.websocket.chapter4.data;

public class NewUserMessage extends BasicMessage {

    public NewUserMessage(String username) {
        super(USERNAME_MESSAGE, username);
    }

    public String getUsername() {
        return super.getData();
    }
}