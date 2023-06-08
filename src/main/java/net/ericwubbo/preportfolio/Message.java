package net.ericwubbo.preportfolio;

public class Message {
    private String sender;
    
    private String contents;

    public Message(String sender, String contents) {
        this.sender = sender;
        this.contents = contents;
    }
}
