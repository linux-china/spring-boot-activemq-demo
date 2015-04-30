package net.mvnsearch;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * message receiver
 *
 * @author linux_china
 */
@Component
public class MessageReceiver {
    @JmsListener(destination = "DLQ")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
