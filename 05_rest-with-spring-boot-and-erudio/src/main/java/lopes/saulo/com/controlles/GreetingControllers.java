package lopes.saulo.com.controlles;

import lopes.saulo.com.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControllers {

    private static final String template= "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    //http://localhost:8080/greeting?name=saulo
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "Word")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}
