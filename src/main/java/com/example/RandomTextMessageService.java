package com.example;

import java.util.List;
import java.util.Random;

public class RandomTextMessageService implements MessageService {
    public final List<String> messages = List.of("Message 1",
            "Message 2", "Message 3", "Message 4",
            "Message 5", "Message 6", "Message 7",
            "Message 8", "Message 9", "Message 10");

    @Override
    public String getMessage() {
        return messages.get(new Random().nextInt(messages.size()));
    }
}
