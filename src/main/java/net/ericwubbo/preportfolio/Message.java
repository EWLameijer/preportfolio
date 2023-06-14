package net.ericwubbo.preportfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue
    Long id;

    private Message() {
    } // for Spring DI

    private String sender;

    private String contents;

    public Message(String sender, String contents) {
        this.sender = sender;
        this.contents = contents;
    }

    public String getSender() {
        return sender;
    }

    public String getContents() {
        return contents;
    }
}
