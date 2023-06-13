

package org.springframework.helloworld.model;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {

    private String message;
    
    public MessageStore() {
        message = "Hello Spring User";
    }

    public String getMessage() {
        return message;
    }

}
