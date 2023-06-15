package net.ericwubbo.preportfolio;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class Controller {

    @GetMapping("message")
    public String getMessage() {
        return "Writing your own first full-stack project is tricky!";
    }
}
