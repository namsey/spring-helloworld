

package org.apache.spring.helloworld.controller;

import org.apache.spring.helloworld.model.MessageStore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Acts as a Spring MVC controller that responds
 * to a user action by setting the value
 * of the Message model class, and returns a String
 * result.
 * @author Bruce Phillips
 *
 */
@Controller
public class HelloWorldController {

    private static final long serialVersionUID = 1L;

    /**
     * The model class that stores the message
     * to display in the view.
     */
    private MessageStore messageStore;

    /*
     * Creates the MessageStore model object and 
     * returns success.  The MessageStore model
     * object will be available to the view.
     * (non-Javadoc)
     * @see org.springframework.web.bind.annotation.GetMapping
     */
    @GetMapping("/hello")
    public String execute(Model model) {
        messageStore = new MessageStore();
        model.addAttribute("messageStore", messageStore);
        
        return "success";
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
