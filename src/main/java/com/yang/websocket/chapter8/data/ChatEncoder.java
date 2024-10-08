
package com.yang.websocket.chapter8.data;

import java.util.Iterator;
import javax.websocket.*;

public class ChatEncoder implements Encoder.Text<ChatMessage>  {
    public static final String SEPARATOR = ":";

    public void init(EndpointConfig config) {}
    public void destroy() {}
    
    @Override
    public String encode(ChatMessage cm) throws EncodeException {
        if (cm instanceof StructuredMessage) {
            String dataString = "";
            for (Iterator itr = ((StructuredMessage) cm).getList().iterator(); itr.hasNext(); ) {
                dataString = dataString + SEPARATOR + itr.next();
            }
            return cm.getType() + dataString;
        } else if (cm instanceof BasicMessage) {
            return cm.getType() + ((BasicMessage) cm).getData();
        } else {
            throw new EncodeException(cm, "Cannot encode messages of type: " + cm.getClass());
        }
    }
    
    
    
}
