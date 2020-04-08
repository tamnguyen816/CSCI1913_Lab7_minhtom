/*
Name: Minh Tam H Nguyen
Class: CSCI1913 LAB 7
Date: 03/24/2020
 */

public class Message {
    private String from;
    private String to;
    private String messageText;

    public Message(String from, String to, String messageText) {
        // Three argument constructor

        // Name of the person who sent the message
        this.from = from;

        // Name of the person who received the message
        this.to = to;

        // Message itself
        this.messageText = messageText;
    }

    public String getFrom() {
        // Return who sent the message
        return from;
    }

    public String getTo() {
        // Return who received the message
        return to; }

    public void setTo(String to) { this.to = to; }

    public String getMessage(){
        // Return the text of the message
        return messageText;
    }

    public void setMessage(String text){
        this.messageText = text;
    }

    public String toString(){
        String returnMessage = "Message from:" + from + " to: " + to + " Message " + messageText;
        return returnMessage;
    }
}


