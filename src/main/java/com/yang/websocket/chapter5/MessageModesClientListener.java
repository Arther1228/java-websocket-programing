
package com.yang.websocket.chapter5;

import javax.websocket.*;

public interface MessageModesClientListener {
    public void setConnected(boolean isConnected, CloseReason cr);
    public void reportMessage(String message);
    public void reportConnectionHealth(long millis);
}
