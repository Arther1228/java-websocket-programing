package com.yang.websocket.chatpter3.client;


public class UIMain {

    public static void main(String args[]) {

        DrawingWindow wbw1 = new DrawingWindow("ws://localhost:8080/jwp/draw", 50, 10);
        DrawingWindow wbw2 = new DrawingWindow("ws://localhost:8080/jwp/draw", 500, 20);

    }
}

