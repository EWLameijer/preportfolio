package net.ericwubbo.preportfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("message")
    public Message getMessage() {
        var message = new Message("Wubbo", "Writing your own first full-stack project is tricky!");
        return message;
    }
}
