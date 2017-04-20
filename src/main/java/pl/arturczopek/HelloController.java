package pl.arturczopek;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello, swagger!";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public void helloOnConsole() {
        System.out.println("Hello, swagger on console!");
    }

    @RequestMapping(value = "/bye/{name}", method = RequestMethod.DELETE)
    public void byePerson(@PathVariable String name) {
        System.out.println("Bye bye, " + name);
    }
}
