package com.yang.websocket.chapter4.data;


public class UserSignoffMessage extends BasicMessage {

    public UserSignoffMessage(String username) {
        super(SIGNOFF_REQUEST, username);
    }

    public String getUsername() {
        return super.getData();
    }


}
