package net.ericwubbo.preportfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping("all")
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }

    @GetMapping("seed")
    public void seedMessage() {
        var message = new Message("Winston Churchill", "Writing your own fourth full-stack project is still tricky!");
        messageRepository.save(message);
    }
}
